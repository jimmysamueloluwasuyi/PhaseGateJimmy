


public class PerfectNumbers {

public static void main(String[] args) {

for (int number = 1; number <= 1000; number++) {

int sum = 0;

for (int index = 1; index < number; index++) {

if (number % index == 0) {

sum = sum + index;
}
}

if (sum == number) {

System.out.println(number);
}
}
}
}
