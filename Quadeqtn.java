import java.util.*;

public class Quadeqtn {
   public static void main(String[] args) {
     int a,b, c; double d, r1, r2;
     Scanner obj = new Scanner(System.in);
     System.out.println("Enter value of a:" );
     a = obj.nextInt();
     System.out.println("Enter value of b:");
     b = obj.nextInt();
     System.out.println("Enter value of c:");
     c= obj.nextInt();
     d=(b*b)-(4*a*c);
     if(d>0){
      r1=(-b+ Math.pow(d,0.5))/(2*a);
      r2=(-b-Math.pow(d,0.5)) /(2*a);
      System.out.println("Equation has real and distinct roots which are " + r1+" and"+r2);}
     else if(d==0){
      r1=(-b/2*a);
      System.out.println("It has real and equal roots which is" + r1);}
     else{
      System.out.println("it has no real roots");}}}