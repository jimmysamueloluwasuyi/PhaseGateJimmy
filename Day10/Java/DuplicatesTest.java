

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DuplicatesTest {

@Test
public void testThatDuplicateNumberReturnsTrue() {

// Given
int[] number = {1, 2, 3, 1};

// When
boolean actual = Duplicates.DuplicatesChecker(number);

boolean expected = true;

// Check
assertEquals(expected, actual);
}

@Test
public void testThatNoDuplicateNumberReturnFalse() {

// Given
int[] number = {1, 2, 3, 4};

// When
boolean actual = Duplicates.DuplicatesChecker(number);

boolean expected = false;

// Check
assertEquals(expected, actual);
}
}
