import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class pair { //큐에 좌표를 넣어주기 위한 클래스
    private int x;
    private int y;

    public pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        Queue<pair> queue = new LinkedList<>();

        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());

        int dist[][] = new int[n][m]; //거리를 저장할 배열
        char map[][] = new char[n][m]; //미로를 저장할 배열
        int dx[] = {1, 0, -1, 0}; //상하좌우 계산할 x좌표
        int dy[] = {0, 1, 0, -1}; //상하좌우 계산할 y좌표


        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = line.charAt(j);
                dist[i][j] = -1; //모든 맵 거리는 -1로 지정해야 방문여부 판단 가능
            }
        }

        queue.offer(new pair(0, 0)); //시작위치는 0, 0
        dist[0][0] = 1; //처음 시작거리는 1

        while (!queue.isEmpty()) {
            pair p = queue.poll();

            //상하좌우 계산
            for (int i = 0; i < 4; i++) {
                int nX = p.getX() + dx[i];
                int nY = p.getY() + dy[i];

                //벽에 박거나 범위를 넘어가면 pass
                if (nX < 0 || nX >= n || nY < 0 || nY >= m) {
                    continue;
                }

                //길이 아니거나 방문을 했다면 pass
                if (map[nX][nY] == '0' || dist[nX][nY] != -1) {
                    continue;
                }

                //큐에 이동한 좌표를 넣어준다
                queue.offer(new pair(nX, nY));
                //한칸 이동하였으므로 이전 출발지점 + 1 거리
                dist[nX][nY] = dist[p.getX()][p.getY()] + 1;
            }
        }

        System.out.println(dist[n - 1][m - 1]);
    }
}
