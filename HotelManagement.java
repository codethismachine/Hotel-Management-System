/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_management;

import javafx.stage.Stage;


/**
 *
 * @author Jason
 */
public class Hotel_Management{

    public static void main(String[] args) {
       //launch(args);
//        HTMdatabase test = new HTMdatabase();
//       test.createTable();
//       test.insertTable();
//       test.readAllDataBase();
//       test.deleteRecord(9);
//       test.readAllDataBase();
        MainView test = new MainView();
        Stage primary = new Stage();
        test.start(primary);
    }
    
}
