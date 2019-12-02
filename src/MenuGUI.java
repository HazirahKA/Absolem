import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuGUI extends JFrame implements ActionListener {
    private ImageIcon absolem = new ImageIcon(getClass().getResource("Images/Absolem3.jpg"));
    private JLabel backgroundImg;
    private JMenuBar dropMenu;
    private JMenu file;
    private JMenu info;
    private JMenuItem newGame;
    private JMenuItem highscore;
    private JMenuItem howTo;
    private JPanel backGround;

    public MenuGUI() {
        super("Menu - Absolem");
        setSize(800, 800);
        setLocationRelativeTo(null);

        JFrame mainFrame = new JFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.howTo = new JMenuItem("How To Play");
        this.howTo.addActionListener(this);
        this.newGame = new JMenuItem("Play Game");
        this.newGame.addActionListener(this);
        this.highscore = new JMenuItem("Score Board");
        this.highscore.addActionListener(this);
        this.info = new JMenu("Information");
        this.file = new JMenu("File");
        this.file.add(this.newGame);
        this.file.add(this.highscore);
        this.info.add(this.howTo);
        this.dropMenu = new JMenuBar();
        this.dropMenu.add(this.file);
        this.dropMenu.add(this.info);
        this.backgroundImg = new JLabel();
        this.backgroundImg.setIcon(this.absolem);
        this.backGround = new JPanel();
        this.backGround.add(this.backgroundImg);
        setJMenuBar(this.dropMenu);
        add(this.backGround);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.newGame)
        {
            AbsolemGUI absolem = new AbsolemGUI();
            this.dispose();
        }

        if (e.getSource() == this.highscore)
        {
            JOptionPane.showMessageDialog(null,"Current highscore is:\n\n" + Board.getHighScore(),"Score Board",JOptionPane.INFORMATION_MESSAGE);
        }

        if (e.getSource() == this.howTo)
        {
            JOptionPane.showMessageDialog(null, "How To Play\n\n- Use your arrow keys to navigate \"Absolem\" and eat the red " +
                            "apple \n- \"Absolem\" can't hit the border of the screen \n- \"Absolem\" can't hit his own body"
                    ,"How To Play",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}