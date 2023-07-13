import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringTokenizer;

class printQueue {
    private int index;
    private int impo;

    public printQueue(int index, int impo) {
        this.index = index;
        this.impo = impo;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getImpo() {
        return impo;
    }

    public void setImpo(int impo) {
        this.impo = impo;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            LinkedList<printQueue> prints = new LinkedList<>();
            StringTokenizer token = new StringTokenizer(br.readLine());
            int count = 0;

            int n = Integer.parseInt(token.nextToken());
            int m = Integer.parseInt(token.nextToken());

            token = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                printQueue printQueue = new printQueue(j, Integer.parseInt(token.nextToken()));
                prints.add(printQueue);
            }

            while (true) {
                printQueue nowQueue = prints.remove();
                boolean flag = true;

                for (int j = 0; j < prints.size(); j++) {
                    if (prints.get(j).getImpo() > nowQueue.getImpo()) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    count++;
                    if (nowQueue.getIndex() == m) {
                        break;
                    }
                } else {
                    prints.add(nowQueue);
                }
            }
            System.out.println(count);
        }
    }
}
