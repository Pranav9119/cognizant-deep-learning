/**
 * Demo runner for Graph BFS and DFS traversal algorithms.
 */
public class GraphDemo {
    public static void main(String[] args) {
        // Create a graph with 5 vertices (0 to 4)
        Graph graph = new Graph(5);

        System.out.println("Adding edges: 0-1, 0-2, 1-3, 1-4, 2-4");
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);

        // Perform BFS
        graph.bfs(0);

        // Perform DFS
        graph.dfs(0);
    }
}
