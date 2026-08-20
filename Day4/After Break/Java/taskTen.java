












import java.util.Scanner;

public class taskEight {

public static void main(String[] args) {


Scanner input = new Scanner(System.in);

int sum = 0;

int average = 0;

for (int index =1; index <= 100; index++) {

System.out.println( "Enter a number; ");

int number = input.nextInt();

if (number >= 0 && number<=100) {

 sum += number;


}
 
}
System.out.println("Average = " + average);
}

}
