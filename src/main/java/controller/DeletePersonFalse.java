package controller;

import java.io.IOException;
 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
 
public class DeletePersonFalse extends Application {
	 static Stage stage=new Stage();
 
	@Override
	public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/DeletePersonFalse.fxml"));
        primaryStage.setTitle("��ѡ��Ҫɾ������ϵ��");
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
		DeletePersonFalse.stage.close();
	}
	
	//��� ȷ�� ��ť�ر�ҳ��
	public void Confirmed() throws Exception {
		DeletePersonFalse.stage.close();
	}
}