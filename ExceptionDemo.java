import java.util.*;
class MyException extends Exception{
   MyException(){
     super();
  }
  MyException(String msg){
     super(msg);
  }

}
class Father{
  int age;
   public Father(int age) throws MyException{            
      if(age<0){
       throw new MyException("fathers age cannot be negative");}
     this.age=age;
  } }
class Son extends Father{
   int sage;
   public Son(int fage, int sage) throws MyException{
    super(fage);  
    if (age < 0) {
        throw new MyException("son's age cannot be negative");
    }
    if (fage<=sage) {
        throw new MyException("son's age cannot be greater than or equal to father's");
    }
    this.sage = sage;
}
}
public class ExceptionDemo{
  public static void main(String[] args){
   Scanner s=new Scanner(System.in);
   try{
    System.out.println("enter father's age:");
    int f1=s.nextInt();
    System.out.println("enter son's age:");
    int s1=s.nextInt();
    Son son= new Son(f1,s1);
    System.out.println("fathers age:"+son.age+"sons age:"+son.sage);}
  catch(MyException e){
     System.out.println(e.getMessage());}
 }}
