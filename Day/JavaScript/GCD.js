

let firstNumber = 12;

let secondNumber = 18;

let gcd = 1;

for (let index = 1; index <= firstNumber && index <= secondNumber; index++) {

if (firstNumber % index === 0 && secondNumber % index === 0) {

gcd = index;
}
}

console.log("GCD = " + gcd);
