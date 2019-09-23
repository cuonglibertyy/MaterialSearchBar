package com.example.materialsearchbar;

import com.example.materialsearchbar.model.Route;

import java.util.List;

public interface SearchDirectionListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> mapRoute);
}
