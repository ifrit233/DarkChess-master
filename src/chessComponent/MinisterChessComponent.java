package chessComponent;

import controller.ClickController;
import model.ChessColor;
import model.ChessboardPoint;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MinisterChessComponent extends ChessComponent {
    public MinisterChessComponent(ChessboardPoint chessboardPoint, Point location, ChessColor chessColor, ClickController clickController, int size) throws IOException {
        super(chessboardPoint, location, chessColor, clickController, size);
        Image image6 = ImageIO.read(new File("./image1/10.png"));
        Image image5 = ImageIO.read(new File("./image1/3.png"));
        if (this.getChessColor() == ChessColor.RED) {
            name = "相";
            picture = image6;
        } else {
            name = "象";
            picture = image5;
        }
    }
}
