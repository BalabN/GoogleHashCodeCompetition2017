package Models;

import java.util.HashMap;
import java.util.Map;

public class Video {

    private int size = 0;
    private CacheServer cs = null;
    private DataCenter dc = DataCenter.getInstance();
    private Map<Endpoint, Integer> reqPerLocation = new HashMap<>();

    private int index;

    public Video(int size, CacheServer cs, Map<Endpoint, Integer> reqPerLocation) {
        this.size = size;
        this.cs = cs;
        this.reqPerLocation = reqPerLocation;
    }
    public Video(){
        
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public CacheServer getCs() {
        return cs;
    }

    public void setCs(CacheServer cs) {
        this.cs = cs;
    }
    
    public Map<Endpoint, Integer> getReqPerLocation() {
        return reqPerLocation;
    }

    public void setReqPerLocation(Map<Endpoint, Integer> reqPerLocation) {
        this.reqPerLocation = reqPerLocation;
    }

    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }

}
