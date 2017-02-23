import java.io.IOException;
import java.util.Map;

import Models.CacheServer;
import Models.DataCenter;
import Models.Endpoint;
import Models.Pair;
import Models.Video;

public class Main {

    public static void main(String[] args) {

        DataCenter dc = DataCenter.getInstance();

        try {
            fillDataToDC.fillDataToDCfromFile("me_at_the_zoo.in");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Endpoint endpoint : dc.getEndpoints()) {
            if (endpoint.getCss().size() == 0) {
                continue;
            }
            for (Map.Entry<Video, Integer> entry : endpoint.getVideoRequests().entrySet()) {
                System.out.println(entry.getKey() + "/" + entry.getValue());
                for (Pair<CacheServer, Integer> csData : endpoint.getCss()) {
                    
                }
            }
        }

//        if (dc.getCs(csData.first.getIndex()).canAddVideo(entry.getKey())) {
//
//        } else {
//            continue;
//        }
    }
}
