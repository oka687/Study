import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {

        // 주어진 수를 M번 더해서 가장 큰 수를 나타내야 하는데, 연속으로 더할 수 있는건 K가 최대이다.

        int N = 7; // 주어지는 수
        int M = 150; // 더해야 하는 횟수
        int K = 11; // 연속 최대 횟수

        // K는 K <= M
        if (K > M) {

            System.out.println("K와 M을 다시 설정해주세요.");
        }

        int ban = K + 1; // 쉼을 포함한 횟수

        int ban1 = M / ban; // 쉼을 포함한 나누기

        int ban2 = M % ban; // 나머지

        // 큰거랑 그 다음 큰거 담을 변수 선언
        int big = 0;
        int semiBig = 0;

        // List으로 변환할 배열
        int[] arr = { 2, 4, 5, 4, 6, 7, 9 };

        // 리스트 화
        ArrayList<Integer> list = new ArrayList<>();

        // 배열의 리스트화
        for (int i = 0; i < arr.length; i++) {

            list.add(arr[i]);
        }

        // 정렬
        Collections.sort(list);

        int size = list.size() - 1; // 가장 큰수
        int semiSize = list.size() - 2; // 가장 그 다음 큰수

        big = list.get(size);
        semiBig = list.get(semiSize);

        int a = big * K + semiBig; // 큰수+작은수 1사이클
        int b = a * ban1; // 사이클 * 나눈값
        int c = big * ban2;// 나머지

        System.out.println(b + c);

    }
}
