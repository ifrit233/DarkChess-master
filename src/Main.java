import view.ChessGameFrame;
import view.Initial;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Initial mainFrame = new Initial(880, 720);
            mainFrame.setVisible(true);
            try {
                Image background = ImageIO.read(new File("./image1/background.jpg"));
                JComponent backgroundComponent = new Initial.ImageComponent(background);
                backgroundComponent.setSize(880,720);
                backgroundComponent.setLocation(0,0);
                mainFrame.add(backgroundComponent);


            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });

    }
}
