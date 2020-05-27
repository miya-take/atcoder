
import java.util.Scanner;

public class Main2 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int max = (int) Math.pow(10, 18);
        int b = 100;
        if (101 <= x && x <= max) {
            int c = 0;
            while (b < x) {
                  b = (int) (b * 1.01);
                  c++;
            }
//            for (int b = 100; b < x; b++) {
//                c++;
//            }
            System.out.println(c);
        }
    }
}
