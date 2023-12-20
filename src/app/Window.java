package src.app;

import javax.swing.*;

public class Window extends JFrame
{
    // Private fields //
    public static final int WINDOW_WIDTH = 1000;
    private static final int WINDOW_HEIGHT = 1000;

    protected static Window Instance;

    public static Window getInstance()
    {
        if (Instance == null)
        {
            Instance = new Window();
        }

        return Instance;
    }

    private Window()
    {
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setTitle("magicART TEST");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        this.setVisible(true);
    }
}
