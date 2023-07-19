import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sugar = Integer.parseInt(br.readLine());
        int fiveCount;
        int count = 0;
        boolean flag = false;

        fiveCount = sugar / 5;
        sugar = sugar % 5;

        while (sugar != 0) {
            if (sugar >= 3) {
                count++;
                sugar = sugar - 3;
            } else {
                if (fiveCount >= 1) {
                    fiveCount--;
                    sugar = sugar + 5;
                } else {
                    flag = true;
                    break;
                }
            }

        }
        if (flag) {
            System.out.println(-1);
        } else {
            System.out.println(count + fiveCount);
        }

    }
}
