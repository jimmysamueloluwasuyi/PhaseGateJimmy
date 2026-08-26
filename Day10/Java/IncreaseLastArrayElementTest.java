


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IncreaseLastArrayElementTest {



    @Test
    public void TestThatTheOutputOfAnArrayIncreasesByOne() {

    // Given
    int[] numbers = {1, 2, 3};

    // When
    int[] actual = IncreaseLastArrayElementT.array(numbers);

    int[] expected = {1, 2, 4};

    // Check
    assertArrayEquals(expected, actual);
    }



    @Test
    public void TestThatOneIsAddedToNegativeLastElement() {

    // Given
    int[] numbers = {1, 2, -3};

    // When
    int[] actual = IncreaseLastArrayElementT.array(numbers);

    int[] expected = {1, 2, -2};

    // Check
    assertArrayEquals(expected, actual);
    }



    @Test
    public void TestThatOneIsAddedToZero() {

    // Given
    int[] numbers = {1, 2, 0};

    // When
    int[] actual = IncreaseLastArrayElementT.array(numbers);

    int[] expected = {1, 2, 1};

    // Check
    assertArrayEquals(expected, actual);
    }

}
