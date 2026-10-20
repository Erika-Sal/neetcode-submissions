/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    public int findCelebrity(int n) {
        for (int i = 0; i < n; i++) {
            if(isCelebrity(i, n)) {
                return i; 
            }
        }
        return -1; 
    }

    public boolean isCelebrity(int curr, int n){
        for (int i = 0; i < n; i++) {
            if (i == curr) continue; 
            if (!knows(i, curr)) return false; 
            if (knows(curr, i)) return false; 
        }
        return true; 
    }
}
