class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> perms = new ArrayList<>();
        perms.add(new ArrayList<>());

        for (int n : nums) {
            List<List<Integer>> nextPerms = new ArrayList<>();
            for (List<Integer> p : perms) {
                for (int i = 0; i <= p.size(); i++) {
                    List<Integer> curr = new ArrayList<>(p);
                    curr.add(i, n);
                    nextPerms.add(curr);
                }

                perms = nextPerms; 
            }
        }

        return perms; 
    }
}
