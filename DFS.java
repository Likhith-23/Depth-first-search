import java.util.LinkedList;
public class DFS {
    private LinkedList<Integer> adjlist[];
    private boolean visited[];
    public DFS(int vertices) {
        adjlist = new LinkedList[vertices];
        visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            adjlist[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjlist[src].add(dest);
    }

    public void dfs(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        for (int neighbor : adjlist[vertex]) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 10;
        DFS graph = new DFS(vertices);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        graph.addEdge(3, 7);
        graph.addEdge(4, 8);
        graph.addEdge(5, 9);
        System.out.println("Depth First Search traversal starting from vertex 0:");
        graph.dfs(0);
    }
}
