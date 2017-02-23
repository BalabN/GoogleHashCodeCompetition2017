package Models;

import java.util.List;

public class DataCenter {
    private List<Video> videos;

    public DataCenter(List<Video> videos) {
        this.videos = videos;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }
}
