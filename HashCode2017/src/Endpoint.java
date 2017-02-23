import java.util.List;
import java.util.Map;

public class Endpoint {

    private int latencyFromCS = 0;
    private int latencyFromDS = 0;

    Map<Integer, Integer> videoRequests;

    List<Integer> cs;

    public Endpoint(int latencyFromCS, int latencyFromDS, Map<Integer, Integer> videoRequests, List<Integer> cs) {
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

    public Map<Integer, Integer> getVideoRequests() {
        return videoRequests;
    }

    public void setVideoRequests(Map<Integer, Integer> videoRequests) {
        this.videoRequests = videoRequests;
    }

    public List<Integer> getCs() {
        return cs;
    }

    public void setCs(List<Integer> cs) {
        this.cs = cs;
    }
}
