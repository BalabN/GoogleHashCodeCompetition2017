package Models;

import java.util.List;

/**
 * Created by Nikola on 23.2.2017..
 */
public class CacheServer {
    private int maxSize = 0;
    List<Integer> video;

    public CacheServer(int maxSize, List<Integer> video){
        this.maxSize = maxSize;
        this.video = video;
    }

    public int getMaxSIze() {
        return maxSize;
    }

    public void setMaxSIze(int maxSIze) {
        this.maxSize = maxSIze;
    }

    public List<Integer> getVideo() {
        return video;
    }

    public void setVideo(List<Integer> video) {
        this.video = video;
    }
}
