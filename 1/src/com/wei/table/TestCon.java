package com.wei.table;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/** 
* @author zxr:zhaoxinran_dlmuit@163.com 
* @version ����ʱ�䣺2017��12��24�� ����10:11:40 
* ��˵�� 
*/
public class TestCon extends Application {
	//�����ļ�
	private Button button;
	final TextField text1 = new TextField();
	final TextField text2 = new TextField();
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("test.fxml"));
		primaryStage.setScene(new Scene(root));

		primaryStage.setTitle("�����ѯϵͳ");
		primaryStage.setResizable(false);
		primaryStage.show();
		
		this.button = (Button) root.lookup("#button");
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				String text = text1.getText();
				System.out.println(text);
				
			}
		});
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
	

}
