

let number = 153;

let originalNumber = number;

let sum = 0;

while (number !== 0) {

let digit = number % 10;

sum = sum + (digit * digit * digit);

number = Math.floor(number / 10);
}

if (sum === originalNumber) {

console.log("Armstrong number");

} else {

console.log("Not an Armstrong number");
}
