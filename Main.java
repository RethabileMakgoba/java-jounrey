//This is about Scanners and a bit of if-statement

import java.util.Scanner;
public class Main {
    public static void main(String[]args ){
        //declare
        int age;
        //Scanner
        Scanner sc = new Scanner(System.in);
        //ask input
        System.out.println("Please enter your age ");
        age = sc.nextInt();
        sc.close();

        //if statement
        if(age<=13){
            System.out.println("You can watch PG movies");
        }
        else if(age > 14 || age > 17){
            System.out.println("You can watch PG 13 movies");
        }
        else if(age>=18){
            System.out.println("You can watch all movies");
        }
    }
}
