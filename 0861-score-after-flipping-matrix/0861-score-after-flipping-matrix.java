class Solution {
    public int matrixScore(int[][] grid) {
        // first we filp the row
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == 0)
                        grid[i][j] = 1;
                    else
                        grid[i][j] = 0;
                }
            }
        }
        // flip the collum
;
        for (int i = 0; i < m; i++) {
                    int zero = 0;
                    int one = 0;
            for (int j = 0; j < n; j++) {
                if (grid[j][i] == 0)
                    zero++;
                else
                    one++;
            }
            if (zero > one) {
                for (int j = 0; j < n; j++) {
                    if (grid[j][i] == 0)
                        grid[j][i] = 1;
                    else
                        grid[j][i] = 0;
                }

            }
        }
        int pow=1;
        
        int ans=0;
        for(int i=m-1;i>=0;i--){
            int ones=0;
            for(int j=0;j<n;j++){
                if(grid[j][i]==1) ones++;

            }
            ans=ans+pow*ones;
            pow=pow*2;

        }
        return ans;

    }
}