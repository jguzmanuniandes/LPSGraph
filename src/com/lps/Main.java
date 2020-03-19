package com.lps;

import com.lps.model.Graph;
import com.lps.model.GraphFactory;

public class Main {

    public static void main(String[] args) {

        Graph a = GraphFactory.getGraph();

        a.addNode("A");
        a.addNode("B");
        a.addNode("C");
        a.addNode("D");
        a.addNode("E");
        a.addNode("F");
        a.addNode("G");
        a.addNode("H");
        a.addNode("I");

        a.addEdge("A", "B");
        a.addEdge("B", "C");
        a.addEdge("C", "D");
        a.addEdge("D", "E");
        a.addEdge("D", "F");
        a.addEdge("E", "G");
        a.addEdge("F", "G");
        a.addEdge("G", "H");

        System.out.println("Traveling: " + a.travelGraph("A", "H"));
        System.out.println("Path between A and E? " + a.thereIsAPath("A", "E"));
        System.out.println("Path between F and A? " + a.thereIsAPath("F", "A"));
        System.out.println("Path between A and I? " + a.thereIsAPath("A", "I"));

    }
}
