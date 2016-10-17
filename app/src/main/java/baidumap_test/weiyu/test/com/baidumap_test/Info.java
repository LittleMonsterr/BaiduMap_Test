package baidumap_test.weiyu.test.com.baidumap_test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/17.
 */
public class Info implements Serializable {

    private double latitude;
    private double longtitude;
    private int ingId;
    private String name;
    private String distance;
    private int zan;

    public static List<Info> infos = new ArrayList<Info>();

    static {
        infos.add(new Info(114.5345,22.455,R.drawable.mm9593,"美少女战士","距离200m",89) );
        infos.add(new Info(114.45,22.09,R.drawable.mm9825,"奥特曼打小怪兽","距离100m",133) );
        infos.add(new Info(113.9345,22.33,R.drawable.mm20049,"吃饭睡觉打豆豆","距离280m",8) );
    }

    public Info(double latitude, double longtitude, int ingId, String name, String distance, int zan) {
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.ingId = ingId;
        this.name = name;
        this.distance = distance;
        this.zan = zan;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }

    public int getIngId() {
        return ingId;
    }

    public void setIngId(int ingId) {
        this.ingId = ingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public int getZan() {
        return zan;
    }

    public void setZan(int zan) {
        this.zan = zan;
    }
}
