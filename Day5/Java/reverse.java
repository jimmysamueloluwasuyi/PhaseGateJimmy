public class reverse{
public static int reverseOf(int number){

int reversedNumber = 0;

int digit=0;

while(number!=0){

digit = number % 10;

reversedNumber= reversedNumber * 10 + digit;

number = number/10;
}
}
return reversedNumber;
}
