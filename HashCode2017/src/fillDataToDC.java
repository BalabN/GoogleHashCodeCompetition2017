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
	
	public void fillDataToDCfromFile(String fileName) throws IOException{
		DataCenter dc = DataCenter.getInstance();
		String input = readFile("Items/"+fileName);
		
		String[] inputArray = input.split("\n");
		
		
		//Basic data
		String[] params = inputArray[0].split(" ");
		
		int numberOfVideos = Integer.parseInt(params[0]);
		int numberOfEndpoints = Integer.parseInt(params[1]);
		int numberOfRequests = Integer.parseInt(params[2]);
		int numberOfCaches = Integer.parseInt(params[3]);
		int capacityOfCaches = Integer.parseInt(params[4]);
		
		int counterOfEndpoints = 0;
		int nextEndpointJump = 0;
		int counterOfRequests = 0;
		
		
		//Video sizes MB
		List<Video> videos = new ArrayList<Video>();
		
		for (String string : params[1].split(" ")) {
			Video video = new Video();
			video.setSize(Integer.parseInt(string));
			videos.add(video);
		}
		
		//endpoints
		int pointOfStartRequest = 0;
		while(counterOfEndpoints < numberOfEndpoints){
			Endpoint endpoint = new Endpoint();
			
			params = inputArray[2+nextEndpointJump].split(" ");
			
			endpoint.setLatencyFromDS(Integer.parseInt(params[0]));
			int NumberOfCahceConnections = Integer.parseInt(params[1]);
			
			int tmpCachceConnectionsCounter = 0;
			
			while(tmpCachceConnectionsCounter < NumberOfCahceConnections){
				params = inputArray[2+nextEndpointJump+1+tmpCachceConnectionsCounter].split(" ");
				
				CacheServer cacheserver = new CacheServer();
				cacheserver.setIndex(Integer.parseInt(params[0]));
				
				endpoint.addCs(new Pair<>(cacheserver,Integer.parseInt(params[1])));
				
				
				tmpCachceConnectionsCounter++;
			}
			
			nextEndpointJump = nextEndpointJump + tmpCachceConnectionsCounter;
		}
		
		//request
		while(counterOfRequests < numberOfRequests){
			
		}
		
	}
}
