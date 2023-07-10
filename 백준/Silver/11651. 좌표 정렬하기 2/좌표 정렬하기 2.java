import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

class Chart2 {
    private int x;
    private int y;

    public Chart2(int x, int y) {
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
        int n = Integer.parseInt(br.readLine());

        ArrayList<Chart2> charts = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(token.nextToken());
            int y = Integer.parseInt(token.nextToken());
            Chart2 chart = new Chart2(x, y);

            charts.add(chart);
        }

        Collections.sort(charts, new Comparator<Chart2>() {
            @Override
            public int compare(Chart2 o1, Chart2 o2) {
                if (o1.getY() == o2.getY()) {
                    return o1.getX() - o2.getX();
                } else {
                    return o1.getY() - o2.getY();
                }
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(charts.get(i).getX() + " " + charts.get(i).getY());
        }
    }
}
