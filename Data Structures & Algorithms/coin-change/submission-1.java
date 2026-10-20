class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0; 
        }
        int res = 0; 
        Queue<Integer> q = new ArrayDeque<>();
        q.add(0);
        boolean[] seen = new boolean[amount + 1];
        seen[0] = true; 
        int min = 0; 
        while (!q.isEmpty()) {
            min++; 
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int curr = q.poll();
                for (int coin : coins) {
                    int next = coin + curr; 
                    if (amount == next) return min;
                    if (next > amount || seen[next]) continue; 
                    q.add(next);
                    seen[next] = true; 
                }
            }
        }
        return -1; 
    }
}
