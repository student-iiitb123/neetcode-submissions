class Solution {
    int x[] = {-1, 1, 0, 0};
    int y[] = {0, 0, -1, 1};

    boolean isValid(int i, int j, int n, int m) {
        return i >= 0 && i < n && j >= 0 && j < m;
    }

    boolean dfs(char[][] board, int i, int j, int n, int m,
                String word, int idx, boolean[][] visited) {

        
        if (idx == word.length()) {
            return true;
        }

      
        if (!isValid(i, j, n, m)
                || visited[i][j]
                || board[i][j] != word.charAt(idx)) {
            return false;
        }

        
        visited[i][j] = true;

      
        for (int k = 0; k < 4; k++) {
            int row = i + x[k];
            int col = j + y[k];

            if (dfs(board, row, col, n, m, word, idx + 1, visited)) {
                return true;
            }
        }

      
        visited[i][j] = false;

        return false;
    }

    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, i, j, n, m, word, 0, visited)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}