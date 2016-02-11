import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import java.awt.*;
public class Rectangle extends GraphicsProgram{
      
   public void run(){
      try{
         RandomGenerator v = new RandomGenerator();
         GRect Rekt = new GRect(100, 100, 100, 100);
         Rekt.setFilled(true);
         Rekt.setFillColor(Color.RED);
         add(Rekt);
         Thread.sleep(1000);
         Rekt.setFillColor(v.nextColor());
         add(Rekt);
         Thread.sleep(1000);
         if(true)
            run();
      }
      catch(InterruptedException e){
         run();
      }
   }

   public static void main(String[] args){
      new Rectangle().start(args);
   }
      
}