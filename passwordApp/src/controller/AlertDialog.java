package controller;

import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import view.MainPage;

/**
 * @author zxr:zhaoxinran_dlmuit@163.com
 * @version 创建时间：2017年12月24日 上午1:04:16 类说明 AltretDialog
 */
public class AlertDialog {
	// When the addUser success
	@FXML
	private Button OKButton;


	//用于监听用户是否添加进入数据库中
	public void subAddButton() {
		// 加载AlertDialog.fxml文件
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/view/subAddButton.fxml"));
		try {
			loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 获取根节点
		Parent root = loader.getRoot();
		// 初始化窗口
		Stage subAddButton = new Stage(StageStyle.DECORATED);
		// 定义一个模式窗口，阻止事件传递到其整个所有者窗口层次结构

		subAddButton.initModality(Modality.WINDOW_MODAL);
		// 实现模态 将子节点与父节点连接
		subAddButton.initOwner(new Stage());
		// 指定要在此阶段使用的场景。
		Scene scene = new Scene(root);
		subAddButton.setScene(scene);
		// 尝试通过将可见性设置为true来显示此窗口
		subAddButton.show();

		// controller控件函数
		this.OKButton = (Button) root.lookup("#OKButton");
		OKButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// subAddButton获得Scence对象，Window对象
				subAddButton.getScene().getWindow().hide();
			}
		});

	}

	@FXML public void OKButton(ActionEvent event) {
		
	}


}