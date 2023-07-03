import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    private static int lower(ArrayList<Integer> arr, int key) {
        int low = 0;
        int high = arr.size();

        while (low < high) {
            int mid = (low + high) / 2;
            if (key <= arr.get(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int upper(ArrayList<Integer> arr, int key) {
        int low = 0;
        int high = arr.size();

        while (low < high) {
            int mid = (low + high) / 2;
            if (key < arr.get(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer token = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr1.add(Integer.valueOf(token.nextToken()));
        }

        Collections.sort(arr1);

        int m = Integer.parseInt(br.readLine());
        token = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            arr2.add(Integer.valueOf(token.nextToken()));
        }
        for (int i = 0; i < arr2.size(); i++) {
            sb.append(upper(arr1, arr2.get(i)) - lower(arr1, arr2.get(i))).append(" ");
        }

        System.out.println(sb.toString());
    }
}
