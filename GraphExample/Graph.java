import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Adjacency List representation of an undirected Graph with Breadth First Search (BFS)
 * and Depth First Search (DFS) traversals.
 */
public class Graph {
    private final int vertices;
    private final List<List<Integer>> adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    /**
     * Adds an edge between two vertices (undirected).
     * Time Complexity: O(1).
     * Space Complexity: O(1).
     */
    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    /**
     * BFS traversal starting from a source vertex.
     * Time Complexity: O(V + E) where V is vertices, E is edges.
     * Space Complexity: O(V) for queue and visited array.
     */
    public void bfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        System.out.print("BFS starting from vertex " + startVertex + ": ");
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : adjList.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    /**
     * DFS traversal starting from a source vertex.
     * Time Complexity: O(V + E).
     * Space Complexity: O(V) recursive call stack depth.
     */
    public void dfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        System.out.print("DFS starting from vertex " + startVertex + ": ");
        dfsRec(startVertex, visited);
        System.out.println();
    }

    private void dfsRec(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adjList.get(vertex)) {
            if (!visited[neighbor]) {
                dfsRec(neighbor, visited);
            }
        }
    }
}
