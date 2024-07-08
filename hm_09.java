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
    }
}
