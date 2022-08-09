import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double pi = (double) 3.14;
        int r;
        double area;
        Scanner a = new Scanner(System.in);
        r=a.nextInt();
        area = pi*r*r;
        System.out.println("area is "+area);
    }
}
