public class hm_17 {
    public static void main(String[] args) {

        int[][][] array = new int[2][2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    array[i][j][k] = i + j + k;
                }
            }
        }

        System.out.println("初始陣列:");
        printArray(array);

        int x = 1; 
        int y = 1; 
        int z = 1; 
        int newValue = 99;

        array[x][y][z] = newValue;

        System.out.println("修改後的陣列:");
        printArray(array);
    }

    public static void printArray(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
