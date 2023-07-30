import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Character> arr = new ArrayList<>();
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            arr.add(str.charAt(i));
        }

        Collections.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
        }
    }
}
