package controller;

import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 * @author zxr:zhaoxinran_dlmuit@163.com
 * @version ����ʱ�䣺2017��12��24�� ����10:40:38 ��˵�� ��ҳ���controllerʵ��
 */
public interface MainPage {
	// addButton�ؼ�
	public void addButton(Parent parent, Stage stage);

	// deleteButton�ؼ�
	public void deleteButton(Parent parent, Stage stage);

	// queryButton�ؼ�
	public void queryButton(Parent parent, Stage stage);

	// updateButton�ؼ�
	public void updateButton(Parent parent, Stage stage);
	
}