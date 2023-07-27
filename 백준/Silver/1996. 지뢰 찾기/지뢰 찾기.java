import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char map[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int m = 0;
                if (map[i][j] == '.') {
                    //왼쪽 위
                    if (i - 1 >= 0 && j - 1 >= 0) {
                        if (map[i - 1][j - 1] != '.') {
                            m += map[i - 1][j - 1] - '0';
                        }
                    }
                    //위
                    if (i - 1 >= 0) {
                        if (map[i - 1][j] != '.') {
                            m += map[i - 1][j] - '0';
                        }
                    }
                    //오른쪽위
                    if (i - 1 >= 0 && j + 1 < n) {
                        if (map[i - 1][j + 1] != '.') {
                            m += map[i - 1][j + 1] - '0';
                        }
                    }
                    //왼쪽
                    if (j - 1 >= 0) {
                        if (map[i][j - 1] != '.') {
                            m += map[i][j - 1] - '0';
                        }
                    }
                    //오른쪽
                    if (j + 1 < n) {
                        if (map[i][j + 1] != '.') {
                            m += map[i][j + 1] - '0';
                        }
                    }
                    //왼쪽아래
                    if (i + 1 < n && j - 1 >= 0) {
                        if (map[i + 1][j - 1] != '.') {
                            m += map[i + 1][j - 1] - '0';
                        }
                    }
                    //아래
                    if (i + 1 < n) {
                        if (map[i + 1][j] != '.') {
                            m += map[i + 1][j] - '0';
                        }
                    }
                    //오른쪽아래
                    if (i + 1 < n && j + 1 < n) {
                        if (map[i + 1][j + 1] != '.') {
                            m += map[i + 1][j + 1] - '0';
                        }
                    }

                    if (m >= 10) {
                        System.out.print("M");
                    } else {
                        System.out.print(m);
                    }


                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
