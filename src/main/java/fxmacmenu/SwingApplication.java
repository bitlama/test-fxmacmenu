package fxmacmenu;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SwingApplication {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFXPanel panel = new JFXPanel();
            JFrame frame = new JFrame("Mac Menu Test");
            frame.setSize(300, 200);
            frame.setJMenuBar(createMenuBar());
            frame.setContentPane(panel);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setVisible(true);

            Platform.runLater(() -> initContent(panel));
        });
    }

    private static void initContent(JFXPanel panel) {
        panel.setScene(new Scene(new Label("I'm label")));
    }

    private static JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        for (int i = 1; i <= 3; i++) {
            menuBar.add(createMenu(i));
        }
        return menuBar;
    }

    private static JMenu createMenu(int n) {
        JMenu menu = new JMenu("Menu " + n);
        for (int i = 0; i < 3; i++) {
            menu.add(new JMenuItem(String.format("Menu Item %d - %d", n, i)));
        }
        return menu;
    }
}
