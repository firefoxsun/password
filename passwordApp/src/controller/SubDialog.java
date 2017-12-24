package controller;

import javafx.stage.Stage;

/** 
* @author zxr:zhaoxinran_dlmuit@163.com 
* @version 创建时间：2017年12月24日 上午9:45:04 
* 类说明 
*/
public interface SubDialog {
	
	//addButton 对应两个弹窗
	//①信息录入弹窗②信息确认弹窗
	public void add_RegisDialog(Stage primaryPage);
	public void add_ConfmDialog(Stage primaryPage);
	
	//deleteButton 对应两个弹窗
	//①信息录入弹窗②信息确认弹窗
	public void del_RegisDialog(Stage primaryPage);
	public void del_ConfmDialog(Stage primaryPage);
	
	//queryButton 对应两个弹窗
	//①信息录入弹窗②信息确认弹窗
	public void que_RegisDialog(Stage primaryPage);
	public void que_ConfmDialog(Stage primaryPage);
	
	//updateButton 对应两个弹窗
	//①信息录入弹窗②信息确认弹窗
	public void upd_RegisDialog(Stage primaryPage);
	public void upd_ConfmDialog(Stage primaryPage);
}
