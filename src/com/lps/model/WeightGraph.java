package com.lps.model;

class WeightGraph extends Graph {

    public WeightGraph(TraversingStrategy traversingStrategy, boolean isDirected) {
        super(traversingStrategy, isDirected);
    }

    public void addEdge(String labelA, String labelB, int weight) {
        Node v1 = new Node(labelA);
        Node v2 = new Node(labelB);
        this.adjVertices.get(v1).put(v2, weight);
        if(!this.isDirected) {
            this.adjVertices.get(v2).put(v1, weight);
        }
    }

    @Override
    public void addEdge(String labelA, String labelB) {
        throw new RuntimeException("Unweight edge not supported for WeightGraph");
    }


}
