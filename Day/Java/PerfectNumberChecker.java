

public class PerfectNumberChecker {

public static void main(String[] args) {

int number = 5;

int sum = 0;

for (int index = 1; index < number; index++) {

if (number % index == 0) {

sum = sum + index;
}
}

if (sum == number) {

System.out.println("Perfect number");

} else {

System.out.println("Not a perfect number");
}
}
}
