class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        // Key trick: we want to remove the element in the 'out-degree-edge' list
        // SO make sure we check is 'out-degree-edge' list still contains 'out-degree-edge' for each node

        Map<String, Queue<String>> adj = new HashMap<>();
        for (List<String> ticket : tickets){
            Queue<String> temp = adj.getOrDefault(ticket.get(0), new PriorityQueue<>());
            temp.offer(ticket.get(1));
            adj.put(ticket.get(0), temp);
        }

        List<String> path = new ArrayList<>();
        helper(adj, "JFK", path);

        return path.reversed();
    }

    public void helper(Map<String, Queue<String>> graph, String currNode, List<String> path){
        Queue<String> out = graph.getOrDefault(currNode, new LinkedList<>());

        while(!out.isEmpty()){
            String nextNode = out.poll();
            helper(graph, nextNode, path);
        }
        path.add(currNode);
    }
}
