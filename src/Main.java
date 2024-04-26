import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int distance;// The distance of the journey in kilometers
        int age;// The age of the passenger
        int type;// Type of travel (1: One Way, 2: Round Trip)
        double perkm = 0.10;// Price per kilometer
        boolean falseinput = false;// Flag to check if there is any false input

        System.out.print("Mesafeyi km türünden giriniz: ");
        distance = input.nextInt();// Read the distance input in kilometers

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();// Read the age input

        System.out.print("Yolculuk tipini giriniz (1:Tek Yön, 2:Gidiş Dönüş): ");
        type = input.nextInt();// Read the type of travel input

        double total;// Total price variable
        total = (distance * perkm);// Calculate the initial total price based on distance and price per kilometer
        // Discount calculations based on age
        if (age < 12) {
            total *= 0.5;// Apply 50% discount if age is less than 12
        } else if (age >= 12 && age < 24) {
            total *= 0.9;// Apply 10% discount if age is between 12 and 24
        } else if (age > 65) {
            total *= 0.7;// Apply 30% discount if age is over 65
        }
        // Discount calculations based on travel type
        if (type == 2) {
            total *= 0.8 * 2;   // Apply 20% discount for round trips

        } else if (type != 1) {
            System.out.println("Hatalı Giriş Yaptınız! ");// Print error message for invalid input
            falseinput = true;// Set flag to true for false input
        }
        // Print the total price if there is no false input
        if (!falseinput) {
            System.out.println("Toplam tutar: " + total);
        }
    }
}