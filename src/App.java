
public class App {
    public static void main(String[] args) throws Exception {

        // 입력되는 시간(hour)
        int N = 5;
        int count = 0;

        for (int h = 0; h <= N; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    String hh = String.format("%02d", h);
                    String mm = String.format("%02d", m);
                    String ss = String.format("%02d", s);
                    String hhmmss = hh + mm + ss;
                    if (hhmmss.indexOf("3") > 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
