package Models;

import java.util.List;

public class CacheServer {

    private int maxSize = 0;
    private List<Video> videos;

    public CacheServer(int maxSize, List<Video> videos){
        this.maxSize = maxSize;
        this.videos = videos;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
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
}
