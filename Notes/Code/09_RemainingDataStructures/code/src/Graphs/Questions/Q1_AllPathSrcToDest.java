package Graphs.Questions;

import Graphs.Theory.Graph;

import java.util.ArrayList;

// Q1: for a given source(src) and target(tar), print all paths that exist from src to tar.
public class Q1_AllPathSrcToDest {

    public static void main(String[] args) {
        int V = 7;
        /*
               1 --- 3
             /       | \
            0        |   5 -- 6     // O(V + N)
             \       | /
               2 --- 4
         */
        ArrayList<Graph.Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        int src = 0, tar = 5;
        printAllPath(graph, new boolean[V], src, "0", tar);
        System.out.println("Hello");
    }


    // Modified DFS  O(V^V)
    public static void printAllPath(ArrayList<Graph.Edge>[] graph, boolean vis[], int curr, String path, int tar){
        if (curr == tar){
            System.out.println(path);
            return;
        }

        for (int i = 0; i < graph[curr].size(); i++) {
            Graph.Edge e = graph[curr].get(i);
            if (!vis[e.dest]){
                vis[curr] = true;
                printAllPath(graph, vis, e.dest, path + e.dest, tar);
                vis[curr] = false;
            }
        }
    }

    public static void createGraph(ArrayList<Graph.Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Graph.Edge>();
        }

        graph[0].add(new Graph.Edge(0, 1));
        graph[0].add(new Graph.Edge(0, 2));

        graph[1].add(new Graph.Edge(1, 0));
        graph[1].add(new Graph.Edge(1, 3));

        graph[2].add(new Graph.Edge(2, 0));
        graph[2].add(new Graph.Edge(2, 4));

        graph[3].add(new Graph.Edge(3, 1));
        graph[3].add(new Graph.Edge(3, 4));
        graph[3].add(new Graph.Edge(3, 5));

        graph[4].add(new Graph.Edge(4, 2));
        graph[4].add(new Graph.Edge(4, 3));
        graph[4].add(new Graph.Edge(4, 5));

        graph[5].add(new Graph.Edge(5, 3));
        graph[5].add(new Graph.Edge(5, 4));
        graph[5].add(new Graph.Edge(5, 6));

        graph[6].add(new Graph.Edge(6, 5));
    }
}
