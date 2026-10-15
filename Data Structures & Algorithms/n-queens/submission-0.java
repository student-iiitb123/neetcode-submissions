
class Solution {
    int x[] = {-1, 1, 0, 0, 1, -1, -1, 1};
    int y[] = {0, 0, -1, 1, 1, -1, 1, -1};

    boolean isValid(int row, int col, int n, int m) {
        return row >= 0 && row < n && col >= 0 && col < m;
    }

    boolean isSafe(char arr[][], int row, int col) {
       
        for (int k = 0; k < 8; k++) {
            int r = row + x[k];
            int c = col + y[k];

            while (isValid(r, c, arr.length, arr[0].length)) {
                if (arr[r][c] == 'Q') {
                    return false;
                }

                r += x[k];
                c += y[k];
            }
        }

        return true;
    }

    void solve(char arr[][], int n, int row,
               List<List<String>> ans) {

       
       if(row == n){
        List<String> board = new ArrayList<>();
        for(int i =0;i<n;i++){
            board.add(new String(arr[i]));
        }

        ans.add(board);
        return;

       }

        for (int col = 0; col < n; col++) {
            if (isSafe(arr, row, col)) {
                arr[row][col] = 'Q';
                solve(arr, n, row + 1, ans);
                arr[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        char arr[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], '.');
        }

        List<List<String>> ans = new ArrayList<>();

        solve(arr, n, 0, ans);

        return ans;
    }
}