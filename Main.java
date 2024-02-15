import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Code recommends an activity to the user with given inputs.
        // Input shall be degrees in Celcius.

        // Starting with variables.
        int degreeC;

        // Collecting inputs.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your area's temperature in Celcius: ");
        degreeC = input.nextInt();

        // If - else method for outputs.

        if (degreeC < -20 && degreeC > -100){
            System.out.println("Please stay at home at this conditions. ");
        } else if (degreeC > -20 && degreeC <= 0 ) {
            System.out.println("It is ideal for winter sports or a hot chocolate. ");
        } else if (degreeC > 0 && degreeC <= 25) {
            System.out.println("It is ideal for outside time ex: trekking, walking...");
        } else if (degreeC > 25 && degreeC <= 40) {
            System.out.println("It is time for swimming.");
        } else if (degreeC > 40 && degreeC <=50) {
            System.out.println("Please stay at home at this conditions. ");
        }else{
            System.out.println("Bro call 9-1-1");
        }
    }
}