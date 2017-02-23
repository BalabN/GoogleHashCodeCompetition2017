package Models;

import java.util.ArrayList;
import java.util.List;

public class DataCenter {

    private static DataCenter instance = new DataCenter();

    public static DataCenter getInstance() {
        if(instance == null) {
            instance = new DataCenter();
        }
        return instance;
    }

    private List<Video> videos = new ArrayList<>();
    private List<Endpoint> endpoints = new ArrayList<>();
    private List<CacheServer> css = new ArrayList<>();

    private DataCenter() {
    }

    private DataCenter(List<Video> videos) {
        this.videos = videos;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public void addVideo(Video video) {
        videos.add(video);
    }

    public List<Endpoint> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<Endpoint> endpoints) {
        this.endpoints = endpoints;
    }

    public void addEndpoint(Endpoint endpoint) {
        endpoints.add(endpoint);
    }

    public Endpoint getEndpoint(int endpointIndex) {
        return endpoints.stream().filter(endpoint -> endpoint.getIndex() == endpointIndex).findFirst().get();
    }

    public List<CacheServer> getCss() {
        return css;
    }

    public void setCss(List<CacheServer> css) {
        this.css = css;
    }

    public void addCs(CacheServer cs) {
        css.add(cs);
    }

    public CacheServer getCs(int index) {
        return css.stream().filter(cacheServer -> cacheServer.getIndex() == index).findFirst().get();
    }
}
