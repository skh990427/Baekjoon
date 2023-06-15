import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        StringTokenizer token = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            arr1.add(Integer.parseInt(token.nextToken()));
        }

        Collections.sort(arr1);

        int m = Integer.parseInt(br.readLine());
        token = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < m; i++) {
            if (Collections.binarySearch(arr1, Integer.parseInt(token.nextToken())) >= 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
