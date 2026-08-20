







import java.util.Scanner;

public class taskSeven {

public static void main(String[] args) {


Scanner input = new Scanner(System.in);

int sum = 0;
int average = 0;

for (int index =1; index <= 10; index++) {

System.out.println( "Enter a number; ");

int number = input.nextInt();
if (number %2 ==0){

 sum += number;

average = sum/5;
}
 
}
System.out.println("Sum = " + sum);
System.out.println("average = " + average);
}

}
