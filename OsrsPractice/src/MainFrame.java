import javax.swing.*;

public class MainFrame extends JFrame{
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public MainFrame() {
        setTitle("OSRS Practice Tool");
        setSize(814, 675);
        setContentPane(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // set icon image to protect from magic icon :)
        ImageIcon img = new ImageIcon("C:\\Users\\burke\\Desktop\\OsrsPractice\\pics\\Protect_From_Magic.png");
        setIconImage(img.getImage());

        setVisible(true);

    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();

    }
}
