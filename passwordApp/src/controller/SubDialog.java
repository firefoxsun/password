package controller;

import javafx.stage.Stage;

/** 
* @author zxr:zhaoxinran_dlmuit@163.com 
* @version ����ʱ�䣺2017��12��24�� ����9:45:04 
* ��˵�� 
*/
public interface SubDialog {
	
	//addButton ��Ӧ��������
	//����Ϣ¼�뵯������Ϣȷ�ϵ���
	public void add_RegisDialog(Stage primaryPage);
	public void add_ConfmDialog(Stage primaryPage);
	
	//deleteButton ��Ӧ��������
	//����Ϣ¼�뵯������Ϣȷ�ϵ���
	public void del_RegisDialog(Stage primaryPage);
	public void del_ConfmDialog(Stage primaryPage);
	
	//queryButton ��Ӧ��������
	//����Ϣ¼�뵯������Ϣȷ�ϵ���
	public void que_RegisDialog(Stage primaryPage);
	public void que_ConfmDialog(Stage primaryPage);
	
	//updateButton ��Ӧ��������
	//����Ϣ¼�뵯������Ϣȷ�ϵ���
	public void upd_RegisDialog(Stage primaryPage);
	public void upd_ConfmDialog(Stage primaryPage);
}
