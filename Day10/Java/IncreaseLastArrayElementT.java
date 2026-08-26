

public class IncreaseLastArrayElementT {

  public static int[] array(int[] numbers) {

  int lastIndex = numbers.length - 1;

  numbers[lastIndex] = numbers[lastIndex] + 1;

  return numbers;
  }
}
