class Solution {

    public int minCost(int maxTime, int[][] edges, int[] passingFees) {

        int n = passingFees.length;
        List<ArrayList<int[]>> graph = new ArrayList(n);

        //minimum time needed to reach a vertex as there can be multiple roads 
        //connecting the same cities
        int[] minTime = new int[n];
        
        Arrays.fill(minTime, Integer.MAX_VALUE);

        for(int i=0; i<n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int[] edge : edges) {
            int u = edge[0], v = edge[1], t = edge[2];
            graph.get(u).add(new int[]{v, t});
            graph.get(v).add(new int[]{u, t});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{0, passingFees[0], 0});

        while(!pq.isEmpty()) {
            
            int[] curr = pq.poll();
            int u = curr[0], cost = curr[1], time = curr[2];

            //Avoid the longer road/route and break if time exceeds limit
            if(time >= minTime[u] || time > maxTime) continue;

            //found the solution
            if(u == n-1) return cost;

            //if a shorter alternative found
            minTime[u] = time;

            for(int[] adj : graph.get(u)) {
                int v = adj[0], t = adj[1];
                pq.offer(new int[]{v, cost + passingFees[v], time + t});
            }
        }

        return -1;
    }


}