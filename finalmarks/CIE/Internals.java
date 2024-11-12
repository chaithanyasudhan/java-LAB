package CIE;
public class Internals extends Student{
   int[] imarks=new int[5];
   public Internals(String usn,String name,int sem,int[] imarks){
     super(usn,name,sem);
     this.imarks=imarks;
  }
   
}