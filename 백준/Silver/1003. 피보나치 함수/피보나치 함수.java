import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            ArrayList<Integer> arrZero = new ArrayList<>();
            ArrayList<Integer> arrOne = new ArrayList<>();
            if (num == 0) {
                arrZero.add(1);
                arrOne.add(0);
            } else {
                arrZero.add(1);
                arrZero.add(0);
                arrOne.add(0);
                arrOne.add(1);
            }

            for (int j = 2; j <= num; j++) {
                arrZero.add(arrZero.get(j - 2) + arrZero.get(j - 1));
                arrOne.add(arrOne.get(j - 2) + arrOne.get(j - 1));
            }
            System.out.println(arrZero.get(arrZero.size() - 1) + " " + arrOne.get(arrOne.size() - 1));
        }
    }
}
