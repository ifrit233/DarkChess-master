package chessComponent;

        import controller.ClickController;
        import model.ChessColor;
        import model.ChessboardPoint;

        import javax.imageio.ImageIO;
        import java.awt.*;
        import java.io.File;
        import java.io.IOException;

/**
 * 表示黑红车
 */
public class horseChessComponent extends ChessComponent {

    public horseChessComponent(ChessboardPoint chessboardPoint, Point location, ChessColor chessColor, ClickController clickController, int size) throws IOException {
        super(chessboardPoint, location, chessColor, clickController, size);
        Image image11 = ImageIO.read(new File("./image1/11.png"));
        Image image12 = ImageIO.read(new File("./image1/4.png"));
        if (this.getChessColor() == ChessColor.RED) {
            name = "傌";
            picture = image11;
        } else {
            name = "馬";
            picture = image12;
        }
    }

}