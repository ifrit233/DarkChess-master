package chessComponent;

import controller.ClickController;
import model.ChessColor;
import model.ChessboardPoint;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class CannonChessComponent extends ChessComponent {

    public CannonChessComponent(ChessboardPoint chessboardPoint, Point location, ChessColor chessColor, ClickController clickController, int size) throws IOException {
        super(chessboardPoint, location, chessColor, clickController, size);
        Image image11 = ImageIO.read(new File("./image1/13.png"));
        Image image12 = ImageIO.read(new File("./image1/6.png"));
        if (this.getChessColor() == ChessColor.RED) {
            name = "炮";
            picture = image11;
        } else {
            name = "砲";
            picture = image12;
        }

    }

}