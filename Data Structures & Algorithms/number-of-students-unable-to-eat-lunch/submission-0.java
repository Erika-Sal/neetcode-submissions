class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circle = 0; 
        int square = 0; 
        for (int i = 0; i < students.length; i++) {
            if(students[i] == 0) {
                circle++; 
            } else{
                square++; 
            }
        }

        for (int i = 0; i < sandwiches.length; i++) {
            if(sandwiches[i] == 0) {
                if(circle == 0) {
                    return square; 
                } else {
                    circle--; 
                }
            } else {
                if(square == 0) {
                    return circle; 
                } else {
                    square--; 
                }
            }
        }
        return 0; 
    }
}