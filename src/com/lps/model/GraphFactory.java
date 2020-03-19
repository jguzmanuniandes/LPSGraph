package com.lps.model;

import com.lps.PropertyManager;

public class GraphFactory {

    public static Graph getGraph() {
        boolean isDirected = PropertyManager.getProperty("isDirected");
        boolean hasWeight = PropertyManager.getProperty("hasWeight");
        String travelStrategy = PropertyManager.getValueProperty("travel.strategy");
        TraversingStrategy traversingStrategy = travelStrategy.equals("dfs") ? new DFS() : new BFS();
        return hasWeight ? new WeightGraph(traversingStrategy, isDirected) : new NormalGraph(traversingStrategy, isDirected);
    }

}
