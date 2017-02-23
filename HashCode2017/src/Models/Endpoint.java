package Models;

import java.util.List;
import java.util.Map;

public class Endpoint {

    private int index;
    private int latencyFromCS = 0;
    private int latencyFromDC = 0;

    private Map<Video, Integer> videoRequests;

    private List<CacheServer> cs;

    public Endpoint(int latencyFromCS, int latencyFromDC, Map<Video, Integer> videoRequests, List<CacheServer> cs) {
        this.latencyFromCS = latencyFromCS;
        this.latencyFromDC = latencyFromDC;
        this.videoRequests = videoRequests;
        this.cs = cs;
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

    public List<CacheServer> getCs() {
        return cs;
    }

    public void setCs(List<CacheServer> cs) {
        this.cs = cs;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
