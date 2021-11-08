
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int map = 0;
        int x = 1;
        int y = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("N의 크기 입력");
        map = sc.nextInt();

        sc.close();

        String[] arry = { "D", "D", "D", "L", "U", "U", "U", "R" };

        for (int i = 0; i < arry.length; i++) {
            if (arry[i] == "L") {
                y = y - 1 <= 0 ? y : y--;
            } else if (arry[i] == "R") {
                y = y + 1 > map ? y : y++;
            } else if (arry[i] == "U") {
                x = x - 1 <= 0 ? x : x--;
            } else if (arry[i] == "D") {
                x = x + 1 > map ? x : x++;
            }
        }
        System.out.println("x :" + x + " " + "y : " + y);
    }

}
