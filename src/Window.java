import javax.swing.*;

public class Window extends JFrame {
    public Window(String title) {
        super(title);
        int height = 720;
        int width = 480;
        int y = 100;
        int x = 100;
        setBounds(x, y, width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
