import java.util.Random;

public class hm_11 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // 產生0到99之間的隨機整數
        }
        System.out.print("陣列中的值: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("陣列中的最大值是: " + max);
    }
}
