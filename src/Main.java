import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner file = new Scanner(new File("Basketball.csv"));
        int numOfLines = 0;

        while (file.hasNextLine()) {
            file.nextLine();
            numOfLines++;
        }

        file.close();
        file = new Scanner(new File("Basketball.csv"));

        numOfLines--;
        Players players = new Players(numOfLines);

        String name, status, team, position;
        int age, jerseyNumber;
        double salary;

        if (numOfLines < 0){
            out.println("No Lines \n Please Try Again");
        } else{
            numOfLines = 0;
            file.nextLine();
            while(file.hasNextLine()){
                String[] info = file.nextLine().split(",");
                name = info[0];
                status = info[1];
                team = info[2];
                jerseyNumber = Integer.parseInt(info[3]);
                salary = Double.parseDouble(info[4]);
                age = Integer.parseInt(info[5]);
                position = info[6];

                players.addPlayer(numOfLines, new Player(name, status, team, position, age, jerseyNumber, salary));
                //numOfLines++;
            }

            file.close();
            //players.sortBySalary();
            out.println(players);
        }
    }
}