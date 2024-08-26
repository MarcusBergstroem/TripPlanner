import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int option;
        boolean sentinel = true; 
        ArrayList<Trip> allTrips = new ArrayList<Trip>();
        
        
        while (sentinel) {            
            
            showMenu();

            option = console.nextInt();
            switch (option) {

                //Create Trip
                case 1:
                    createTrip(allTrips, console);
                    break;
            
                //List trip
                case 2:
                    listTrips(allTrips);
                    break;

                //Quit
                case 3:
                    sentinel = false;
                    break;

                default:
                    break;
            }
        }
    }

    public static void showMenu(){
        System.out.println("\n-------------------------------------------------------");
        System.out.println("Choose number:");
        System.out.println("1. Create trip");
        System.out.println("2. List trip(s)");
        System.out.println("3. Quit");
    }

    public static void createTrip(ArrayList<Trip> allTrips, Scanner console){
        System.out.println("Please fill out trip details:");
        System.out.println();

        System.out.println("Is it a?");
        System.out.println("1. Beach trip");
        System.out.println("2. Ski Trip");
        int type = console.nextInt();
        System.out.println();

        console.nextLine();
        System.out.println("Country?");
        String country = console.nextLine();
        System.out.println();

        System.out.println("Duration? (in days)");
        int duration = console.nextInt();
        System.out.println();

        System.out.println("Price?");
        int price = console.nextInt();
        System.out.println();

        System.out.println("Is it paid?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        boolean paid = (console.nextInt() == 1);
        System.out.println();
        
        if (type == 2) {
            System.out.println("Snowboard?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            boolean snowboard = (console.nextInt() == 1);
            System.out.println();
    
            System.out.println("What is the altitude? (in m)");
            int meter = console.nextInt();
            System.out.println();
            allTrips.add(new SkiTrip(country, duration, price, paid, snowboard, meter));
            
        } else {
            System.out.println("Breakfast included?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            boolean breakfast = (console.nextInt() == 1);
            System.out.println();
            allTrips.add(new BeachTrip(country, duration, price, paid, breakfast));
        }

    }

    public static void listTrips(ArrayList<Trip> allTrips){
        for (Trip trip : allTrips) {
            System.out.println(trip);
        }
    }
}
