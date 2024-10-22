import java.util.*;
public class Student{
  int []credits;
  int []marks;
  int i,j;
  String name,USN;
  void accept(){
     Scanner a =new Scanner(System.in);
     System.out.println("enter name:");
     name=a.nextLine();
     System.out.println("enter USN:");
     USN=a.nextLine();
     System.out.println("enter no of subjects:");
     i=a.nextInt();
     marks=new int[i];
     credits=new int[i];
     for(j=0;j<i;j++){
        System.out.println("enter credit:");
        credits[j]=a.nextInt();
        System.out.println("enter marks:");
        marks[j]=a.nextInt();
        } }
   void display(){
      System.out.println("Name:"+name);
      System.out.println("USN:"+USN);
      System.out.println("Credits:");
      for(i=0;i<credits.length;i++){
         System.out.println(credits[i]);}
      System.out.println("Marks:");
      for(i=0;i<marks.length;i++){
         System.out.println(marks[i]);}
      System.out.println("SGPA:"+calc());}
   double calc(){
      int s1=0,s2=0;
      for(int i=0;i<marks.length;i++){
          s1+=marks[i]*credits[i];
          s2+=credits[i];}
      return (double) s1/(s2*100);}
  Student(){
      this.name=name;
      this.USN=USN;}
  public static void main(String[] args){
       Student obj=new Student();
       obj.accept();
       obj.display();
    }}
 