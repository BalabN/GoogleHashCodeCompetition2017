package Models;

import java.util.ArrayList;
import java.util.List;

public class CacheServer {

    private int maxSize = 0;
    private List<Video> videos = new ArrayList<>();

    private int index;
    
    public CacheServer(){
    	
    }

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
        if (getVideos().stream().filter(video1 -> video1 == video).count() == 0) {
            videos.add(video);
        }
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }

    public int getSize() {
        int size = 0;
        for (Video video : videos) {
            size += video.getSize();
        }
        return size;
    }

    public boolean canAddVideo(Video video) {
        return video.getSize() <= (maxSize - getSize());
    }
}
