class BMSThread extends Thread{
  public void run(){
    try{
      while(true){
       System.out.println("BMS College Of Engineering");
       Thread.sleep(10000);
  }}
    catch(InterruptedException i){
      System.out.println("BMSThread Interrupted");
  }
 }
}
class CSEThread extends Thread{
  public void run(){
    try{                                                                                                         
      while(true){
       System.out.println("CSE");
       Thread.sleep(2000);
  }}
    catch(InterruptedException i){
      System.out.println("CSEThread Interrupted");
  }
 }
}
public class DemoThread{
  public static void main(String[] args){
    BMSThread b=new BMSThread();
    CSEThread c=new CSEThread();
    b.start();
    c.start();
  }
}