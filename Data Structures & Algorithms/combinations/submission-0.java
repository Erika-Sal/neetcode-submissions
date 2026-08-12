class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> currSet = new ArrayList<>();
        helper(1, n, k, currSet, res);
        return res; 
    }

    public void helper(int i, int n, int k, List<Integer> currSet, List<List<Integer>> res) {
        if (currSet.size() == k) {
            res.add(new ArrayList<>(currSet));
            return; 
        }

        if(i > n) {
            return; 
        }

        for (int j = i; j <= n; j++) {
            currSet.add(j);
            helper(j + 1, n, k, currSet, res);
            currSet.remove(currSet.size() - 1);
        }
    }
}