import org.code.neighborhood.*;

public class BodyPainter extends MuralPainter {

  //paints the full body 
  public void fullBodyPainter() {
    begginingPosition();
    headBase("orange");
    bodyBase("orange");
    resetPosition();
  }

  //has the painter go to the begining of figure
  public void begginingPosition () {
    move();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    move();
  }

  //has the painter paint the head
  public void headBase(String color){
  
    turnLeft();
    paintLine(color, 2);
    move();
    paintLine(color, 3);
    turnToWest();
    paintLine(color, 4);
    move();
    paintLine(color, 3);
    turnToEast();
    paintLine(color, 10);
    turnToWest();
    paintLine(color, 12);
    
    for (int i = 0; i < 2; i++) {
    turnToEast();
    move();
    paintLine(color, 13);
    turnToWest();
    move();
    paintLine(color, 13);
}
    turnToEast();
    move();
    move();
    paintLine(color, 11);
    turnToWest();
    move();
    move();
    paintLine(color, 9);
    turnToEast();
    move();
    move();
    paintLine(color, 7);
    turnToWest();
    move();
    move();
  
  }

  //has the painter paint the body
  public void bodyBase(String color){
    turnAround();
    moveFast();
    turnAround();
    move();
    paintLine(color, 12);
    turnToEast();
    paintLine(color, 15);
  }
  
}

