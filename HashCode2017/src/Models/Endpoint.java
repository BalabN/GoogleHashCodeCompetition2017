package Models;

import java.util.List;
import java.util.Map;

public class Endpoint {

    private int latencyFromCS = 0;
    private int latencyFromDS = 0;

    private Map<Video, Integer> videoRequests;

    private List<CacheServer> cs;

    public Endpoint(int latencyFromCS, int latencyFromDS, Map<Video, Integer> videoRequests, List<CacheServer> cs) {
        this.latencyFromCS = latencyFromCS;
        this.latencyFromCS = latencyFromDS;
        this.videoRequests = videoRequests;
        this.cs = cs;
    }

    public int getLatencyFromCS() {
        return latencyFromCS;
    }

    public void setLatencyFromCS(int latencyFromCS) {
        this.latencyFromCS = latencyFromCS;
    }

    public int getLatencyFromDS() {
        return latencyFromDS;
    }

    public void setLatencyFromDS(int latencyFromDS) {
        this.latencyFromDS = latencyFromDS;
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
}
