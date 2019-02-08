import java.util.ArrayList;
import java.util.List;

public class Players {

    private List<Player> chosen;

    public Players(){
        chosen = new ArrayList<Player>();
    }

    public String toString(){
        String toR = "";

        for (Player p : chosen)
            toR += p + "\n";
        return  toR;
    }

    public void addPlayer(Player p){
        chosen.add(p);
    }

    public List<Player> salaryGreaterThan(double minS){
        List<Player> toR = new ArrayList<Player>();

        for (Player p : chosen)
            if (p.getSalary() >= minS)
                toR.add(p);

        return toR;
    }

    public List<Player> salaryLessThan(double maxS){
        List<Player> toR = new ArrayList<Player>();

        for (Player p : chosen)
            if (p.getSalary() <= maxS)
                toR.add(p);

        return toR;
    }

    public List<Player> ageLessThan(double maxA){
        List<Player> toR = new ArrayList<Player>();

        for (Player p : chosen)
            if (p.getAge() <= maxA)
                toR.add(p);

        return toR;
    }

    public List<Player> ageGreaterThan(double minA){
        List<Player> toR = new ArrayList<Player>();

        for (Player p : chosen)
            if (p.getAge() >= minA)
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

    public Player comboTeamJersey(int jn, String team){
        for (Player p : chosen)
            if (p.getJerseyNumber() == jn && p.getTeam().equals(team))
                return p;

        return null;
    }

    public double totalSalaries(){
        double toR = 0;
        for (Player p : chosen)
            toR += p.getSalary();

        return toR;
    }

    public Player getPlayer(int jersey, String team){
        for (Player p : chosen)
            if (p.getJerseyNumber() == jersey && p.getTeam().equals(team))
                return p;

        return null;
    }

    public double totalSalaries(String team){
        double toR = 0;
        for (Player p : chosen)
            if (p.getTeam().equals(team))
                toR += p.getSalary();

        return toR;
    }

    public double averageSalary(){
        double a = 0;

        for (Player p : chosen)
            a += p.getSalary();

        return a / chosen.size();
    }

    public double averageSalary(String team){
        double a = 0;

        for (Player p : chosen)
            if (p.getTeam().equals(team))
                a += p.getSalary();

        return a / chosen.size();
    }

    public void swap(int a, int b){
        Player p = chosen.get(a);
        chosen.set(a, chosen.get(b));
        chosen.set(b, p);
    }
}