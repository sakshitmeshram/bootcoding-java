
import java.util.Scanner;

public class PersonEducation {

    public static void main(String[] args) {

        int age;
        System.out.println("Enter the age");

        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age<5) {
            System.out.println("You only illigible for nursery");
        }
        if(age>=5 && age<=15) {
            System.out.println("You are illigible for School-k10");
        }
        if(age>=16 && age<=18) {
            System.out.println("You are illigible for High School-k12");
        }
        if(age>=19 && age<=22) {
            System.out.println("You are illigible for Graduate");
        }
        sc.close();

    }

}