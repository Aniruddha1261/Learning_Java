package Graphs.Theory;

import java.util.ArrayList;
import java.util.Stack;

public class KosarajusAlgorithm {

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Graph.Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        kosarajuAlgo(graph, V);
    }

    public static void kosarajuAlgo(ArrayList<Graph.Edge>[] graph, int V){
        // Step 1   -   O(V+E)
        Stack<Integer> s = new Stack<>();
        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]){
                topSort(graph, i, vis, s);
            }
        }

        // Step 2   -  O(V+E)
        ArrayList<Graph.Edge>[] transpose = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            transpose[i] = new ArrayList<Graph.Edge>();
            vis[i] = false;
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Graph.Edge e = graph[i].get(j); // e.src(I) --> e.dest
                transpose[e.dest].add(new Graph.Edge(e.dest, e.src));
            }
        }

        // Step 3   -   O(V+E)
        while (!s.isEmpty()){
            int curr = s.pop();
            if (!vis[curr]){
                dfs(transpose, curr, vis);
            }
            System.out.println();
        }
    }

    public static void dfs(ArrayList<Graph.Edge>[] graph, int curr, boolean[] vis){
        vis[curr] = true;
        System.out.print(curr + " ");

        for (int i = 0; i < graph[curr].size(); i++) {
            Graph.Edge e = graph[curr].get(i);
            if (!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void topSort(ArrayList<Graph.Edge>[] graph, int curr, boolean[] vis, Stack<Integer> s){
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Graph.Edge e = graph[curr].get(i);
            if (!vis[e.dest]){
                topSort(graph, e.dest, vis, s);
            }
        }

        s.push(curr);
    }

    public static void createGraph(ArrayList<Graph.Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Graph.Edge>();
        }

        graph[0].add(new Graph.Edge(0, 2));
        graph[0].add(new Graph.Edge(0, 3));

        graph[1].add(new Graph.Edge(1, 0));

        graph[2].add(new Graph.Edge(2, 1));

        graph[3].add(new Graph.Edge(3, 4));
    }
}
