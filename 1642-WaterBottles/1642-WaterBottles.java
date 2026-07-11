// Last updated: 11/07/2026, 12:33:43
class Solution {
    public int numWaterBottles(int NB ,int NE) {
        int drink = NB;
        int empty = NB;
        while(empty>=NE){
            int newD = empty/NE;
            drink+=newD;
            empty =(empty%NE)+newD;
        }
        return drink;
        

    }
}