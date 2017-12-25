package model;
/**
 * 处理逻辑关系
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
			//加载布局信息配置文件
			Parent root = FXMLLoader.load(getClass().getResource("/view/MainPage.fxml"));
			
			mainPage.addButton(root,mainStage);
			mainPage.deleteButton(root,mainStage);
			mainPage.queryButton(root,mainStage);
			mainPage.updateButton(root,mainStage);
			
			mainStage.setScene(new Scene(root));

			mainStage.setTitle("密码查询系统");
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
