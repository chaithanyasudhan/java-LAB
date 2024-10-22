public abstract class Animal{
  public abstract void sleep();
  public abstract void eat();
  public static void main(String[] args){
   Animal l=new Lion();
   Animal d=new Deer();
   Animal t=new Tiger();
   l.sleep();
   l.eat();
   d.sleep();
   d.eat();
   t.sleep();
   t.eat();
}}
