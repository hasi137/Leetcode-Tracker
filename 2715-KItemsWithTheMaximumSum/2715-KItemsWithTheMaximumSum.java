// Last updated: 11/07/2026, 12:32:12
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<=numOnes) return k;
        else if(k<=(numOnes + numZeros)) return numOnes;
        else{ int rem =k -(numOnes + numZeros );
            return numOnes - rem;
            }
        
    }
}