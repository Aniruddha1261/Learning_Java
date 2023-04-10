package Graphs.Questions;

import Graphs.Theory.Graph;

import java.util.ArrayList;
import java.util.Stack;

public class Q3_TopologicalSorting {
    /*
    Directed Acyclic Graph(DAG) is a directed graph with no cycles
    Topological sorting is used only for DAGs (not for non-DAGs)
    It is linear order of vertices such that every directed edge u -> v, the vertex u comes before v in the order
     */
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Graph.Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        topSort(graph, V);
    }

    public static void topSortUtil(ArrayList<Graph.Edge>[] graph, int curr, boolean[] vis, Stack<Integer> stack){
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Graph.Edge e = graph[curr].get(i);

            if (!vis[e.dest]){
                topSortUtil(graph, e.dest, vis, stack);
            }
        }
        stack.push(curr);
    }

    public static void topSort(ArrayList<Graph.Edge>[] graph, int V){
        boolean[] vis = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!vis[i]){
                topSortUtil(graph, i, vis, stack);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }

    public static void createGraph(ArrayList<Graph.Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Graph.Edge>();
        }

        graph[2].add(new Graph.Edge(2, 3));

        graph[3].add(new Graph.Edge(3, 1));

        graph[4].add(new Graph.Edge(4, 0));
        graph[4].add(new Graph.Edge(4, 0));

        graph[5].add(new Graph.Edge(5, 0));
        graph[5].add(new Graph.Edge(5, 2));

        /*
                 5         4
                 | \     / |
                 |  \   /  |
                 2    0    1
                  \       /
                   \     /
                      3
         */
    }
}
