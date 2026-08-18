


public class averageScore {

public static void main(String[] args){

getAverageScore(40,50,60);


}




public static void getAverageScore( score1, score2, score3) {

int sum = score1 + score2 + score3;

int averageSum = sum/3;

if (averagescores > 100 || averagescores <=0){
System.out.print("invalid");
} 

if (averagescores <=90 && averagescores <=100) {
System.out.print('A');

}else if (averagescores <=80 && averagescores <=90) {
System.out.print('B');

}else if(averagescores <=70 && averagescores <=80) {
System.out.print('C');

}else if (averagescores <=60 && averagescores <=70) {
System.out.print('D');

} else {
System.out.println("F");
}


}


}
