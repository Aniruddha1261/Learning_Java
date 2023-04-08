package Graphs.Theory;

import java.util.ArrayList;

public class DFS {

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
        boolean[] vis = new boolean[V];
        dfs(graph, 0, vis);
        System.out.println("Hello");

        /*   Disconnected components of graphs    // O(V + N)
               0 -- 1 -- 2
                  3 -- 4
         */
        // For disconnected components of graph
        ArrayList<Graph.Edge>[] graph1 = new ArrayList[5];
        createGraph1(graph1);
        boolean[] vis1 = new boolean[5];
        for (int i = 0; i < 5; i++) {
            if (!vis1[i]){
                dfs(graph1, i, vis1);
            }
        }
        System.out.println("Hello");
    }

    public static void dfs(ArrayList<Graph.Edge>[] graph, int curr, boolean[] vis){
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Graph.Edge e = graph[curr].get(i);
            if (!vis[e.dest]){
                dfs(graph, e.dest, vis);
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

    // For disconnected components of graph
    public static void createGraph1(ArrayList<Graph.Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Graph.Edge>();
        }

        graph[0].add(new Graph.Edge(0, 1));

        graph[1].add(new Graph.Edge(1, 0));
        graph[1].add(new Graph.Edge(1, 2));

        graph[2].add(new Graph.Edge(2, 1));

        graph[3].add(new Graph.Edge(3, 4));

        graph[4].add(new Graph.Edge(4, 3));
    }
}
