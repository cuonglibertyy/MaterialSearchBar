package com.example.materialsearchbar.model;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

public class Route {
    public Distance mapDistance;
    public Duration mapDuration;

    public String endAddress;
    public LatLng endLocation;
    public String startAddress;
    public LatLng startLocation;

    public List<LatLng> points;
}
