import processing.core.PApplet;
import java.awt.Color;

public abstract class Block extends PApplet {

     static int cellSize = 32;





     public int getRandomColor(PApplet a) {
          return a.color(random(255), random(255), random(255));
     }




}







