import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import Models.DataCenter;
import Models.Endpoint;
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
		
		//Video sizes MB
		for (String string : params[1].split(" ")) {
			dc.addVideo(new Video(Integer.parseInt(string),null,));
		}
		
		while(counterOfEndpoints < numberOfEndpoints){
			Endpoint endpoint = new Endpoint();
		}
		
		
		
	}
}
