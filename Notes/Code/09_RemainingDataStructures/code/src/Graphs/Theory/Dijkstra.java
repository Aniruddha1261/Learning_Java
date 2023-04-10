package Graphs.Theory;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Graph.Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        dijkstra(graph, 0, V);
    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;

        public Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.dist - p2.dist; // ascending order
//            return p2.dist - this.dist; // descending order
        }
    }

    // O(E + ElogV)
    public static void dijkstra(ArrayList<Graph.Edge>[] graph, int src, int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] dist = new int[V];
        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        pq.add(new Pair(src, 0));

        // bfs
        while (!pq.isEmpty()){
            Pair curr = pq.remove(); // shortest distance pair
            if (!vis[curr.node]){
                vis[curr.node] = true;

                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Graph.Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if (dist[u] + e.wt < dist[v]){
                        dist[v] = dist[u] + e.wt;
                    }
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }

        for (int i = 0; i < V; i++) {
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

        graph[1].add(new Graph.Edge(1, 3, 7));
        graph[1].add(new Graph.Edge(1, 2, 1));

        graph[2].add(new Graph.Edge(2, 4, 3));

        graph[3].add(new Graph.Edge(3, 5, 1));

        graph[4].add(new Graph.Edge(4, 3, 2));
        graph[4].add(new Graph.Edge(4, 5, 5));
    }
}
