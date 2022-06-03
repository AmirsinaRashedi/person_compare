import domain.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class PersonCompareApplication {
    public static void main(String[] args) {

        System.out.print("how many people you want to add? ");

        Scanner intInput = new Scanner(System.in);

        int personCount = intInput.nextInt();

        ArrayList<Person> personList = new ArrayList<>();

        for (int i = 0; i < personCount; i++)
            personList.add(new Person());


        sortByFirstName(personCount, personList);

        sortByLastName(personCount, personList);

        System.out.println(personList);

    }

    private static void sortByFirstName(int personCount, ArrayList<Person> personList) {

        Boolean flag = false;

        for (int i = 0; i < personCount; i++) {

            for (int j = i; j < personCount - 1; j++) {

                if (personList.get(j).compareTo(personList.get(j + 1)) > 0) {

                    Person tempPerson = personList.get(j);

                    personList.set(j, personList.get(j + 1));

                    personList.set(j + 1, tempPerson);

                    flag = true;
                }

            }

            if (!flag)

                break;

            else

                flag = false;

        }

    }

    private static void sortByLastName(int personCount, ArrayList<Person> personList) {

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        };

        Boolean flag = false;

        for (int i = 0; i < personCount; i++) {

            for (int j = i; j < personCount - 1; j++) {

                if (personList.get(j).compareTo(personList.get(j + 1)) == 0) {

                    if (comparator.compare(personList.get(j), personList.get(j + 1)) > 0) {

                        Person tempPerson = personList.get(j);

                        personList.set(j, personList.get(j + 1));

                        personList.set(j + 1, tempPerson);

                        flag = true;
                    }

                }

            }

            if (!flag)

                break;

            else

                flag = false;

        }

    }

}
