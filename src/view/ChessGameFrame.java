package view;

import controller.GameController;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * 这个类表示游戏窗体，窗体上包含：
 * 1 Chessboard: 棋盘
 * 2 JLabel:  标签
 * 3 JButton： 按钮
 */
public class ChessGameFrame extends JFrame {
    private JPanel panel0 = new JPanel();
    private final int WIDTH;
    private final int HEIGHT;
    public final int CHESSBOARD_SIZE;
    private GameController gameController;
    private static JLabel statusLabel;

    public Image image;

    public ChessGameFrame(int width, int height) throws IOException {
        setTitle("Dark Chess"); //设置标题
        this.WIDTH = width;
        this.HEIGHT = height;
        this.CHESSBOARD_SIZE = HEIGHT * 4 / 5;

        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null); // Center the window.
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //设置程序关闭按键，如果点击右上方的叉就游戏全部关闭了
        setLayout(null);

        addChessboard();
        addLabel();
        addCheatingButton();
        addLoadButton();

        Image image = new ImageIcon("C:\\Users\\LENOVO\\Desktop\\DarkChess-master (1)\\DarkChess-master\\src\\chessComponent\\15.jpg").getImage();
        JLabel jLabel = new aLabel(image);
        jLabel.setSize(WIDTH, HEIGHT);
        jLabel.setLocation(0, 0);
        panel0.add(jLabel);
    }


    /**
     * 在游戏窗体中添加棋盘
     */
    private void addChessboard() throws IOException {
        Chessboard chessboard = new Chessboard(CHESSBOARD_SIZE / 2, CHESSBOARD_SIZE);
        gameController = new GameController(chessboard);
        chessboard.setLocation(HEIGHT / 10 + 80, HEIGHT / 10 - 10);
        add(chessboard);
    }

    /**
     * 在游戏窗体中添加标签
     */
    private void addLabel() {
        statusLabel = new JLabel("black:60");
        statusLabel.setLocation(WIDTH * 3 / 5,   HEIGHT / 10);
        statusLabel.setSize(200, 60);
        statusLabel.setFont(new Font("Rockwell", Font.BOLD, 20));
        add(statusLabel);

        statusLabel = new JLabel("red:60");
        statusLabel.setLocation(WIDTH * 3 / 5,  2 * HEIGHT / 10);
        statusLabel.setSize(200, 60);
        statusLabel.setFont(new Font("Rockwell", Font.BOLD, 20));
        add(statusLabel);

        statusLabel = new JLabel("FIRST");
        statusLabel.setLocation(250, 0);
        statusLabel.setSize(200, 60);
        statusLabel.setFont(new Font("Rockwell", Font.BOLD, 20));
        add(statusLabel);
    }

    public static JLabel getStatusLabel() {
        return statusLabel;
    }

    /**
     * 在游戏窗体中增加一个按钮，如果按下的话就会显示Hello, world!
     */

    private void addReStartButton() {
        JButton button = new JButton("ReStart");//按钮上的字
        button.addActionListener((e) -> JOptionPane.showMessageDialog(this, "Hello, world!"));
        button.setLocation(WIDTH * 3 / 5, HEIGHT / 10 );//按钮的位置
        button.setSize(180, 60);//按钮大小
        button.setFont(new Font("Rockwell", Font.BOLD, 20));
        add(button);

    }


    private void addCheatingButton() {
        JButton button = new JButton("restart");//按钮上的字
        button.addActionListener((e) -> JOptionPane.showMessageDialog(this, "restart game"));
        button.setLocation(WIDTH * 3 / 5 + 80,  6 * HEIGHT / 10 );//按钮的位置
        button.setSize(180, 60);//按钮大小
        button.setFont(new Font("Rockwell", Font.BOLD, 20));
        add(button);

    }



    private void addLoadButton() {
        JButton button = new JButton("Load");
        button.setLocation(WIDTH * 3 / 5 + 80,  6 * HEIGHT / 10 + 120);
        button.setSize(180, 60);
        button.setFont(new Font("Rockwell", Font.BOLD, 20));
        button.setBackground(Color.LIGHT_GRAY);
        add(button);

        button.addActionListener(e -> {
            System.out.println("Click load");
            String path = JOptionPane.showInputDialog(this, "Input Path here");
            gameController.loadGameFromFile(path);
        });


    }


}
