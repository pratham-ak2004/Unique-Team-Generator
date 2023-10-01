import java.util.*;

public class unique implements generate{
    // Global variables
    ArrayList<Integer>done = new ArrayList<>();
    ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
    int total , per ;

    // Constructor
    unique(int x , int y){
        per = y;
        if(x%y == 0){
            total = x;
        }else {
            total = x +(y - (x%y));
        }
    }

    // unique random number generation
    @Override
    public int randomNum() {
        Random rd = new Random();
        int x = 0;
        try{
            do{
                x = rd.nextInt(total);
            }while(done.contains(x));
        }catch (Exception e){
            System.out.println("Error generating random number : "+ e.toString());
        }
        done.add(x);
        return x+1;
    }

    // Unique team generation
    @Override
    public ArrayList<Integer> oneTeam() {
        ArrayList<Integer> team = new ArrayList<>();
        for(int i = 0 ; i < per ; i++){
            team.add(randomNum());
        }
        return team;
    }

    // Final list of team production
    @Override
    public ArrayList<ArrayList<Integer>> completeTeam() {
        for (int i = 0 ; i < total/per ; i++){
            ans.add(oneTeam());
        }
        return ans;
    }
}
