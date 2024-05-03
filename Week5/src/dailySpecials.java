import java.util.Scanner;

public class dailySpecials {

    public static void main(String[] args) {

        String specials;


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only.)");

        specials = input.next();

//        System.out.println("");


        // in the world of coffee I need a  name of a coffee beverage and a price

        String coffee;
        double price;
        int lattes = 1;


        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if (saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend.");
            specials = input.next();
        }

        switch (specials) {

            // my cases will be the day of the week.
            case "Monday":
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                break;

            case "Tuesday":
                coffee = "Frapp";
                price = 5.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                break;
            case "Wednesday":
                coffee = "Cappuccino";
                price = 4.35;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                break;
            case "Thursday":
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                break;
            case "Friday":
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                break;
        }

//        Scanner lattes = new Scanner(System.in);
        System.out.println("How many Lattes would you like to order?");

        price = 4.95;
        double total;
        lattes = input.nextInt();



        if (lattes < 1) {
            System.out.println("Looks like you don't like Lattes! So sad!!");
        } else if (lattes > 1) {
            total = lattes * price;

            System.out.println(lattes+ " Lattes have been ordered totalling");
            System.out.printf("$%.2f", total);
        }


        if (lattes == 1) {

            System.out.println("Looks like you will be ordering only " + lattes + " Latte today!");
        }

    }

}
