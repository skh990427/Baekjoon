import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

class Member {
    private int age;
    private String name;
    private int score;

    public Member(int age, String name, int score) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Member> members = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(token.nextToken());
            String name = token.nextToken();
            Member member = new Member(age, name, i);
            members.add(member);
        }

        Collections.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(members.get(i).getAge() + " " + members.get(i).getName());
        }

    }
}
