import com.company.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {

    static ArrayList<Person> persons = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        read();
    }

    public static void read () throws FileNotFoundException {
        Scanner sc = new Scanner(new File("csv fájl/us-500.csv.csv másolata"));

        while (sc.hasNextLine()){
            String line = sc.nextLine();
            String[] parts = line.split(",");
            Person person = new Person(
                    parts[0],
                    parts[1],
                    parts[2],
                    parts[3],
                    parts[4],
                    parts[5],
                    parts[6],
                    Integer.parseInt(parts[7]),
                    parts[8],
                    parts[9],
                    parts[10],
                    parts[11]
            );
            persons.add(person);
        }
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i).getFirstName() + " " + persons.get(i).getLastName() + " " + persons.get(i).getCompanyName() + " " + persons.get(i).getAddress() + " " + persons.get(i).getCity() + " " + persons.get(i).getCountry() + " " + persons.get(i).getState() + " " + persons.get(i).getZip() + " " + persons.get(i).getPhone1() + " " + persons.get(i).getPhone2() + " " + persons.get(i).getEmail() + " " + persons.get(i).getWeb());
        }
    }
}
