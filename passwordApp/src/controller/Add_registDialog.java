package controller;

import static javafx.geometry.HPos.RIGHT;

import com.zxr.domain.User;
import com.zxr.domain.UserService;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author zxr:zhaoxinran_dlmuit@163.com
 * @version 创建时间：2017年12月24日 下午11:28:24 类说明
 */
public class Add_registDialog {
	public void add_registerDialog(Stage primaryStage) {
		final User user = null;
		primaryStage.setTitle("删除信息(输入需要删除的website)");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Text scenetitle = new Text("Input Information");
		scenetitle.setFont(Font.font("consolas", FontWeight.BOLD, 30));
		grid.add(scenetitle, 0, 0, 2, 1);
		// 第一行
		Label website = new Label("Website:");
		website.setFont(Font.font("consolas", FontWeight.NORMAL, 23));
		website.setMinWidth(30);
		grid.add(website, 0, 1);

		TextField websiteTextField = new TextField();
		grid.add(websiteTextField, 1, 1);
		websiteTextField.setPromptText("input Website");
		

		// button
		Button btn = new Button("Sign in");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);
		grid.add(hbBtn, 1, 8);

		final Text actiontarget = new Text();
		grid.add(actiontarget, 0, 8);
		grid.setColumnSpan(actiontarget, 2);
		grid.setHalignment(actiontarget, HPos.LEFT);
		actiontarget.setId("actiontarget");
		// 事件监听器
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				
				String web_s = websiteTextField.getText();
				
				if(new UserService().delete(web_s)){
					actiontarget.setFill(Color.BLACK);
					Font font = new Font(20);
					actiontarget.setFont(font);
					actiontarget.setText("数据成功插入数据库");
				}else{
					actiontarget.setText("数据插入数据库失败");
				}
			}
		});

		Scene scene = new Scene(grid,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
