package TOP_LEETCODE_75_QUESTION.Graph_Ques;
//https://leetcode.com/problems/course-schedule/


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {
    static class Solution{
        public boolean canfinish(int numCourses, int[][]prereq){
            // Create adjacency list
                List<List<Integer>> graph = new ArrayList<>();

                for (int i = 0; i < numCourses; i++) {
                    graph.add(new ArrayList<>());
                }

                // Indegree array
                int[] indegree = new int[numCourses];

                // Build graph
                for (int[] pre : prereq) {
                    int course = pre[0];
                    int prerequisite = pre[1];

                    graph.get(prerequisite).add(course);
                    indegree[course]++;
                }

                // Queue for courses with no prerequisites
                Queue<Integer> queue = new LinkedList<>();

                for (int i = 0; i < numCourses; i++) {
                    if (indegree[i] == 0) {
                        queue.offer(i);
                    }
                }

                int completedCourses = 0;

                // BFS (Topological Sort)
                while (!queue.isEmpty()) {

                    int current = queue.poll();
                    completedCourses++;

                    for (int neighbor : graph.get(current)) {
                        indegree[neighbor]--;

                        if (indegree[neighbor] == 0) {
                            queue.offer(neighbor);
                        }
                    }
                }

                return completedCourses == numCourses;
            }
        }

    public static void main(String[] args) {
        Solution solution = new Solution();

        //Test case1
        int numCourses1 = 2;
        int[][] prereq1 = {
                {1, 0}
        };

        System.out.println("Test Case 1:");
        System.out.println(solution.canfinish(numCourses1, prereq1));//Excepted output: true

        //Test case2
        int numCourses2 = 2;
        int[][] prereq2 = {
                {1,0},
                {0,1}
        };

        System.out.println("Test Case 2: ");
        System.out.println(solution.canfinish(numCourses2, prereq2));//Excepted output : false


        //Test Case 3
        int numCourses3 = 4;
        int[][] prereq3 = {
                {1, 0},
                {2, 0},
                {3, 1},
                {3, 2}
        };
        System.out.println("Test Case 3:");
        System.out.println(solution.canfinish(numCourses3, prereq3));//excepted output: true



    }
}
