import javax.swing.*;
import java.awt.event.ActionListener;

public class AbsolemGUI extends JFrame implements ActionListener {
    private JMenuBar dropMenu;
    private JMenu file;
    private JMenuItem newGame;
    private JMenuItem loadGame;
    private JMenuItem saveGame;

    public AbsolemGUI() {
        this.newGame = new JMenuItem("New Game");
        this.loadGame = new JMenuItem("Load Game");
        this.saveGame = new JMenuItem("Save Game");
        this.newGame.addActionListener(this);
        this.loadGame.addActionListener(this);
        this.saveGame.addActionListener(this);
        this.file = new JMenu("File");
        this.file.add(this.newGame);
        this.file.add(this.loadGame);
        this.file.add(this.saveGame);
        this.dropMenu = new JMenuBar();
        this.dropMenu.add(this.file);
        setJMenuBar(this.dropMenu);
        setResizable(false);
        setVisible(true);
    }
}