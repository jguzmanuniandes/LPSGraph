package com.lps.model;

import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import java.util.Set;

public class BFS implements TraversingStrategy {

    @Override
    public Set<Node> traversalGraph(Graph g, String a, String b) {
        Set<Node> visited = new LinkedHashSet<>();
        ArrayDeque<Node> queue = new ArrayDeque<>();
        Node nodea = new Node(a);
        queue.add(nodea);
        visited.add(nodea);
        while (!queue.isEmpty()) {
            Node vertex = queue.poll();
            for (Node v : g.adjVertices.get(vertex).keySet()) {
                if (!visited.contains(v)) {
                    visited.add(v);
                    queue.add(v);
                }
            }
        }
        return visited;
    }
}
