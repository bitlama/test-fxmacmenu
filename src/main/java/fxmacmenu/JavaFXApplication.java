package fxmacmenu;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Mac Menu Test");
        stage.setScene(new Scene(createRoot()));
        stage.setWidth(300);
        stage.setHeight(200);
        stage.show();
    }

    private Parent createRoot() {
        return new VBox(createMenuBar(), createContent());
    }

    private Node createContent() {
        return new Label("I'm label");
    }

    private MenuBar createMenuBar() {
        return new MenuBar(createMenu(1), createMenu(2), createMenu(3));
    }

    private Menu createMenu(int n) {
        Menu menu = new Menu("Menu " + n);
        for (int i = 0; i < 3; i++) {
            menu.getItems().add(new MenuItem(String.format("Menu Item %d - %d", n, i)));
        }
        return menu;
    }
}
