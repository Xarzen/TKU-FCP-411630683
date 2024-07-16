<<<<<<< HEAD
public class hm_09 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            System.out.println("元素 " + i + " 的值是: " + array[i]);
        }
=======
import java.util.Scanner;

public class hm_09 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入長方形的長度：");
        double length = scn.nextDouble();

        System.out.print("請輸入長方形的寬度：");
        double width = scn.nextDouble();

        scn.close();

        double area = length * width;

        System.out.println("長方形的面積為：" + area);
>>>>>>> 761827834366eab0f908b375c2b01400d1f3ab37
    }
}
