import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

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

        initUI();
    }

    private void initUI() {
        add(new Board());

        setResizable(false);
        pack();

        setTitle("Absolem");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.newGame)
        {
            AbsolemGUI absolem = new AbsolemGUI();
            this.dispose();
        }

        if (e.getSource() == this.saveGame)
        {
        }

        if (e.getSource() == this.loadGame)
        {
        }
    }
}