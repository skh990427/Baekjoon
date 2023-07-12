import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> arr = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        int roundNum = (int) round(arr.size() * 0.15);

        Collections.sort(arr);

        for (int i = 0; i < roundNum; i++) {
            arr.remove(0);
            arr.remove(arr.size() - 1);
        }

        int size = arr.size();
        double sum = 0.0;

        for (int i = 0; i < size; i++) {
            sum += arr.remove(0);
        }

        System.out.println(Math.round(sum/ size));
    }
}
