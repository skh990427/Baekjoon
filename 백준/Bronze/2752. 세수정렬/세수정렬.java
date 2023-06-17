import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();

        StringTokenizer token = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            arr.add(Integer.valueOf(token.nextToken()));
        }
        Collections.sort(arr);

        for (int i = 0; i < 3; i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
