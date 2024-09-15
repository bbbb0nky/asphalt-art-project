import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    //Creates the different types of painter objects
    MuralPainter mp = new MuralPainter();
    BodyPainter bp = new BodyPainter();
    OutlinePainter op = new OutlinePainter();
    FacePainter fp = new FacePainter();

    //paints the background for the mural
    mp.paintBackground("LightBlue", 16);

    //paints the main body orange
    bp.fullBodyPainter();

    //paints the outline of the figure
    op.fullBodyOutline();

    //paints the face of the figure
    fp.fullFacePainter();
  }
}