public class Multi_dimensional {
    public static void main(String[] args) {
        // 2D array
        int[][] a = {
            {1, 2},
            {3, 4}
        };

        // 3D array
        int[][][] b = {
            {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
            {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}}
        };

        // 4D array
        int[][][][] c = {
            {
                {{1, 2, 3, 4}, {5, 6, 7, 8}},
                {{9, 10, 11, 12}, {13, 14, 15, 16}}
            }
        };

        // Printing 2D array
        System.out.println("2D Array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Printing 3D array
        System.out.println("\n3D Array:");
        for (int x = 0; x < b.length; x++) {
            for (int y = 0; y < b[x].length; y++) {
                for (int z = 0; z < b[x][y].length; z++) {
                    System.out.print(b[x][y][z] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Printing 4D array
        System.out.println("\n4D Array:");
        for (int r = 0; r < c.length; r++) {
            for (int g = 0; g < c[r].length; g++) {
                for (int h = 0; h < c[r][g].length; h++) {
                    for (int k = 0; k < c[r][g][h].length; k++) {
                        System.out.print(c[r][g][h][k] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }
}
