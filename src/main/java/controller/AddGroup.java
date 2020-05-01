package controller;

import java.io.IOException;
 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
 
public class AddGroup extends Application {
	 static Stage stage=new Stage();
 
	@Override
	public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/AddGroup.fxml"));
        primaryStage.setTitle("�����");
        primaryStage.setScene(new Scene(root));
        primaryStage.show(); 
    }
 
	public static void main(String[] args) {
		launch(args);
	}
	
	public void  showWindow() throws Exception {
		start(stage);
	}
	
	//��� ȡ�� ��ť�ر�ҳ��
	public void Closed() throws Exception {
		AddGroup.stage.close();
	}
	
	//��� ȷ�� ��ť�ر�ҳ��
	public void Confirmed() throws Exception {
		AddGroup.stage.close();
	}
	
}