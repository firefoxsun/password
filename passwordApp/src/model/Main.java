package model;
/**
 * �����߼���ϵ
 */

	
import javafx.application.Application;
import view.*;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	 MainPage mainPage = new MainPage();
	@Override
	public void start(Stage primaryStage) {
		try {
			//���ز�����Ϣ�����ļ�
			Parent root = FXMLLoader.load(getClass().getResource("/view/MainPage.fxml"));
			
			mainPage.addButton(root);
			mainPage.deletButton(root);
			mainPage.queryButton(root);
			mainPage.updateButton(root);
			
			primaryStage.setScene(new Scene(root));

			primaryStage.setTitle("�����ѯϵͳ");
			primaryStage.setResizable(false);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}