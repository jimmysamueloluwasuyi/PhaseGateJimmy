

public class oddAndEven {

public static int[] oddAndEvenArray(int[] numbers) {

for (int index = 0; index < numbers.length; index ++) {

if (numbers[index] % 2 == 0) {

numbers[index] = numbers[index] * 2;

} else {

numbers[index] = numbers[index] + 1;
}

}

return numbers;
}








