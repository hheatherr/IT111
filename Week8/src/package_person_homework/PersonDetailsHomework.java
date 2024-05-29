package package_person_homework;


public class PersonDetailsHomework {
    public static void main(String[] args) {

        PersonHomework firstPerson;
        PersonHomework secondPerson;

//in the process of creating an object from my Person class

        firstPerson = new PersonHomework();
//this is an object^
        secondPerson = new PersonHomework();


        //we will be entering the info, assigning values to our fields

        firstPerson.name = "Taylor Swift";
        firstPerson.gender = 'F';
        firstPerson.age= 34;
        firstPerson.car = 2020;
        firstPerson.violations = false;
        firstPerson.creditScore = 740;

        secondPerson.name = "Finn Wolfhard";
        secondPerson.gender = 'M';
        secondPerson.age= 21;
        secondPerson.car = 2012;
        secondPerson.violations = true;
        secondPerson.creditScore = 600;


        double monthlyRate = 0;
        double adjustedRate = 0;
        firstPerson.display();

        System.out.println("Preliminary Rate for " +firstPerson.name+ ": " +firstPerson.getRate(monthlyRate) + " dollars");
        System.out.println("Adjustments: " +firstPerson.assumeGender(adjustedRate) + " dollars");
        System.out.print("Here is " +firstPerson.name+ "'s total monthly premium: ");
        System.out.println(firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate));
        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate for " +secondPerson.name+ ": " +secondPerson.getRate(monthlyRate) + " dollars");
        System.out.println("Adjustments: " +secondPerson.assumeGender(adjustedRate) + " dollars");
        System.out.print("Here is " +secondPerson.name+ "'s total monthly premium: ");
        System.out.println(secondPerson.assumeGender(adjustedRate) + secondPerson.getRate(monthlyRate));
        System.out.println();

    }
}

