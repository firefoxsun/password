package controller;

import javafx.stage.Stage;

/** 
* @author zxr:zhaoxinran_dlmuit@163.com 
* @version 创建时间：2017年12月24日 上午9:45:04 
* 类说明 
*/
public interface SubDialog {
	
	//addButton 
	//①信息录入弹窗
	public void add_RegisDialog(Stage primaryPage);
	
	//deleteButton 
	//①信息录入弹窗
	public void del_RegisDialog(Stage primaryPage);
	
	//queryButton 
	//①信息录入弹窗
	public void que_RegisDialog(Stage primaryPage);
	
	//updateButton 
	//①信息录入弹窗
	public void upd_RegisDialog(Stage primaryPage);
}
