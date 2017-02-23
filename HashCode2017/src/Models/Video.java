package Models;

public class Video {
    private int size = 0;
    private CacheServer cs = null;
    private DataCenter dc = DataCenter.getInstance();
    private int reqPerLocation = 0;

    public Video(int size, CacheServer cs, int reqPerLocation) {
        this.size = size;
        this.cs = cs;
        this.reqPerLocation = reqPerLocation;
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

    public int getReqPerLocation() {
        return reqPerLocation;
    }

    public void setReqPerLocation(int reqPerLocation) {
        this.reqPerLocation = reqPerLocation;
    }

}
