
public class App {
    public static void main(String[] args) throws Exception {

        long start = System.nanoTime();

        int money = 4850;
        int[] change = new int[4];
        change[0] = 500;
        change[1] = 100;
        change[2] = 50;
        change[3] = 10;

        int calcCoin = 0; // coin count(몫)

        for (int i = 0; i < change.length; i++) {

            int mock = money / change[i];
            int naMerge = money % change[i];

            calcCoin = calcCoin + mock; // 코인개수 카운트

            if (naMerge != 0) {

                money = naMerge; // 나머지를 계산식에 대입
                continue;
            } else {
                System.out.println("동전개수 : " + calcCoin);
                break;
            }

        }

        long end = System.nanoTime();

        System.out.println(end - start);
    }
}
