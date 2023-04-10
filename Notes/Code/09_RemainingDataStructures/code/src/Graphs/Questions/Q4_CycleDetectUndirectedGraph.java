package Graphs.Questions;

import Graphs.Theory.Graph;

import java.util.ArrayList;

public class Q4_CycleDetectUndirectedGraph {
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Graph.Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(isCycleUndirected(graph, new boolean[V], 0, -1));
    }

    public static boolean isCycleUndirected(ArrayList<Graph.Edge>[] graph, boolean[] vis, int curr, int parent){
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Graph.Edge e = graph[curr].get(i);
            // neighbour = e.dest
            if (vis[e.dest] && e.dest != parent){
                return true;
            } else if (!vis[e.dest]){
                if (isCycleUndirected(graph, vis, e.dest, curr)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void createGraph(ArrayList<Graph.Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Graph.Edge>();
        }

        graph[0].add(new Graph.Edge(0, 1));
        graph[0].add(new Graph.Edge(0, 4));

        graph[1].add(new Graph.Edge(1, 0));
        graph[1].add(new Graph.Edge(1, 2));
        graph[1].add(new Graph.Edge(1, 4));

        graph[2].add(new Graph.Edge(2, 1));
        graph[2].add(new Graph.Edge(2, 3));

        graph[3].add(new Graph.Edge(3, 2));

        graph[4].add(new Graph.Edge(4, 0));
        graph[4].add(new Graph.Edge(4, 1));
        graph[4].add(new Graph.Edge(4, 5));

        graph[5].add(new Graph.Edge(5, 4));
    }
}
