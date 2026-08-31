

let firstNumber = 4;

let secondNumber = 6;

let lcm = 1;

for (let index = 1; ; index++) {

if (index % firstNumber === 0 && index % secondNumber === 0) {

lcm = index;

break;
}
}

console.log("LCM = " + lcm);
