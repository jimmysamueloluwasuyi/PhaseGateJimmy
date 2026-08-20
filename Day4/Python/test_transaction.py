

from unittest import TestCase

from transaction app import *

class testing_transaction(TestCase):

def test_thatWhen_ideposit_theAmountAdd_ToTheAccountBalance_theDeposit(self):

  actual_balance = 600 

  actual_deposit = 500  

  expected_balance = 1100 

  self.assertEqual(expected_balance, actual_deposit)

def test_thatWhen_iwithdraw_theAccountBalanceReduces_withdraw(self):

  actual_balance = 500

  expected_withdraw = 200

  expected_balance = 300

  self.assertEqual(expected_balance, actual_withdraw)	 




