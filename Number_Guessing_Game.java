import java.util.*;

public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t\tBest of luck!");
        System.out.println("\t\t(If you want to stop and see the actual number press negative value)");
        int ActualNumber = (int) (Math.random() * 100);

        int Number = 1;
        int score = 100;
        while (Number != ActualNumber) {
            score = score - 1;

            System.out.print("Enter number:");
            Number = sc.nextInt();
            if (Number == ActualNumber) {
                System.out.println("congrtas!!");
                System.out.println("you have taken:" + (100 - score) + " chances");
                System.out.println("Score:" + score + " " + "out of 100");
            } else if (Number > ActualNumber && Number < 100) {
                System.out.println("your no. is greater ");
                System.out.println("Try again");
            } else if (Number < ActualNumber && Number > 0) {
                System.out.println("your no. is smaller ");
                 System.out.println("Try again");
            } else if (Number > 100) {
                System.out.println("Enter no. between 1 to 100");

            } else if (Number < 0) {
                System.out.println("actual no:" + ActualNumber);
                break;
            }

        }
    }
}
