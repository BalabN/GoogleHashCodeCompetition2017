package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Endpoint {

    private int index;
    private int latencyFromDC = 0;

    private Map<Video, Integer> videoRequests = new HashMap<>();
    
    private List<Pair<CacheServer, Integer>> css = new ArrayList<>();

    public Endpoint(){
    }

    public Endpoint(int latencyFromDC, Map<Video, Integer> videoRequests, List<Pair<CacheServer, Integer>> css) {
        this.latencyFromDC = latencyFromDC;
        this.videoRequests = videoRequests;
        this.css = css;
    }

    public int getLatencyFromDC() {
        return latencyFromDC;
    }

    public void setLatencyFromDS(int latencyFromDC) {
        this.latencyFromDC = latencyFromDC;
    }

    public Map<Video, Integer> getVideoRequests() {
        return videoRequests;
    }

    public void setVideoRequests(Map<Video, Integer> videoRequests) {
        this.videoRequests = videoRequests;
    }

    public List<Pair<CacheServer, Integer>> getCss() {
        return css;
    }

    public void setCs(List<Pair<CacheServer, Integer>> css) {
        this.css = css;
    }

    public void addCs(Pair<CacheServer, Integer> pair) {
        css.add(pair);
    }

    public Pair<CacheServer, Integer> getCs(int index) {
        return css.stream().filter(cs -> cs.first.getIndex() == index).findFirst().get();
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void addVideoRequest(Video video, int requests) {
        videoRequests.put(video, requests);
    }

    public int getReqForVideo(Video video) {
        videoRequests.get(video);
    }
}
