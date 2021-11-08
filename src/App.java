
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

        for (String num : arry) {
            if (num == "L") {
                y += y - 1 <= 0 ? y : y--;
            } else if (num == "R") {
                y = y + 1 > map ? y : y++;
            } else if (num == "U") {
                x = x - 1 <= 0 ? x : x--;
            } else if (num == "D") {
                x = x + 1 > map ? x : x++;
            }
        }
        System.out.println("x :" + x + " " + "y : " + y);
    }

}
