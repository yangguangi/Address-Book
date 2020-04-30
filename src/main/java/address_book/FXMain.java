package address_book;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXMain extends Application
{
	private static Stage stage=new Stage();
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{	
		Parent root = FXMLLoader.load(getClass().getResource("../fxml/MainUI.fxml"));
        primaryStage.setTitle("通讯管理系统");
        primaryStage.setScene(new Scene(root, 1600, 800));
        primaryStage.setMinWidth(900);
        primaryStage.setMinHeight(300);
        primaryStage.show();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	public void  showWindow() throws Exception {
		start(stage);
	}
}