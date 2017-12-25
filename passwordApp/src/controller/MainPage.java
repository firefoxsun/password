package controller;

import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 * @author zxr:zhaoxinran_dlmuit@163.com
 * @version 创建时间：2017年12月24日 上午10:40:38 类说明 主页面的controller实现
 */
public interface MainPage {
	// addButton控件
	public void addButton(Parent parent, Stage primaryPage);

	// deleteButton控件
	public void deleteButton(Parent parent, Stage primaryPage);

	// queryButton控件
	public void queryButton(Parent parent, Stage primaryPage);

	// updateButton控件
	public void updateButton(Parent parent, Stage primaryPage);
	
}
