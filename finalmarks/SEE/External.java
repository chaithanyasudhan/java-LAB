package SEE;
import CIE.Student;
public class External extends Student{
   int[] emarks=new int[5];
   public External(String usn,String name,int sem,int[] emarks){
     super(usn,name,sem);
     this.emarks=emarks;

}
}