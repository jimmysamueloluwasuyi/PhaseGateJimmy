

function calculateYears(fatherAge, sonAge){

let years = sonAge % fatherAge;

let twiceAge = sonAge * 2;

let differenceInAge = fatherAge - twiceAge

if( twiceAge + fatherAge == twiceAge) {


System.out.print("The father's age will be twice as old as the son's age" + twiceAge + son + "Years old");

} 

else if (fatherAge < twiceAge){

console.log("The father's age will be twice as old as the son's age" + differenceInAge*-1 + "Years old");

} else {

console.log("The father's age will be twice as old as the son's age" + (fatherAge - twiceAge) + "Years old");



}
}


calculateYears(60, 40);

