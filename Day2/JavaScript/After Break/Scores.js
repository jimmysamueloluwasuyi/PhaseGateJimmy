

function getAverageScore( score1, score2, score3) {

let sum = score1 + score2 + score3;

let averagesum = sum/3;

if (averagescores > 100 || averagescores <=0){
console.log("invalid");
} 

if (averagescores <=90 && averagescores <=100) {
console.log('A');

}else if (averagescores <=80 && averagescores <=90) {
console.log('B');

}else if(averagescores <=70 && averagescores <=80) {
console.log('C');

}else if (averagescores <=60 && averagescores <=70) {
console.log('D');

} else {
console.log("F");
}


}


}

getAverageScore(40,50,60);
