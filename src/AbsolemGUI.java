import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AbsolemGUI extends JFrame implements ActionListener {
    private JMenuBar dropMenu;
    private JMenu file;
    private JMenuItem newGame;
    private JMenuItem loadGame;
    private JMenuItem saveGame;
    private JMenuItem backMenu;
    private Board Board;

    public AbsolemGUI() {
        this.newGame = new JMenuItem("New Game");
        this.loadGame = new JMenuItem("Load Game");
        this.saveGame = new JMenuItem("Save Game");
        this.backMenu = new JMenuItem("Back To Menu");
        this.newGame.addActionListener(this);
        this.loadGame.addActionListener(this);
        this.saveGame.addActionListener(this);
        this.backMenu.addActionListener(this);
        this.file = new JMenu("File");
        this.file.add(this.newGame);
        this.file.add(this.saveGame);
        this.file.add(this.loadGame);
        this.file.add(this.backMenu);
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
            /*try{
                FileOutputStream fos = new FileOutputStream("absolem_data.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(AbsolemGUI.this);
                oos.close();
                fos.close();
                JOptionPane.showMessageDialog(null, "Game is successfully saved!","Saved Game!",JOptionPane.INFORMATION_MESSAGE);
            }catch (IOException ex){
                ex.printStackTrace();
            }*/
        }

        if (e.getSource() == this.loadGame)
        {
            /*try {
                //Set the current Connect four object references and values equal to the previously saved games values
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("absolem_data.ser"));
                AbsolemGUI previousGame = (AbsolemGUI) objectInputStream.readObject();
                AbsolemGUI.this.Board = previousGame.Board;
            }catch(Exception ex){
                ex.printStackTrace();
            }*/
        }

        if (e.getSource() == this.backMenu)
        {
            MenuGUI menu = new MenuGUI();
            this.dispose();
        }
    }
}