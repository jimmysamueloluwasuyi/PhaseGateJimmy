


let number = 6;

let sum = 0;

for (let index = 1; index < number; index++) {

if (number % index === 0) {

sum = sum + index;
}
}

if (sum === number) {

console.log("Perfect number");

} else {

console.log("Not a perfect number");
}
