package by.javacourse.sp.matrixMultiplicator;

public class MatrixMult {
    public static void main(String[] args) {
        int[][] mA =
                        {{23,34,12},
                        {33,1,10},
                        {12,14,17},
                        {84,24,51},
                        {0,71,7}};

        int[][] mB =
                        {{10,65,34,55},
                        {33,45,12,81},
                        {45,43,12,0}};


        int m = mA.length;
        int n = mB[0].length;
        int o = mB.length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += mA[i][k] * mB[k][j];
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format("%6d ", res[i][j]);
            }
            System.out.println();
        }
    }
}
