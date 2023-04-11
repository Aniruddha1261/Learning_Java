package Graphs.Theory;
import java.util.ArrayList;
import java.util.PriorityQueue;

        // MST (Minimum spanning Tree)
/*
       A minimum spanning tree (MST) is a subset of the edges of a connected,
       edge-weighted undirected graph that connects all the vertices together,
       without any cycles and with the minimum possible total edge weight.
       - Subgraph(MST)
       - Vertices all included
       - Connected
       - Edge Weight minimum
 */
public class PrimsAlgorithm {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Graph.Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        primsAlgo(graph, V, 0);

        int V2 = 7;
        ArrayList<Graph.Edge>[] graph2 = new ArrayList[V2];
        createGraph1(graph2);
        primsAlgo(graph2, V2, 0);

    }

    public static void primsAlgo(ArrayList<Graph.Edge>[] graph, int V, int src){  // O(E*logE)
        PriorityQueue<Pair> pq = new PriorityQueue<>();  // node, cost
        boolean[] vis = new boolean[V];
        pq.add(new Pair(src, 0));

        int mstCost = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (!pq.isEmpty()){
            Pair curr = pq.remove();
            if (!vis[curr.node]){
                vis[curr.node] = true;
                mstCost += curr.cost;
                list.add(curr.cost);

                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Graph.Edge e = graph[curr.node].get(i);
                    if (!vis[e.dest]){
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
        }
        System.out.println(list);
        System.out.println("min cost = " + mstCost);
    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int cost;

        public Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost; // ascending order
        }
    }

    public static void createGraph(ArrayList<Graph.Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Graph.Edge>();
        }

        graph[0].add(new Graph.Edge(0, 1, 10));
        graph[0].add(new Graph.Edge(0, 2, 15));
        graph[0].add(new Graph.Edge(0, 3, 30));

        graph[1].add(new Graph.Edge(1, 0, 10));
        graph[1].add(new Graph.Edge(1, 3, 40));

        graph[2].add(new Graph.Edge(2, 0, 15));
        graph[2].add(new Graph.Edge(2, 3, 50));

        graph[3].add(new Graph.Edge(3, 1, 40));
        graph[3].add(new Graph.Edge(3, 2, 50));
    }

    public static void createGraph1(ArrayList<Graph.Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Graph.Edge>();
        }

        graph[0].add(new Graph.Edge(0, 1, 7));
        graph[0].add(new Graph.Edge(0, 3, 5));

        graph[1].add(new Graph.Edge(1, 0, 7));
        graph[1].add(new Graph.Edge(1, 2, 8));
        graph[1].add(new Graph.Edge(1, 3, 9));
        graph[1].add(new Graph.Edge(1, 4, 7));

        graph[2].add(new Graph.Edge(2, 1, 8));
        graph[2].add(new Graph.Edge(2, 4, 5));

        graph[3].add(new Graph.Edge(3, 0, 5));
        graph[3].add(new Graph.Edge(3, 1, 9));
        graph[3].add(new Graph.Edge(3, 4, 15));
        graph[3].add(new Graph.Edge(3, 5, 6));

        graph[4].add(new Graph.Edge(4, 1, 7));
        graph[4].add(new Graph.Edge(4, 2, 5));
        graph[4].add(new Graph.Edge(4, 3, 15));
        graph[4].add(new Graph.Edge(4, 5, 8));
        graph[4].add(new Graph.Edge(4, 6, 9));

        graph[5].add(new Graph.Edge(5, 3, 6));
        graph[5].add(new Graph.Edge(5, 4, 8));
        graph[5].add(new Graph.Edge(5, 6, 11));

        graph[5].add(new Graph.Edge(6, 4, 9));
        graph[5].add(new Graph.Edge(6, 5, 11));
    }
}
