package controller;

import javafx.stage.Stage;

/** 
* @author zxr:zhaoxinran_dlmuit@163.com 
* @version ����ʱ�䣺2017��12��24�� ����9:45:04 
* ��˵�� 
*/
public interface SubDialog {
	
	//addButton 
	//����Ϣ¼�뵯��
	public void add_RegisDialog(Stage primaryPage);
	
	//deleteButton 
	//����Ϣ¼�뵯��
	public void del_RegisDialog(Stage primaryPage);
	
	//queryButton 
	//����Ϣ¼�뵯��
	public void que_RegisDialog(Stage primaryPage);
	
	//updateButton 
	//����Ϣ¼�뵯��
	public void upd_RegisDialog(Stage primaryPage);
}
