public class GraphDemo {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        System.out.println("Adding edges: 0-1, 0-2, 1-3, 1-4, 2-4");
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);

        graph.bfs(0);
        graph.dfs(0);
    }
}
