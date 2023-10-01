import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args){
        int a = 0 , b = 0;
        System.out.print("Enter total number of candidates and team size : ");
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
            b = sc.nextInt();
        }catch(Exception e){
            System.out.println("Error taking inputs : " + e.toString());
            System.exit(0);
        }
        // a = 71 , b = 4
        unique obj = new unique(a , b);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        try{
            ans = obj.completeTeam();
        }catch(Exception e){
            System.out.println("Error genarating team : " + e.toString());
        }
        System.out.println("\nThe generated teams are :");
        for (ArrayList<Integer> team :
                ans) {
            for (int i :
                    team) {
                System.out.print(" "+i);
            }
            System.out.println();
        }
        System.out.println();
        System.gc();
    }
}
