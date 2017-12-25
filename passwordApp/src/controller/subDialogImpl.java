package controller;


import com.zxr.domain.User;
import com.zxr.domain.UserService;

import javafx.event.ActionEvent;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author zxr:zhaoxinran_dlmuit@163.com
 * @version 创建时间：2017年12月24日 上午1:04:16 类说明 AltretDialog 各类弹窗的controller方法
 */
public class subDialogImpl implements SubDialog {
	// 主窗口对象生成

	@FXML
	private Button OKButton;
	@FXML
	private Button add_submit;
	/*
	 * @FXML private TextField add_website = null;
	 * 
	 * @FXML private TextField add_urls;
	 * 
	 * @FXML private TextField add_userName;
	 * 
	 * @FXML private TextField add_email;
	 * 
	 * @FXML private PasswordField add_password;
	 * 
	 * @FXML private TextField add_tel;
	 * 
	 * @FXML private TextField add_timeStamp;
	 */

	// 录入信息的二级弹窗
	@Override
	public void add_RegisDialog(Stage primaryPage) {
		
		primaryPage.setTitle("录入信息(请不要输入相同website两次)");
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
		// 2
		Label urls = new Label("Urls:");
		urls.setFont(Font.font("consolas", FontWeight.NORMAL, 23));
		grid.add(urls, 0, 2);

		TextField urlsTextField = new TextField();
		grid.add(urlsTextField, 1, 2);
		urlsTextField.setPromptText("input Urls");
		// 3
		Label userName = new Label("UserName:");
		userName.setFont(Font.font("consolas", FontWeight.NORMAL, 23));
		grid.add(userName, 0, 3);

		TextField userNameTextField = new TextField();
		grid.add(userNameTextField, 1, 3);
		userNameTextField.setPromptText("input UserName");
		// 4
		Label email = new Label("Email:");
		email.setFont(Font.font("consolas", FontWeight.NORMAL, 23));
		grid.add(email, 0, 4);

		TextField emailTextField = new TextField();
		grid.add(emailTextField, 1, 4);
		emailTextField.setPromptText("input Email");
		// 5
		Label pw = new Label("Password:");
		pw.setFont(Font.font("consolas", FontWeight.NORMAL, 23));
		grid.add(pw, 0, 5);

		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 5);
		pwBox.setPromptText("input pwBox");

		// 6
		Label tel = new Label("Tel:");
		tel.setFont(Font.font("consolas", FontWeight.NORMAL, 23));
		grid.add(tel, 0, 6);

		TextField telTextField = new TextField();
		grid.add(telTextField, 1, 6);
		telTextField.setPromptText("input TimeStamp");
		// 7
		Label timeStamp = new Label("TimeStamp:");
		timeStamp.setFont(Font.font("consolas", FontWeight.NORMAL, 23));
		grid.add(timeStamp, 0, 7);

		TextField timeStampTextField = new TextField();
		grid.add(timeStampTextField, 1, 7);
		timeStampTextField.setPromptText("input TimeStamp");

