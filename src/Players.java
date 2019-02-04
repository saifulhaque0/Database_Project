import java.util.ArrayList;
import java.util.List;

public class Players {

    private List<Player> chosen = new ArrayList<>();

    public Players(int numOfPlayers){
        /*
        System.out.println(numOfPlayers);
        chosen = new ArrayList<Player>(numOfPlayers);
        System.out.println(chosen.size());
        */
    }

    public String toString(){
        String toR = "";

        for (Player p : chosen)
            toR += p + "\n";
        return  toR;
    }

    public void addPlayer(int  i, Player p){
        /*
        chosen.set(i, p);
        */
        chosen.add(p);
    }

    public List<Player> salaryGreaterThan(double minS){
        List<Player> toR = new ArrayList<Player>();

        for (Player p : chosen)
            if (p.getSalary() > minS)
                toR.add(p);

        return toR;
    }

    public List<Player> salaryLessThan(double maxS){
        List<Player> toR = new ArrayList<Player>();

        for (Player p : chosen)
            if (p.getSalary() < maxS)
                toR.add(p);

        return toR;
    }

    //Biggest Salary Starts at the start of the Array
    public void sortBySalary(){

        for (int i = 0; i < chosen.size() - 1; i++)
            for (int j = i + 1; j < chosen.size(); j++)
                if (chosen.get(i).getSalary() < chosen.get(j).getSalary())
                    swap(i,j);

    }

    //Smallest JerseyNumber at teh start****FIX THIS
    public void sortByJerseyNumber(){
        for (int i = 0; i < chosen.size() - 1; i++)
            for (int j = i + 1; j < chosen.size(); j++)
                if (chosen.get(i).getJerseyNumber() < chosen.get(j).getJerseyNumber())
                    swap(i,j);
    }

    public void swap(int a, int b){
        Player p = chosen.get(a);
        chosen.set(a, chosen.get(b));
        chosen.set(b, p);
    }
}