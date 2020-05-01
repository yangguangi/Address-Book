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
        primaryStage.setTitle("请选择要删除的联系人");
        primaryStage.setScene(new Scene(root));
        primaryStage.show(); 
    }
 
	public static void main(String[] args) {
		launch(args);
	}
	
	public void  showWindow() throws Exception {
		start(stage);
	}
	
	//点击 取消 按钮关闭页面
	public void Closed() throws Exception {
		DeletePersonFalse.stage.close();
	}
	
	//点击 确定 按钮关闭页面
	public void Confirmed() throws Exception {
		DeletePersonFalse.stage.close();
	}
}