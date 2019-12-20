package com.rifat.example.qrscanner.Model;

public class QRGeo {
    private String lat,lng,geo_place;

    public QRGeo() {
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getGeo_place() {
        return geo_place;
    }

    public void setGeo_place(String geo_place) {
        this.geo_place = geo_place;
    }
}
