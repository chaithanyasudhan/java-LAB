import CIE.Internals;
import SEE.External;
import java.util.*;
public class Main{
   public static void main(String args[]){
      Scanner a=new Scanner(System.in);
      System.out.println("Enter the number of students:");
      int n=a.nextInt();
      a.nextLine();
      for(int j=0;j<n;j++){
        System.out.println("\nEnter details of Student:"+(j+1)+"\n Enter usn:");
        String usn=a.nextLine();
a.nextLine();
        System.out.println("\nEnter name:");
        String name=a.nextLine();
        System.out.println("\nEnter sem:");
        int sem=a.nextInt();
        int[] intmarks=new int[5];
        System.out.println("\nenter the internal marks for 5 courses:");
        for(int i=0;i<5;i++){
          intmarks[i]=a.nextInt();
  }
        int[] extmarks=new int[5];
        System.out.println("\nenter the external marks for 5 courses:");
        for(int i=0;i<5;i++){
          extmarks[i]=a.nextInt();
  }
        External e=new External(usn,name,sem,extmarks);
        System.out.println("\nFinal marksof "+(j+1)+" student out of 100:");
        for(int i=0;i<5;i++){
          int finalmarks=intmarks[i]+extmarks[i];
          System.out.println(finalmarks);
   }


  }
     
 }
}