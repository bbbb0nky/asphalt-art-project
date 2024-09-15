import org.code.neighborhood.*;

public class OutlinePainter extends MuralPainter {

  //outlines the whole body
  public void fullBodyOutline() {
    outlineStart();
    outlineRight("black");
    moveToCorner();
    moveToCorner();
    turnRight();
    outlineStart();
    move();
    outlineLeft("black");
    resetPosition();
    outlineStart();
    blackStripes("black");
    resetPosition();
  }

  //has the painter object move to the start of the figure
  public void outlineStart(){
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
}

  //has the painter outline the right side of the figure
  public void outlineRight(String color){
    turnLeft();
    move();
    paintLine(color, 1);
    turnRight();
    move();
    paintLine(color, 2);
    turnLeft();
    move();
    paintLine(color, 1);
    turnLeft();
    move();
    paintLine(color, 2);
    turnRight();
    move();
    paintLine(color, 1);
    diagonalRight(color, 5);
    turnRight();
    paintLine(color, 3);
    diagonalRight(color, 3);
    turnRight();
    paintLine(color, 3);
    turnAround();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    turnLeft();
    paintLine(color, 2);
    turnRight();
    move();
    paintLine(color, 1);
  }

  //has the painter outline the left side of the figure
  public void outlineLeft(String color){
    diagonalRight(color, 3);
    paintLine(color, 4);
    diagonalLeft(color, 3);
    turnLeft();
    paintLine(color, 2);
    turnAround();
    move();
    move();
    turnLeft();
    move();
    turnRight();
    move();
    paintLine(color, 1);
    turnLeft();
    move();
    paintLine(color, 1);
    turnLeft();
    moveFast();
  }

  //has the painter outline diagonally right
  public void diagonalRight(String color, int spaces){
    setPaint(spaces);

    while (hasPaint()) {
      if (canMove()) {
        paint(color);
        turnRight();
        move();
        turnLeft();
        move();
  }
    }
      }

  //has the painter paint diagonally left
  public void diagonalLeft(String color, int spaces){
    setPaint(spaces);

    while (hasPaint()) {
      if (canMove()) {
        paint(color);
        turnLeft();
        move();
        turnRight();
        move();
  }
    }
      }

  //has the painter paint the ear stripes
  public void blackStripes(String color){
    move();
    turnLeft();
    move();
    paintLine(color, 1);
    move();
    move();
    move();
    paintLine(color, 2);
  }
  
}
  

