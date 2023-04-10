package Graphs.Questions;

import Graphs.Theory.Graph;

import java.util.ArrayList;
public class Q2_CycleDetection {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Graph.Edge>[] graph = new ArrayList[V];
        createGraph(graph); // true
        ArrayList<Graph.Edge>[] graph1 = new ArrayList[V];
        createGraph1(graph1); // false

        boolean[] vis = new boolean[V];
        boolean[] rec = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]){
                boolean isCycle = isCycleDirected(graph, vis, i, rec);
                if (isCycle){
                    System.out.println(true);
                    break;
                }
            }
        }
    }

    public static boolean isCycleDirected(ArrayList<Graph.Edge>[] graph, boolean[] vis, int curr, boolean[] rec) {
        vis[curr] = true;
        rec[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Graph.Edge e = graph[curr].get(i);
            if (rec[e.dest]) {
                return true;
            } else if (!vis[e.dest]) {
                if (isCycleDirected(graph, vis, e.dest, rec)) {
                    return true;
                }
            }
        }
        rec[curr] = false;
        return false;
    }

    public static void createGraph(ArrayList<Graph.Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Graph.Edge>();
        }

        graph[0].add(new Graph.Edge(0, 2));

        graph[1].add(new Graph.Edge(1, 0));

        graph[2].add(new Graph.Edge(2, 3));

        graph[3].add(new Graph.Edge(3, 0));
    }

    public static void createGraph1(ArrayList<Graph.Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Graph.Edge>();
        }

        graph[0].add(new Graph.Edge(0, 2));
        graph[0].add(new Graph.Edge(0, 1));

        graph[1].add(new Graph.Edge(1, 3));

        graph[2].add(new Graph.Edge(2, 3));
    }
}
