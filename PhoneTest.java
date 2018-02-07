import java.util.Scanner;
public class PhoneTest {
public static void main (String [] args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the Phone's Name");
String PhoneName2= scan.nextLine();
System.out.println("Enter the Phone's Brand");
String PhoneBrand2= scan.nextLine();
System.out.println("Enter the phone's Yearreleased");
String YearReleased2=scan.nextLine();
System.out.println("Enter the Price");
String Price2=scan.nextLine();
Phone to= new Phone(PhoneName2, PhoneBrand2, YearReleased2, Price2);
System.out.println(PhoneName2 +PhoneBrand2+YearReleased2+ Price2);
}
}