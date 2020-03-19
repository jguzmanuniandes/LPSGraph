package com.lps.model;

class NormalGraph extends Graph {

    public NormalGraph(TraversingStrategy traversingStrategy, boolean isDirected) {
        super(traversingStrategy, isDirected);
    }

    @Override
    public void addEdge(String labelA, String labelB, int weight) {
        throw new RuntimeException("Weight not supported for NormalGraph");
    }

    public void addEdge(String labelA, String labelB) {
        Node v1 = new Node(labelA);
        Node v2 = new Node(labelB);
        this.adjVertices.get(v1).put(v2, 1);
        if(!this.isDirected) {
            this.adjVertices.get(v2).put(v1, 1);
        }
    }
}
