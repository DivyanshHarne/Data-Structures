import java.util.ArrayList;
import java.util.List;

public class PassTheBall {

    public static int passTheBall(int n, int p, int x) {
        // Create an adjacency list to represent the graph of player connections
        List<List<Integer>> graph = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build the graph based on divisibility condition
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != j && (i % j == 0 || j % i == 0)) {
                    graph.get(i).add(j);
                }
            }
        }

        // Perform Depth First Search to count paths
        int[] count = new int[1]; // Use an array to allow modification within the recursive function
        boolean[] visited = new boolean[n + 1];
        dfs(graph, p, p, x, count, visited);

        return count[0];
    }

    private static void dfs(List<List<Integer>> graph, int currPlayer, int startPlayer, int movesLeft, int[] count, boolean[] visited) {
        if (movesLeft == 0) {
            if (currPlayer == startPlayer) {
                count[0]++; // Increment count if back to starting player
            }
            return;
        }

        visited[currPlayer] = true; // Mark current player as visited

        for (int nextPlayer : graph.get(currPlayer)) {
            if (!visited[nextPlayer]) { // Avoid revisiting the same player in the same call stack
                dfs(graph, nextPlayer, startPlayer, movesLeft - 1, count, visited);
            }
        }

        visited[currPlayer] = false; // Unmark current player after exploring all paths
    }

    public static void main(String[] args) {
        // Test Case 1
        int n1 = 3, p1 = 2, x1 = 2;
        System.out.println("Test Case 1: " + passTheBall(n1, p1, x1)); // Expected Output: 1

        // Test Case 2
        int n2 = 4, p2 = 3, x2 = 3;
        System.out.println("Test Case 2: " + passTheBall(n2, p2, x2)); // Expected Output: 2

        // Test Case 3
        int n3 = 5, p3 = 1, x3 = 4;
        System.out.println("Test Case 3: " + passTheBall(n3, p3, x3)); // Expected Output: 5

        // Test Case 4
        int n4 = 6, p4 = 4, x4 = 2;
        System.out.println("Test Case 4: " + passTheBall(n4, p4, x4)); // Expected Output: 0

        // Test Case 5
        int n5 = 3, p5 = 3, x5 = 1;
        System.out.println("Test Case 5: " + passTheBall(n5, p5, x5)); // Expected Output: 0
    }
}
