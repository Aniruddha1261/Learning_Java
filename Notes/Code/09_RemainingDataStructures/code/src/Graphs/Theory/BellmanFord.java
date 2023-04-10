package Graphs.Theory;

import java.util.ArrayList;
import java.util.Arrays;

// use when the weights are negative
public class BellmanFord {

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Graph.Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        bellmanFord(graph, 0, V);
    }

    public static void bellmanFord(ArrayList<Graph.Edge>[] graph, int src, int V){
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) {
            if (i!= src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        for (int k = 0; k < V - 1; k++) { // O(V)

            // O(E)
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < graph[i].size(); j++) {
                    Graph.Edge e = graph[i].get(j);
                    int u = e.src;
                    int v = e.dest;

                    if (dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v]){
                        dist[v] = dist[u] + e.wt;
                    }
                }
            }
        }

        // detect -ve weight cycle
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Graph.Edge e = graph[i].get(j);
                int u = e.src;
                int v = e.dest;

                if (dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v]){
                    System.out.println("Negative wt cycle");
                }
            }
        }

        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void createGraph(ArrayList<Graph.Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Graph.Edge>();
        }

        graph[0].add(new Graph.Edge(0, 1, 2));
        graph[0].add(new Graph.Edge(0, 2, 4));

        graph[1].add(new Graph.Edge(1, 2, -4));

        graph[2].add(new Graph.Edge(2, 3, 2));

        graph[3].add(new Graph.Edge(3, 4, 4));

        graph[4].add(new Graph.Edge(4, 1, -1));
    }
}
