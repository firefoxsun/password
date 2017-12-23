package view;

import java.net.URL;

import com.zxr.domain.*;

import controller.AlertDialog;

import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;

/**
 * @author zxr:zhaoxinran_dlmuit@163.com
 * @version 创建时间：2017年12月23日 上午10:35:32 类说明 处理MainPage.fxml的控制类
 */
public class MainPage implements Initializable {
	@FXML
	private Button addButton;

	@FXML
	private Button deletButton;

	@FXML
	private Button queryButton;

	@FXML
	private Button updateButton;

	UserService userService = new UserService();
	AlertDialog alertDialog = new AlertDialog();

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	// When user click on addButton
	public void addButton(Parent parent) {
		// 初始化UI控件
		this.addButton = (Button) parent.lookup("#addButton");
		addButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("===录入信息===");
				User user = new User("aoo", "https://www.csdn.net/", "firefoxsun", "zhaoxinran_dlmuit@163.com",
						"1998111522222", "18098847785", "123456");
				userService.regist(user);
				//进入第二界面
				alertDialog.subAddButton();
			}
		});
	}
	
	// When user click on deletButton
	public void deletButton(Parent parent) {
		// 初始化控件
		this.deletButton = (Button) parent.lookup("#deletButton");
		deletButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("===删除信息===");
				User user = new User("aoo", "https://www.csdn.net/", "firefoxsun", "zhaoxinran_dlmuit@163.com",
						"1998111522222", "18098847785", "123456");
				userService.delete(user);
			}
		});
	}

	// When user click on queryButton
	public void queryButton(Parent parent) {
		this.queryButton = (Button) parent.lookup("#queryButton");
		queryButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("===检索信息===");
				String website = "aoooo";
				userService.query(website);
			}
		});
	}

	// when user click on updateButton
	public void updateButton(Parent parent) {
		this.updateButton = (Button) parent.lookup("#updateButton");
		updateButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("===更新信息===");
				User user = new User("aoo", "https://www.ac.net/", "firefoxsun", "zhaoxinran_dlmuit@163.com",
						"1998111SDFD522222", "1807785", "123456");
				userService.update(user);
			}
		});
	}

}
