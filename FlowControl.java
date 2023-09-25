import java.util.Scanner; //import scanner

public class FlowControl {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in); //make new instance of scanner

        System.out.println("Enter a whole number: "); //prompt user to input a numner
        int num1 = input.nextInt(); //store input into int variable num1
        System.out.println("Enter another whole number: "); //prompt user to input another number
        int num2 = input.nextInt(); //store user input into int variable num2

        //simple while loop that prints statement once
        int a = 1;
        while (a <= 1) {
            System.out.println("I'm subtracting the smaller number from the bigger number, so let me make sure I put them in the correct order...");
            a++;
        }

        int min = Math.min(num1, num2); //finds the min of both numbers
        int max = Math.max(num1, num2); //finds the max of both numbers


       
        if ((max - min) < 200) { //if the max minus the min is less than 200, the code stops
            System.out.println("The difference between your two numbers are less than 200. Try again.");
            input.close(); //closes scanner
            return; //returns nothing and program ends
        } else {
            int result = max - min;
            System.out.println(max + " - " + min + " = " + result + " The difference of the two number is greater than 200, so we can continue with the code! "); //if difference bewteen max and min are > than 200 we can continue with our code
        }
        
        
        int evenAndDivisibleBy4Sum = 0; //variable for sum of numbers that are even and divisible by 4
        int evenAndDivisibleBy8Sum = 0; //variable for sum of numbers that are even and divisible by 8
        int oddAndNotDivisibleBy5Sum = 0; //variable for sum of numbers that are odd and not divisible by 5

        // Use a for loop to iterate through numbers from num1 to num2 (inclusive)
        loop1: for (int i = min; i <= max; i++) { //created a label for this for loop called loop1
            // Check if the number is even and divisible by 8
            if (i % 2 == 0 && i % 8 == 0) { 
                evenAndDivisibleBy4Sum += i;
            }
            // Check if the number is even and divisible by 4
            else if (i % 2 == 0 && i % 4 == 0) {
                evenAndDivisibleBy8Sum += i;
            }
            // Check if the number is not even and not divisible by 5
            else if (i % 2 != 0 && i % 5 != 0) {
                oddAndNotDivisibleBy5Sum += i;
            } else {
                continue loop1; //else statement that continue the loop1 if conditions aren't met
            }
            
        }

        // Use a do-while loop to display the sums
        int choice;
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Sum of even numbers divisible by 4: ");
            System.out.println("2. Sum of even numbers divisible by 8: ");
            System.out.println("3. Sum of numbers not even and not divisible by 5: ");
            System.out.println("4. Exit");

            choice = input.nextInt();

            // Use a switch statement to handle user's choice
            switch (choice) {
                case 1:
                    System.out.println("Sum = " + evenAndDivisibleBy4Sum + "\n");
                    break;
                case 2:
                    System.out.println("Sum = " + evenAndDivisibleBy8Sum + "\n");
                    break;
                case 3:
                    System.out.println("Sum = " + oddAndNotDivisibleBy5Sum + "\n");
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option. \n");
            }
        } while (choice != 4);

        input.close();
    }
}


