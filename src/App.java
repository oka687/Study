import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int map = 0;
        int x = 1;
        int y = 1;
        int count = 0;

        boolean whileSwitch = true;

        List<String> arrow = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("N의 크기 입력");
        map = sc.nextInt();

        sc.close();

        String[] arry = { "D", "D", "D", "L", "U", "U", "U", "R" };

        for (int i = 0; i < arry.length; i++) {
            if (arry[i] == "L") {

                if (y - 1 <= 0) {
                    continue;
                }
                y--;
                count++;
            } else if (arry[i] == "R") {
                if (y + 1 > map) {
                    continue;
                }
                y++;
                count++;
            } else if (arry[i] == "U") {
                if (x - 1 <= 0) {
                    continue;
                }
                x--;
                count++;
            } else if (arry[i] == "D") {
                if (x + 1 > map) {
                    continue;
                }
                x++;
                count++;
            }

        }

        System.out.println("N = " + count);
        System.out.println("x :" + x + " " + "y : " + y);

        // Scanner arrowList = new Scanner(System.in);
        // System.out.println("방향키 입력 N을 입력 시, 종료");

        // while (whileSwitch) {

        // switch (arrowList.nextLine()) {
        // case "L":
        // arrow.add(arrowList.nextLine());
        // break;
        // case "R":
        // arrow.add(arrowList.nextLine());
        // break;
        // case "U":
        // arrow.add(arrowList.nextLine());
        // break;
        // case "D":
        // arrow.add(arrowList.nextLine());
        // break;
        // case "N":
        // whileSwitch = false;
        // default:
        // System.out.println("다시 입력");
        // }
        // }

        // arrowList.close();

        // System.out.println(arrow);

    }

}
