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

        int n = Integer.parseInt(br.readLine());
        StringTokenizer token = new StringTokenizer(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr.add(Integer.valueOf(token.nextToken()));
        }

        Collections.sort(arr);

        for (int i = 0; i < arr.size() - 1; i++) {
            if(arr.get(i) == arr.get(i + 1))
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
