class Solution {
    public int[] sumOfDistancesInTree(int N, int[][] edges) {
        Graph g = new Graph(N);
        int[] distance = new int[N];
        int[] count = new int[N];
        
        for (int i = 0; i < edges.length; i++) {
            g.addEdge(edges[i][0], edges[i][1]);
            g.addEdge(edges[i][1], edges[i][0]);
        }
 
        g.insertDistanceAndCount(0, distance, count, new boolean[N]);
        g.updateDistanceAndCount(0, distance, count, new boolean[N]);
        return distance;
        
    }
}

class Graph {
    int V;
    List<Integer>[] adjList;
    
    Graph(int V) {
        this.V = V;
        adjList = new List[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new ArrayList<>();
        }
    }
    
    void addEdge(int src, int des) {
        adjList[src].add(des);
    }
    
    void insertDistanceAndCount(int root, int[] d, int[] c, boolean[] v) {
        v[root] = true;
        c[root] = 1;
        for (int node : adjList[root]) {
            if (!v[node]) {
                insertDistanceAndCount(node, d , c, v);
                d[root] += d[node] + c[node];
                c[root] += c[node];
            }
        }
    }
    
    void updateDistanceAndCount(int root, int[] d, int[] c, boolean[] v) {
        v[root] = true;
        for (int node : adjList[root]) {
            if (!v[node]) {
                d[node] = d[root] - c[node] + (V - c[node]);
                updateDistanceAndCount(node, d, c, v);
            }
        }
    }
    
    int[] distanceSums() {
        int[] sums = new int[V];
        for (int i = 0; i < V; i++) {
            sums[i] = distanceSum(i, new boolean[V], 0);
        }
        return sums;
    }
    
    int distanceSum(int root, boolean[] visited, int sum) {
        int currSum = 0;
        visited[root] = true;
        for (int node : adjList[root]) {
            if (!visited[node]) {
                currSum += distanceSum(node, visited, sum + 1);   
            }
        }
        return sum + currSum;
    }
}
