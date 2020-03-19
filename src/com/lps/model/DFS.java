package com.lps.model;

import java.util.*;

public class DFS implements TraversingStrategy {

    @Override
    public Set<Node> traversalGraph(Graph g, String a, String b) {
        Set<Node> visited = new LinkedHashSet<>();
        ArrayDeque<Node> stack = new ArrayDeque<>();
        stack.push(new Node(a));
        while (!stack.isEmpty()) {
            Node vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (Node v : g.adjVertices.get(vertex).keySet()) {
                    stack.push(v);
                }
            }
        }
        return visited;
    }
}
