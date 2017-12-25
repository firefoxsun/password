package view;

import java.net.URL;
import com.zxr.domain.*;

import controller.Add_registDialog;
import controller.MainPage;
import controller.SubDialog;
import controller.subDialogImpl;

import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * @author zxr:zhaoxinran_dlmuit@163.com
 * @version 创建时间：2017年12月23日 上午10:35:32 类说明 处理MainPage.fxml的控制类
 */
public class MainPageImpl implements Initializable, MainPage {
	@FXML
	private Button addButton;

	@FXML
	private Button deletButton;

	@FXML
	private Button queryButton;

	@FXML
	private Button updateButton;

	UserService userService = new UserService();

	// 子类对象指向父类的引用
	SubDialog subDialog = new subDialogImpl();

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	@Override
	// When user click on addButton
	public void addButton(Parent parent, Stage primaryPage) {
		// 初始化UI控件
		this.addButton = (Button) parent.lookup("#addButton");
		addButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("===录入信息===");
				// 进入录入信息界面
				subDialog.add_RegisDialog(primaryPage);
			}
		});
	}

	@Override
	// When user click on deletButton
	public void deleteButton(Parent parent, Stage primaryPage) {
		// 初始化控件
		this.deletButton = (Button) parent.lookup("#deletButton");
		deletButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("===删除信息===");
				subDialog.del_RegisDialog(primaryPage);
			}
		});
	}

	@Override
	// When user click on queryButton
	public void queryButton(Parent parent, Stage primaryPage) {
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

	@Override
	// when user click on updateButton
	public void updateButton(Parent parent, Stage primaryPage) {
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