		// button
		Button btn = new Button("EXECUTE");
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
				String urls_s = urlsTextField.getText();
				String userName_s = userNameTextField.getText();
				String email_s = emailTextField.getText();
				String password_s = pwBox.getText();
				String tel_s = telTextField.getText();
				String timeStamp_s = timeStampTextField.getText();
				User user = new User(web_s, urls_s, userName_s, email_s, password_s, tel_s, timeStamp_s);
				if (new UserService().regist(user)) {
					actiontarget.setFill(Color.BLACK);
					Font font = new Font(20);
					actiontarget.setFont(font);
					actiontarget.setText("数据成功插入数据库");
				} else {
					actiontarget.setText("数据插入数据库失败");
				}
			}
		});

		Scene scene = new Scene(grid, 500, 500);
		Stage stage = new Stage();
		stage.initOwner(primaryPage);
		stage.setScene(scene);
		stage.show();

	}

	// 没写好，有一个不能解决的问题放弃这个方法
	/*
	 * public void add_RegisDialog(Stage primaryPage) {
	 * 
	 * 
	 * // 加载Add_RegisDialog.fxml文件 FXMLLoader loader = new FXMLLoader();
	 * loader.setLocation(getClass().getResource("/view/add_RegisDialog.fxml"));
	 * 
	 * try { loader.load(); } catch (IOException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); }
	 * 
	 * // ======显示窗口==== // 获取根节点 Parent root = loader.getRoot(); // 初始化窗口 Stage
	 * add_RegisDialog = new Stage(StageStyle.DECORATED);
	 * 
	 * // 定义一个模式窗口，阻止事件传递到其整个所有者窗口层次结构
	 * add_RegisDialog.initModality(Modality.WINDOW_MODAL); // 实现模态 将子节点与父节点连接
	 * add_RegisDialog.initOwner(primaryPage);
	 * 
	 * // 指定要在此阶段使用的场景。 add_RegisDialog.setTitle("信息录入");
	 * 
	 * Scene scene = new Scene(root); add_RegisDialog.setScene(scene); //
	 * 尝试通过将可见性设置为true来显示此窗口 add_RegisDialog.show();
	 * 
	 * // controller控件实现
	 * 
	 * TextField website = new TextField(); System.out.println(website); final
	 * TextField urls = new TextField(); final TextField userName = new
	 * TextField(); final TextField email = new TextField(); final PasswordField
	 * passwordField = new PasswordField(); final TextField tel = new
	 * TextField(); final TextField timeStamp = new TextField();
	 * 
	 * this.add_submit = (Button) root.lookup("#add_submit");
	 * add_submit.setOnAction(new EventHandler<ActionEvent>() {
	 * 
	 * @Override public void handle(ActionEvent event) {
	 * System.out.println("进入事件处理"); // 用javafx Bean 获取界面输入 add_website = new
	 * TextField(); System.out.println(add_website);
	 * System.out.println(add_website.getText().isEmpty());
	 * if(add_website.getText() != null && !add_website.getText().isEmpty()){
	 * String WEBSITE = add_website.getText(); String URLS = add_urls.getText();
	 * String USERNAME = add_userName.getText(); String EMAIL =
	 * add_email.getText(); String PASSWORD = add_password.getText(); String TEL
	 * = add_tel.getText(); String TIMESTAMP = add_timeStamp.getText();
	 * System.out.println(WEBSITE); System.out.println(PASSWORD); }else{
	 * System.out.println("存入失败"); }
	 * 
	 * 
	 * // 记录存入信息是否成功
	 * 
	 * //add_ConfmDialog(add_RegisDialog); } });
	 * 
	 * }
	 */
	// 删除信息的二级弹窗
	@Override
	public void del_RegisDialog(Stage primaryPage) {
		primaryPage.setTitle("删除信息(输入需要删除的website)");
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
		Button btn = new Button("EXECUTE");
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

				if (new UserService().delete(web_s)) {
					actiontarget.setFill(Color.BLACK);
					Font font = new Font(20);
					actiontarget.setFont(font);
					actiontarget.setText("数据成功从数据库删除");
				} else {
					actiontarget.setText("数据删除失败");
				}
			}
		});

		Scene scene = new Scene(grid, 500, 500);
		Stage stage = new Stage();
		stage.initOwner(primaryPage);
		stage.setScene(scene);
		stage.show();

	}

	@Override
	public void que_RegisDialog(Stage primaryPage) {
		primaryPage.setTitle("检索信息(输入需要检索的website)");
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
		Button btn = new Button("EXECUTE");
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
				UserService service = new UserService();
				User user = service.query(web_s);
				if (user != null) {
					actiontarget.setFill(Color.BLACK);
					Font font = new Font(20);
					actiontarget.setFont(font);
					displayInfo(primaryPage, user);

				} else {
					actiontarget.setText("数据检索失败");
				}
			}
		});

		Scene scene = new Scene(grid, 500, 500);
		Stage stage = new Stage();
		stage.initOwner(primaryPage);
		stage.setScene(scene);
		stage.show();

	}

	public void displayInfo(Stage primaryStage, User user) {
		primaryStage.setTitle("信息展示");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Text scenetitle = new Text("Input Information");
		scenetitle.setFont(Font.font("consolas", FontWeight.BOLD, 30));
		grid.add(scenetitle, 0, 0, 2, 1);

		// 1
		Label display = new Label("Website:");
		display.setFont(Font.font("consolas", FontWeight.NORMAL, 23));
		display.setMinWidth(30);
		grid.add(display, 0, 1);
		// 2
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setWrapText(true);
		textArea.setFont(new Font(20));
		System.out.println(user.getWebsite());
		textArea.setText("Website:" + "\t" + user.getWebsite() + "\n" + "Urls:" + "\t" + user.getUrls() + "\n"
				+ "UserName:" + "\t" + user.getUserName() + "\n" + "Email:" + "\t" + user.getEmail() + "\n"
				+ "Password:" + "\t" + user.getPassword() + "\n" + "Tel:" + "\t" + user.getTel() + "\n" + "TimeStamp:"
				+ "\t" + user.getTimeStamp());
		grid.add(textArea, 0, 2);

		Scene scene = new Scene(grid, 500, 500);
		Stage stage = new Stage();
		stage.initOwner(primaryStage);
		stage.setScene(scene);
		stage.show();

	}

	@Override
	public void upd_RegisDialog(Stage primaryPage) {
		primaryPage.setTitle("修改信息");
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
		// 2
		Label urls = new Label("Urls:");
		urls.setFont(Font.font("consolas", FontWeight.NORMAL, 23));
		grid.add(urls, 0, 2);

		TextField urlsTextField = new TextField();
		grid.add(urlsTextField, 1, 2);
		urlsTextField.setPromptText("input Urls");
		// 3
		Label userName = new Label("UserName:");
		userName.setFont(Font.font("consolas", FontWeight.NORMAL, 23));
		grid.add(userName, 0, 3);

		TextField userNameTextField = new TextField();
		grid.add(userNameTextField, 1, 3);
		userNameTextField.setPromptText("input UserName");
		// 4
		Label email = new Label("Email:");
		email.setFont(Font.font("consolas", FontWeight.NORMAL, 23));
		grid.add(email, 0, 4);

		TextField emailTextField = new TextField();
		grid.add(emailTextField, 1, 4);
		emailTextField.setPromptText("input Email");
		// 5
		Label pw = new Label("Password:");
		pw.setFont(Font.font("consolas", FontWeight.NORMAL, 23));
		grid.add(pw, 0, 5);

		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 5);
		pwBox.setPromptText("input pwBox");

		// 6
		Label tel = new Label("Tel:");
		tel.setFont(Font.font("consolas", FontWeight.NORMAL, 23));
		grid.add(tel, 0, 6);

		TextField telTextField = new TextField();
		grid.add(telTextField, 1, 6);
		telTextField.setPromptText("input TimeStamp");
		// 7
		Label timeStamp = new Label("TimeStamp:");
		timeStamp.setFont(Font.font("consolas", FontWeight.NORMAL, 23));
		grid.add(timeStamp, 0, 7);

		TextField timeStampTextField = new TextField();
		grid.add(timeStampTextField, 1, 7);
		timeStampTextField.setPromptText("input TimeStamp");

		// button
		Button btn = new Button("EXECUTE");
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
				String urls_s = urlsTextField.getText();
				String userName_s = userNameTextField.getText();
				String email_s = emailTextField.getText();
				String password_s = pwBox.getText();
				String tel_s = telTextField.getText();
				String timeStamp_s = timeStampTextField.getText();
				User user = new User(web_s, urls_s, userName_s, email_s, password_s, tel_s, timeStamp_s);
				if (new UserService().update(user)) {
					actiontarget.setFill(Color.BLACK);
					Font font = new Font(20);
					actiontarget.setFont(font);
					actiontarget.setText("数据修改成功");
				} else {
					actiontarget.setText("数据修改失败");
				}
			}
		});

		Scene scene = new Scene(grid, 500, 500);
		Stage stage = new Stage();
		stage.initOwner(primaryPage);
		stage.setScene(scene);
		stage.show();

	}
}