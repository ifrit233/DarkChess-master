package chessComponent;

import controller.ClickController;
import model.ChessColor;
import model.ChessboardPoint;
import org.w3c.dom.ls.LSOutput;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * 表示黑红车
 */
public class ChariotChessComponent extends ChessComponent {

    public ChariotChessComponent(ChessboardPoint chessboardPoint, Point location, ChessColor chessColor, ClickController clickController, int size) throws IOException {
        super(chessboardPoint, location, chessColor, clickController, size);
        Image image8 = ImageIO.read(new File("./image1/12.png"));
        Image image7 = ImageIO.read(new File("./image1/5.png"));
        if (this.getChessColor() == ChessColor.RED) {
            name = "俥";
            picture = image8;
        } else {
            name = "車";
            picture = image7;
        }
    }
   @Override
    public boolean canMoveTo(SquareComponent[][] chessboard, ChessboardPoint destination) {
        SquareComponent destinationChess = chessboard[destination.getX()][destination.getY()];
        return destinationChess.isReversal|| destinationChess instanceof EmptySlotComponent;
        //todo: complete this method

    }

}
