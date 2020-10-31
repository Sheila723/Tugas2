/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui2;

import java.awt.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author SheilaMallenium
 */
public class GUI2 extends Application {
     
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        
        primaryStage.show();
    GridPane grid = new GridPane();
    grid.setAlignment(Pos.CENTER);
    grid.setHgap(10);
    grid.setVgap(10); 

    Scene scene = new Scene(grid, 300, 275);
    primaryStage.setScene(scene);

    Text scenetitle = new Text("Welcome");
    scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
    grid.add(scenetitle, 0, 0, 2, 1);

    Label Nama = new Label("Nama:");
    grid.add(Nama, 0, 1);
    
    Label Telepon = new Label("Telepon:");
    grid.add(Telepon, 0, 2);
    
    Label Alamat = new Label("Alamat:");
    grid.add(Alamat, 0, 3);

    TextField userTextField = new TextField();
    grid.add(userTextField, 1, 1);
    TextField teleponinput = new TextField();
    grid.add(teleponinput, 1, 2);
    TextArea alamatinput = new TextArea();
    grid.add(alamatinput, 1,3);
    
    Button button = new Button("Kirim");
    grid.add(button, 0,4);
    Button haps = new Button("Hapus");
    grid.add(haps, 1,4);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
