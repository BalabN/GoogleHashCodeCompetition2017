package Models;

import java.util.List;

public class DataCenter {

    public static DataCenter instance = new DataCenter();

    public static DataCenter getInstance() {
        return instance;
    }

    private List<Video> videos;
    private List<Endpoint> endpoints;

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
}
