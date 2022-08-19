import java.util.Scanner;
    public class EvenOdd {

        public static void main(String[] args) {

            int number;
            System.out.println("Enter the number");

            Scanner sc = new Scanner(System.in);
            number=sc.nextInt();

            if(number%2==0) {
                System.out.println("Number is even");
            }
            else {
                System.out.println("Number is odd");
            }
            sc.close();

        }

    }


