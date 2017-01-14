/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import static javafx.scene.control.ContentDisplay.CENTER;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author Jason
 */
public class HotelManagement extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button empLogin = new Button();
        Button rmAvail = new Button();
        Button adminLogin = new Button();
        empLogin.setText("Employee Login");
        rmAvail.setText("Room availability");
        adminLogin.setText("Admin Login");
        empLogin.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Login");
            }
        });
         rmAvail.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Room Availability!");
            }
        });
         adminLogin.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Administrator");
            }
        });
        GridPane mainView = new GridPane();
        mainView.setMinSize(400, 200);
 
        mainView.setVgap(5);
        mainView.setHgap(5);
    
        
        mainView.add(empLogin,0,0);
        mainView.add(rmAvail,1,0);
        mainView.add(adminLogin,0,1);
        Scene scene = new Scene(mainView, 600, 450);
        
        primaryStage.setTitle("Hotel Management");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
