import java.util.*;

public class ClosedFigures {
    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }
        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); 

        Map<Point, List<Point>> graph = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);

            graph.computeIfAbsent(p1, k -> new ArrayList<>()).add(p2);
            graph.computeIfAbsent(p2, k -> new ArrayList<>()).add(p1);
        }

        int closedFigures = countClosedFigures(graph);

        System.out.print(closedFigures);
    }

    private static int countClosedFigures(Map<Point, List<Point>> graph) {
        Set<Point> visited = new HashSet<>();
        int cycles = 0;

        for (Point point : graph.keySet()) {
            if (!visited.contains(point)) {
                if (dfs(graph, point, null, visited)) {
                    cycles++;
                }
            }
        }
        return cycles;
    }
    private static boolean dfs(Map<Point, List<Point>> graph, Point current, Point parent, Set<Point> visited) {
        visited.add(current);
        boolean hasCycle = false;

        for (Point neighbor : graph.getOrDefault(current, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                hasCycle |= dfs(graph, neighbor, current, visited);
            } else if (!neighbor.equals(parent)) {
                hasCycle = true; 
            }
        }

        return hasCycle;
    }
}