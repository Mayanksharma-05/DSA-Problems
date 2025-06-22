class Solution {
    public void setZeroes(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        boolean zeroRow = false;
        boolean zerocol = false;

        // Check if 0th row has any zeros
        for (int j = 0; j < n; j++) {
            if (arr[0][j] == 0) {
                zeroRow = true;
                break;
            }
        }

        // Check if 0th column has any zeros
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                zerocol = true;
                break;
            }
        }

        // Mark rows and columns for zeroing by marking 0th row and 0th column
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // Zero out the rows based on the markers in the 0th row
        for (int j = 1; j < n; j++) {
            if (arr[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }

        // Zero out the columns based on the markers in the 0th column
        for (int i = 1; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        // Zero out the 0th row if necessary
        if (zeroRow) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }

        // Zero out the 0th column if necessary
        if (zerocol) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }
    }
}
