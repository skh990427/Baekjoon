import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

class KgCm {
    private int kg;
    private int cm;
    private int rank;

    public KgCm(int kg, int cm) {
        this.kg = kg;
        this.cm = cm;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public int getCm() {
        return cm;
    }

    public void setCm(int cm) {
        this.cm = cm;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<KgCm> humans = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int kg = Integer.parseInt(token.nextToken());
            int cm = Integer.parseInt(token.nextToken());
            humans.add(new KgCm(kg, cm));
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (humans.get(i).getKg() < humans.get(j).getKg() && humans.get(i).getCm() < humans.get(j).getCm()) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}
