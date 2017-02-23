package Models;

import java.util.List;
import java.util.Map;

public class Endpoint {

    private int index;
    private int latencyFromCS = 0;
    private int latencyFromDC = 0;

    private Map<Video, Integer> videoRequests;
    
    private List<Pair<CacheServer, Integer>> css;

    public Endpoint(){
    }

    public Endpoint(int latencyFromCS, int latencyFromDC, Map<Video, Integer> videoRequests, List<Pair<CacheServer, Integer>> css) {
        this.latencyFromCS = latencyFromCS;
        this.latencyFromDC = latencyFromDC;
        this.videoRequests = videoRequests;
        this.css = css;
    }

    public int getLatencyFromCS() {
        return latencyFromCS;
    }

    public void setLatencyFromCS(int latencyFromCS) {
        this.latencyFromCS = latencyFromCS;
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

    public void addCs(CacheServer cs, int latencyFromCS) {
        css.add(new Pair<>(cs, latencyFromCS));
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
}
