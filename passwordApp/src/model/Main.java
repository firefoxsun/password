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
	
	 MainPageImpl mainPage = new MainPageImpl();
	 
	@Override
	public void start(Stage mainStage) {
		try {
			//���ز�����Ϣ�����ļ�
			Parent root = FXMLLoader.load(getClass().getResource("/view/MainPage.fxml"));
			
			mainPage.addButton(root,mainStage);
			mainPage.deleteButton(root,mainStage);
			mainPage.queryButton(root,mainStage);
			mainPage.updateButton(root,mainStage);
			
			mainStage.setScene(new Scene(root));

			mainStage.setTitle("�����ѯϵͳ");
			mainStage.setResizable(false);
			mainStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
