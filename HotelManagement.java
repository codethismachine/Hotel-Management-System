/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_management;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.sql.*;
/**
 *
 * @author Jason
 */
public class Hotel_Management extends Application {

private final GridPane mainView = new GridPane();
private final GridPane loginView = new GridPane();    
    @Override
    public void start(Stage primaryStage) {
        Button empLogin = new Button();
        Button rmAvail = new Button();
        Button adminLogin = new Button();
        empLogin.setText("Employee Login");
        rmAvail.setText("Room availability");
        adminLogin.setText("Admin Login");
        
      /**  
       * This event handler will print "Login" to the console and will also 
       * populate a new window with a login forum. Still need to set up the
       * database to link to in order to store the information passed by the
       * user.
       */
        empLogin.setOnAction(new EventHandler<ActionEvent>() {
            
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Login");
                Text scenetitle = new Text("Welcome");
            scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
            loginView.add(scenetitle, 0, 0, 2, 1);

            Label userName = new Label("User Name:");
            loginView.add(userName, 0, 1);

            TextField userTextField = new TextField();
            loginView.add(userTextField, 1, 1);
              
           
            Label pw = new Label("Password:");
            loginView.add(pw, 0, 2);

            PasswordField pwBox = new PasswordField();
            loginView.add(pwBox, 1, 2);
            
            Button signIn = new Button("Sign In");
            signIn.setOnAction(new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent e){
                   if(userTextField.getText() != null && !userTextField.getText().isEmpty()){
                       userTextField.setText("Succesfull");
                   }
                   else{
                       userTextField.setText("Button Did not work");
                   }
                }
            });
            Button closeLogin = new Button("Close Window");
            
            HBox hBoxSign = new HBox(10);
            hBoxSign.setAlignment(Pos.BOTTOM_RIGHT);
            hBoxSign.getChildren().add(signIn);
            hBoxSign.getChildren().add(closeLogin);
            loginView.add(hBoxSign,1,4);
             Scene sceneLog = new Scene(loginView, 600, 450);
             Stage loginScreen = new Stage();
            loginScreen.setTitle("Employee Login");
            loginScreen.setScene(sceneLog);
            loginScreen.show();
            closeLogin.setOnAction(new EventHandler<ActionEvent>(){
               @Override
               public void handle(ActionEvent e){
                  loginScreen.close();
               }
            });
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
        
        mainView.setMinSize(400, 200);
        
        mainView.setVgap(5);
        mainView.setHgap(5);
    
        
        mainView.add(empLogin,0,0);
        mainView.add(rmAvail,1,0);
        mainView.add(adminLogin,0,1);
        Scene scene = new Scene( mainView, 600, 450);
        
        primaryStage.setTitle("Hotel Management");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
//        HTMdatabase test = new HTMdatabase();
//       test.createTable();
//       test.insertTable();
//       test.readAllDataBase();
//       test.deleteRecord(9);
//       test.readAllDataBase();
    }
    
}
