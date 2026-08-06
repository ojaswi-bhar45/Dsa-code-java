package TOP_LEETCODE_75_QUESTION.Graph_Ques;

import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }

    public Node(int val, ArrayList<Node> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }
}

class Solution {

    // Stores Original Node -> Cloned Node
    private HashMap<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {

        // If graph is empty
        if (node == null) {
            return null;
        }

        // If node is already cloned, return it
        if (map.containsKey(node)) {
            return map.get(node);
        }

        // Create clone
        Node clone = new Node(node.val);

        // Store in HashMap
        map.put(node, clone);

        // Clone neighbors
        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }

        return clone;
    }
}

public class CloneGraph {

    // Print graph using BFS
    public static void printGraph(Node node) {

        if (node == null) {
            return;
        }

        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();

        queue.offer(node);
        visited.add(node);

        while (!queue.isEmpty()) {

            Node current = queue.poll();

            System.out.print("Node " + current.val + " -> ");

            for (Node neighbor : current.neighbors) {

                System.out.print(neighbor.val + " ");

                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create nodes
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        // Connect nodes
        node1.neighbors.add(node2);
        node1.neighbors.add(node4);

        node2.neighbors.add(node1);
        node2.neighbors.add(node3);

        node3.neighbors.add(node2);
        node3.neighbors.add(node4);

        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        System.out.println("Original Graph:");
        printGraph(node1);

        Solution solution = new Solution();

        Node clonedGraph = solution.cloneGraph(node1);

        System.out.println("\nCloned Graph:");
        printGraph(clonedGraph);
    }
}
