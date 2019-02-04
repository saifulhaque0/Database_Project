public class Player {

    private String name, status, team, position;
    private int age, jerseyNumber;
    private double salary;

    public Player(String name, String status, String team, String position, int age, int jerseyNumber, double salary){
        this.name = name; this.status = status; this.team = team; this.position = position; this.age = age; this.jerseyNumber = jerseyNumber; this.salary = salary;
    }

    public String toString(){
        String toR = "";
        int padding = 4;

        toR += name + addSpaces(21 - name.length() + padding);
        toR += team + addSpaces(22 - team.length() + padding);
        toR += status + addSpaces(7 - status.length() + padding);
        toR += position + addSpaces(14 - position.length() + padding);
        toR += age + " years old" + addSpaces(  Integer.toString(age).length() + padding);
        toR += salary + " Million" + addSpaces(5 - Double.toString(salary).length() + padding);
        toR += jerseyNumber + addSpaces(2 - Integer.toString(jerseyNumber).length()+ padding);

        return toR;
    }

    public String addSpaces(int toAdd){
        String toR = "";

        for (int i = 0; i < toAdd; i++)
            toR += " ";

        return toR;
    }

    //Helper Methods
    public String getName(){ return  name; }
    public String getStatus(){ return status; }
    public String getTeam(){ return team; }
    public String getPosition(){ return position; }
    public int getJerseyNumber(){ return jerseyNumber; }
    public int getAge(){ return age; }
    public double getSalary(){ return  salary; }
}