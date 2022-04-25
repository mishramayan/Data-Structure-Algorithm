import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter element to check - ");

        int n = sc.nextInt();

        Solution sol = new Solution();

        sol.push(1);
        sol.push(4);
        sol.push(1);
        sol.push(12);
        sol.push(1);

        System.out.println("Element present?? - " + sol.GetNth(n));
    }
}
