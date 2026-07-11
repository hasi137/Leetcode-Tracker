// Last updated: 11/07/2026, 12:32:40
class Solution {
public:
    int pivotInteger(int n) {
        for(int x =1;x<=n;x++){
            int ls=0;
            for(int i =1;i<=x;i++){
                ls+=i;              
            }
            int rs=0;
            for(int j =x;j<=n;j++){
                rs+=j;
            }
            if(ls==rs) return x;  
        }               
        return -1;
    }

};