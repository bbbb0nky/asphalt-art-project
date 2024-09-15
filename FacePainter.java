import org.code.neighborhood.*;

public class FacePainter extends MuralPainter {

  //paints the full face
  public void fullFacePainter(){
    faceStart();
    eyes();
    resetPosition();
    faceStart();
    nose();
    resetPosition();
    faceStart();
    mouth();
    resetPosition();
  }

  //goes to the starting position
  public void faceStart() {
  for (int i = 0; i < 4; i++) {
  move();
}
  turnRight();
  
  for (int i = 0; i < 8; i++) {
  move();
}
}

  //paints the eyes of the figure
  public void eyes() {
    turnLeft();
    paintLine("black", 1);
    for (int i = 0; i < 5; i++) {
    move();
  }
    paintLine("black", 1);
    
  }

  //paints the nose of the figure
  public void nose() {
    move();
    turnLeft();
    move();
    move();
    paintLine("pink", 3);
    
  }

  //paints the mouth of the figure
  public void mouth() {
    move();
    move();
    turnLeft();
    paintLine("khaki", 2);
    move();
    move();
    move();
    paintLine("Khaki", 2); 
    
  }
  
}
  

