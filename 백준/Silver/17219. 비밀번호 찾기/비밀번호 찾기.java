import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(token.nextToken());
        int n = Integer.parseInt(token.nextToken());

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            token = new StringTokenizer(br.readLine());
            String key = token.nextToken();
            String password = token.nextToken();

            map.put(key, password);
        }

        for (int i = 0; i < n; i++) {
            String search = br.readLine();
            System.out.println(map.get(search));
        }
    }
}
