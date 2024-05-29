package package_person_homework;

public class PersonHomework {

    String name;
    char gender;
    int age;
    int car;

    boolean violations;
    double creditScore;

    public void display() {
        System.out.println("Customer name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Gender: " +gender);
        System.out.println("Car: " +car);
        System.out.println("Violations: " +violations);
        System.out.println("Credit Score: " +creditScore);
    }
    //our logic is regarding our credit score & violation

    //if the car is newer, the "person" will be paying more insurance,
    // and if the car is older, the monthly premiums will be less.
    public double getRate(double monthlyRate) {
        if( car >= 2015) {
            monthlyRate = 700.00;
        } else {
            monthlyRate = 200.00;
        }
        return monthlyRate;

    }
    public double assumeGender(double adjustedRate) {
        if(gender == 'M' && age <= 25) {
            adjustedRate = 100;
        } else {
            adjustedRate = 0;
        }
        return adjustedRate;
    }

}


