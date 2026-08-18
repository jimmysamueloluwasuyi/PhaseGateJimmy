


public class FatherAndSonAge {

public static void main(String[] args){

calculateYears(50, 30);

}









public static void  calculateYears(int fatherAge, int sonAge){

int years = sonAge % fatherAge;

int twiceAge = sonAge * 2;

int differenceInAge = fatherAge - twiceAge;

if( twiceAge + fatherAge == twiceAge) {


System.out.print("The father's age will be twice as old as the son's age" + twiceAge + sonAge + "Years old");

} 

else if (fatherAge < twiceAge){

System.out.println("The father's age will be twice as old as the son's age" + differenceInAge*-1 + "Years old");

} else {

System.out.println("The father's age will be twice as old as the son's age" + (fatherAge - twiceAge) + "Years old");



}
}

}
















