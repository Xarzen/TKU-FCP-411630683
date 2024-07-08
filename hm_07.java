import java.util.Scanner;

public class hm_07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入圓的半徑: ");
        double radius = scn.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("圓的面積是: " + area);

        scn.close();
    }
}
