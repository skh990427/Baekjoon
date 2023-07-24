import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            sum += num;

        }

        Arrays.sort(arr);

        int count = 0;
        boolean flag = false;
        int max = -1;
        int mod = arr[0];

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                count = 0;
            }
            if (max < count) {
                max = count;
                mod = arr[i];
                flag = true;
            } else if (flag && max == count) {
                mod = arr[i];
                flag = false;
            }

        }

        System.out.println(Math.round((float)sum / arr.length));
        System.out.println(arr[n / 2]);
        System.out.println(mod);
        System.out.println(Math.abs(arr[n - 1] - arr[0]));
    }
}
