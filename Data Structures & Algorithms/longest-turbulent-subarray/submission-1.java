class Solution {
    public int maxTurbulenceSize(int[] arr) {

       int cnt = 0; 
       int res = 0; 
       int sign = -1; 
       for (int i = 0; i < arr.length - 1; i++) {
         if(arr[i] > arr[i + 1]) {
            cnt = (sign == 0) ? cnt + 1 : 1; 
            sign = 1; 
         } else if (arr[i] < arr[i+1]) {
            cnt = (sign == 1) ? cnt + 1 : 1;
            sign = 0; 
         } else {
            cnt = 0; 
            sign = -1; 
         }
         res = Math.max(res, cnt);
       }
       return res + 1; 
    }
}