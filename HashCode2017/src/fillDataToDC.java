import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Models.CacheServer;
import Models.DataCenter;
import Models.Endpoint;
import Models.Pair;
import Models.Video;

public class fillDataToDC {

    static String readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }

    public static void fillDataToDCfromFile(String fileName) throws IOException {
        DataCenter dc = DataCenter.getInstance();
        String input = readFile("Items/" + fileName);

        String[] inputArray = input.split("\n");

        //Basic data
        String[] params = inputArray[0].split(" ");

        int numberOfVideos = Integer.parseInt(params[0]);
        int numberOfEndpoints = Integer.parseInt(params[1]);
        int numberOfRequests = Integer.parseInt(params[2]);
        int numberOfCaches = Integer.parseInt(params[3]);
        int capacityOfCaches = Integer.parseInt(params[4]);

        for (int i = 0; i < numberOfCaches; i++) {
            CacheServer cs = new CacheServer();
            cs.setIndex(i);
            cs.setMaxSize(capacityOfCaches);
            dc.addCs(cs);
        }

        int counterOfEndpoints = 0;
        int nextEndpointJump = 0;
        int counterOfRequests = 0;

        //Video sizes MB
        String[] split = inputArray[1].split(" ");
        for (int i = 0; i < split.length; i++) {
            String string = split[i];
            Video video = new Video();
            video.setSize(Integer.parseInt(string));
            video.setIndex(i);
            dc.addVideo(video);
        }


        //endpoints
        while (counterOfEndpoints < numberOfEndpoints) {
            Endpoint endpoint = new Endpoint();
            endpoint.setIndex(counterOfEndpoints);

            params = inputArray[2 + nextEndpointJump].split(" ");

            endpoint.setLatencyFromDS(Integer.parseInt(params[0]));
            int NumberOfCahceConnections = Integer.parseInt(params[1]);

            int tmpCachceConnectionsCounter = 0;

            while (tmpCachceConnectionsCounter < NumberOfCahceConnections) {
                params = inputArray[2 + nextEndpointJump + 1 + tmpCachceConnectionsCounter].split(" ");

                CacheServer cacheserver = new CacheServer();
                cacheserver.setIndex(Integer.parseInt(params[0]));

                endpoint.addCs(new Pair<>(cacheserver, Integer.parseInt(params[1])));

                tmpCachceConnectionsCounter++;
            }

            nextEndpointJump = nextEndpointJump + tmpCachceConnectionsCounter + 1;
            counterOfEndpoints++;
            dc.addEndpoint(endpoint);
        }

		//request
		while(counterOfRequests < numberOfRequests){
			params = inputArray[2+nextEndpointJump+counterOfRequests].split(" ");

			Video video = dc.getVideo(Integer.parseInt(params[0]));
			
			dc.getEndpoint(Integer.parseInt(params[1])).addVideoRequest(video, Integer.parseInt(params[2]));
			

			counterOfRequests++;
		}
	}

}
