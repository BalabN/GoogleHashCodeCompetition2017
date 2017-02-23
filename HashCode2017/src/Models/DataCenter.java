package Models;

import java.util.List;

public class DataCenter {
    List<Integer> videos;

    public DataCenter(List<Integer> videos) {
        this.videos = videos;
    }

    public List<Integer> getVideos() {
        return videos;
    }

    public void setVideos(List<Integer> videos) {
        this.videos = videos;
    }
}
