package Graphs.Theory;
import java.util.ArrayList;

public class TarjansAlgorithm {

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Graph.Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        getBridge(graph, V);
        getAP(graph, V);
    }


    // Finding Articulation point
    // A vertex is an undirected connected graph in an articulation point (or cut vertex)
    // if removing it (and edges through it) disconnects graph
    public static void getAP(ArrayList<Graph.Edge>[] graph, int V){
        int[] dt = new int[V];
        int[] lowDT = new int[V];
        int time = 0;
        boolean[] vis = new boolean[V];
        boolean[] ap = new boolean[V]; // track articulation point

        for (int i = 0; i < V; i++) {
            if (!vis[i]){
                dfs2(graph, i, vis, dt, lowDT, time, -1, ap);
            }
        }

        for (int i = 0; i < V; i++) {
            if (ap[i]){
                System.out.println("AP : " + i);
            }
        }
        System.out.println();
    }

    public static void dfs2(ArrayList<Graph.Edge>[] graph, int curr, boolean[] vis, int[] dt, int[] lowDT, int time, int parent, boolean[] ap){
        vis[curr] = true;
        dt[curr] = lowDT[curr] = ++time;
        int children = 0;

        for (int i = 0; i < graph[curr].size(); i++) {
            Graph.Edge e = graph[curr].get(i);
            int neighbour = e.dest;

            if (parent == neighbour){
                continue;
            } else if (vis[neighbour]){
                lowDT[curr] = Math.min(lowDT[curr], dt[neighbour]);
            } else {
                dfs2(graph, neighbour, vis, dt, lowDT, time, curr, ap);
                lowDT[curr] = Math.min(lowDT[curr], lowDT[neighbour]);
                if (dt[curr] <= lowDT[neighbour] && parent != -1){
                    ap[curr] = true;
                }
                children++;
            }
        }

        if (parent == -1 && children >1){
            ap[curr] = true;
        }
    }


    // Bridges in Graph
    // Bridge is an edge whose deletion increases the graph's number of connected components.
    public static void getBridge(ArrayList<Graph.Edge>[] graph, int V){
        int[] dt = new int[V];
        int[] lowDT = new int[V];
        int time = 0;
        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]){
                dfs(graph, i, vis, dt, lowDT, time, -1);
            }
        }
    }

    public static void dfs(ArrayList<Graph.Edge>[] graph, int curr, boolean[] vis, int[] dt, int[] lowDT, int time, int parent){
        vis[curr] = true;
        dt[curr] = lowDT[curr] = ++time;

        for (int i = 0; i < graph[curr].size(); i++) {
            Graph.Edge e = graph[curr].get(i);
            if (e.dest == parent){
                continue;
            } else if (!vis[e.dest]) {
                dfs(graph, e.dest, vis, dt, lowDT, time, curr);
                lowDT[curr] = Math.min(lowDT[curr], lowDT[e.dest]);
                if (dt[curr] < lowDT[e.dest]){
                    System.out.println("Bridge is : " + curr + " --- " + e.dest);
                }
            } else {
                lowDT[curr] = Math.min(lowDT[curr], dt[e.dest]);
            }
        }
    }

    public static void createGraph(ArrayList<Graph.Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Graph.Edge>();
        }

        graph[0].add(new Graph.Edge(0, 1));
        graph[0].add(new Graph.Edge(0, 2));
        graph[0].add(new Graph.Edge(0, 3));

        graph[1].add(new Graph.Edge(1, 0));
        graph[1].add(new Graph.Edge(1, 2));

        graph[2].add(new Graph.Edge(2, 0));
        graph[2].add(new Graph.Edge(2, 1));

        graph[3].add(new Graph.Edge(3, 0));
        graph[3].add(new Graph.Edge(3, 4));
        graph[3].add(new Graph.Edge(3, 5));

        graph[4].add(new Graph.Edge(4, 3));
        graph[4].add(new Graph.Edge(4, 5));

        graph[5].add(new Graph.Edge(5, 3));
        graph[5].add(new Graph.Edge(5, 4));
    }

    public static void createGraph1(ArrayList<Graph.Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Graph.Edge>();
        }

        graph[0].add(new Graph.Edge(0, 1));
        graph[0].add(new Graph.Edge(0, 2));
        graph[0].add(new Graph.Edge(0, 3));

        graph[1].add(new Graph.Edge(1, 0));
        graph[1].add(new Graph.Edge(1, 2));

        graph[2].add(new Graph.Edge(2, 0));
        graph[2].add(new Graph.Edge(2, 1));

        graph[3].add(new Graph.Edge(3, 0));
        graph[3].add(new Graph.Edge(3, 4));

        graph[4].add(new Graph.Edge(4, 3));
    }
}
