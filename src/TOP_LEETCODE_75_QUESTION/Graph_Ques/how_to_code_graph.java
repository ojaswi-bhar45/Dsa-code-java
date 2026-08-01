package TOP_LEETCODE_75_QUESTION.Graph_Ques;

import java.util.ArrayList;

public class how_to_code_graph {
    public static void main(String[] args) {
        int v = 4;

        //Step: 1 make the  adjancey list
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        //step: 2 create an empty list for each node
        for(int i = 0; i < v; i++){
            graph.add(new ArrayList<>());
        }

        //step: 3 Add undirected graph

        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(2);

        graph.get(2).add(0);
        graph.get(2).add(1);
        graph.get(2).add(3);

        graph.get(3).add(2);

        //Print the graph
        for(int i = 0 ; i < v ; i++){
            System.out.print(i + " -> ");

            for(int neighbour: graph.get(i)){
                System.out.print(neighbour + " ");
            }
            System.out.println();
        }

    }
}