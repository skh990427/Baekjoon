import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        Scanner stdIn = new Scanner(System.in);

        for (int i = 0; i < 8; i++)
        {
            int num = stdIn.nextInt();

            arr1.add(num);
            arr2.add(num);
        }
        Collections.sort(arr2);

        if(arr1.equals(arr2))
            System.out.println("ascending");
        else
        {
            Collections.sort(arr2, Collections.reverseOrder());
            if(arr1.equals(arr2))
                System.out.println("descending");
            else
                System.out.println("mixed");
        }
    }
}
