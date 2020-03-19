package com.lps.model;

import java.util.Set;

public interface TraversingStrategy {

    Set<Node> traversalGraph(Graph g, String a, String b);

    default boolean thereIsAPathBetweenAandB(Graph g, String a, String b) {
        return traversalGraph(g, a, b).contains(new Node(b));
    }

}
