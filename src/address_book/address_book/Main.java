package address_book;

import ezvcard.Ezvcard;
import ezvcard.VCard;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primarystage) throws Exception {
		// TODO Auto-generated method stub
		Group group = new Group();
		
		Scene root = new Scene(group); 
		primarystage.setTitle("通讯录管理系统");
		primarystage.setScene(root);
		primarystage.setHeight(600);
		primarystage.setWidth(1200);
		primarystage.show();
	}
}

