package Models;

/**
 * Created by Nikola on 23.2.2017..
 */
//size integer
//integer cache
//
public class Video {
    private int size = 0;
    private int cs = 0;
    private int reqPerLocation = 0;

    public Video(int size, int cs, int reqPerLocation) {
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

    public int getCs() {
        return cs;
    }

    public void setCs(int cs) {
        this.cs = cs;
    }

    public int getReqPerLocation() {
        return reqPerLocation;
    }

    public void setReqPerLocation(int reqPerLocation) {
        this.reqPerLocation = reqPerLocation;
    }

}
