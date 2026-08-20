

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class testTransactionLogApp {

@Test

public void testThatIfIDepositeMoneyIGetIncreamentInTheAccountBalance(){

//Given
double currentAmount = 5000;

double depositAmount = 1000;



//when
double expectedAmount = TransactionLogApp.depositAmount(depositAmount, currentAmount);


//expeted
double actualAmount = 6000;



//check
assertEquals(actualAmount, expectedAmount);

}

@Test
public void testThatIfIWithdrawMoneyIGetDecreamentInTheAccountBalance(){

//given
double currentBalance = 5000;

double withdrawer = 1000;


//when

double expectedBalance = TransactionLogApp.amountWithdraw(withdrawer, currentBalance);


//expected
 double actualBalance = 4000;
 
 //check
 assertEquals(actualBalance, expectedBalance);
 

}

}

