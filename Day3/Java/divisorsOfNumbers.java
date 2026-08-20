public class divisorsOfNumbers {

public static void main(String[] args) {

for (int number = 1; number<=50; number++) {


int count = 0;


for (int divisor = 1; divisor <= number; divisor++) {

if (number % divisor == 0) {

    count ++;
}

}
if (count <= number) {

System.out.println(count);
}
}
}
}
