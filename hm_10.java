<<<<<<< HEAD
public class hm_10 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        System.out.println("陣列元素的總和是: " + sum);
    }
}
=======
import java.util.Scanner;

public class hm_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("請輸入華氏溫度: ");
        double fahrenheit = scn.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("攝氏溫度為: " + celsius);
    }
}
>>>>>>> 761827834366eab0f908b375c2b01400d1f3ab37
