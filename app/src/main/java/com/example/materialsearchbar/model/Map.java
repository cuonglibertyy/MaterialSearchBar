package com.example.materialsearchbar.model;

public class Map {
    int ID;
    String Normal;
    String Hybrid;
    String Stateline;

    public Map(int ID, String normal, String hybrid, String stateline) {
        this.ID = ID;
        Normal = normal;
        Hybrid = hybrid;
        Stateline = stateline;
    }

    public Map() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNormal() {
        return Normal;
    }

    public void setNormal(String normal) {
        Normal = normal;
    }

    public String getHybrid() {
        return Hybrid;
    }

    public void setHybrid(String hybrid) {
        Hybrid = hybrid;
    }

    public String getStateline() {
        return Stateline;
    }

    public void setStateline(String stateline) {
        Stateline = stateline;
    }
}
