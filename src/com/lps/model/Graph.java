package com.lps.model;

import java.util.*;

public abstract class Graph {

    protected Map<Node, Map<Node, Integer>> adjVertices;
    protected boolean isDirected;
    protected TraversingStrategy traversingStrategy;

    public Graph(TraversingStrategy traversingStrategy, boolean isDirected) {
        this.adjVertices = new HashMap<>();
        this.traversingStrategy = traversingStrategy;
        this.isDirected = isDirected;
    }

    public void addNode(String label) {
        adjVertices.putIfAbsent(new Node(label), new HashMap<>());
    }

    public abstract void addEdge(String labelA, String labelB, int weight);

    public abstract void addEdge(String labelA, String labelB);

    public Set<Node> travelGraph(String a, String b) {
        return traversingStrategy.traversalGraph(this, a, b);
    }

    public boolean thereIsAPath(String a, String b) {
        return traversingStrategy.thereIsAPathBetweenAandB(this, a ,b);
    }

}
