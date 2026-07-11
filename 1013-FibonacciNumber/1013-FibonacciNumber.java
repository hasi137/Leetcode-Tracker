// Last updated: 11/07/2026, 12:35:16
class Solution {
    public int fib(int n) {
         if (n==0) return 0;
         if (n==1) return 1;
         int a =0;
         int b =1;
         int next=0;
         for(int i=1;i<n;i++){
            next = a+b;
            a=b;
            b=next;
         }
         return next;

         
    }
}