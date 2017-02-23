import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

        System.out.println(dc.getEndpoints().size());
        for (Endpoint endpoint : dc.getEndpoints()) {
            if (endpoint.getCss().size() == 0) {
                continue;
            }
//            for (Map.Entry<Video, Integer> entry : endpoint.getVideoRequests().entrySet()) {
//                System.out.println(entry.getKey() + "/" + entry.getValue());
                CacheServer minCs = getSmallestLatency(endpoint);
                System.out.println("Smallest latency server index = " + minCs.getIndex());
                System.out.println("Smallest latency endpoint = " + endpoint.getIndex());
//            }
        }

//        if (dc.getCs(csData.first.getIndex()).canAddVideo(entry.getKey())) {
//
//        } else {
//            continue;
//        }
    }

    public static CacheServer getSmallestLatency(Endpoint endpoint) {
        List<Integer> latencies = new ArrayList<>();
        List<CacheServer> css = new ArrayList<>();

        for (Pair<CacheServer, Integer> csData : endpoint.getCss()) {
            latencies.add(csData.second);
            css.add(csData.first);
        }
        int minIndex = latencies.indexOf(Collections.min(latencies));
        return endpoint.getCss().get(minIndex).first;
    }
}
