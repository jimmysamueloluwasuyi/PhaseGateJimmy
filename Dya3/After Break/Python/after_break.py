def letter_index(String):

  letter_index = 0

  for letter in string:

      if letter == letter.upper() and letter == letter.lower():

          letter_index = letter_index + 1

      elif letter == '1' or letter == '2' or letter == '3' or letter == '4' or letter == '5' or letter == '6' or letter == '7' or letter == '8' or letter == '9':

          letter_index = letter_index + 1

          print(letter)

  print(String, 'has', letter_index, 'letters')

string = input ("Enter random letters: ")

letter_index(string)



    
