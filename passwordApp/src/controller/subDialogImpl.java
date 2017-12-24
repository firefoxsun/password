package controller;

import java.io.IOException;

import com.zxr.domain.User;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


/**
 * @author zxr:zhaoxinran_dlmuit@163.com
 * @version ����ʱ�䣺2017��12��24�� ����1:04:16 ��˵�� AltretDialog ���൯����controller����
 */
public class subDialogImpl implements SubDialog {
	// �����ڶ�������

	@FXML
	private Button OKButton;
	@FXML
	private Button add_submit;
	

	@FXML
	public void OKButton(ActionEvent event) {
	}

	@Override
	public void add_RegisDialog(Stage primaryPage) {		
		//������Ϣ¼�����
		User user = new User();
		BooleanProperty accessGranted = new SimpleBooleanProperty(false);
		//����Add_RegisDialog.fxml�ļ�
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/view/add_RegisDialog.fxml"));
		System.out.println(getClass().getResource("/view/add_RegisDialog.fxml"));
		try {
			loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//======��ʾ����====
		// ��ȡ���ڵ�
		Parent root = loader.getRoot();
		// ��ʼ������
		Stage add_RegisDialog = new Stage(StageStyle.DECORATED);
		// ����һ��ģʽ���ڣ���ֹ�¼����ݵ������������ߴ��ڲ�νṹ
		add_RegisDialog.initModality(Modality.WINDOW_MODAL);
		// ʵ��ģ̬ ���ӽڵ��븸�ڵ�����
		add_RegisDialog.initOwner(primaryPage);
		// ָ��Ҫ�ڴ˽׶�ʹ�õĳ�����
		add_RegisDialog.setTitle("��Ϣ¼��");
		Scene scene = new Scene(root);
		add_RegisDialog.setScene(scene);
		//����ͨ�����ɼ�������Ϊtrue����ʾ�˴���
		add_RegisDialog.show();
		
		//controller�ؼ�ʵ��
		this.add_submit = (Button) root.lookup("#add_submit");
		add_submit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				//��javafx Bean ��ȡ��������
				 PasswordField passwordField = new PasswordField();
				 user.
				 passwordField.setOnAction(ActionEvent->{
					if(accessGranted.get()){
						System.out.println("password:"+);
					}
				 });
				//��¼������Ϣ�Ƿ�ɹ�
				add_ConfmDialog(add_RegisDialog);
			}
		});
		
	}

	@Override
	public void add_ConfmDialog(Stage primaryPage) {

		// ����AlertDialog.fxml�ļ�
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/view/add_ConfmDialog.fxml"));
		try {
			loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ��ȡ���ڵ�
		Parent root = loader.getRoot();
		// ��ʼ������
		Stage add_ConfmDialog = new Stage(StageStyle.DECORATED);
		// ������ֹ�¼����ݵ�����Ӧ�ó��򴰿ڵ�ģʽ���ڡ�Ҫʵ�������������
		add_ConfmDialog.initModality(Modality.APPLICATION_MODAL);
		// ʵ��ģ̬ ���ӽڵ��븸�ڵ�����
		add_ConfmDialog.initOwner(primaryPage);
		// ָ��Ҫ�ڴ˽׶�ʹ�õĳ�����
		add_ConfmDialog.setTitle("��ʾ");
		Scene scene = new Scene(root);
		add_ConfmDialog.setScene(scene);
		// ����ͨ�����ɼ�������Ϊtrue����ʾ�˴���
		add_ConfmDialog.show();

		// controller�ؼ�����
		this.OKButton = (Button) root.lookup("#OKButton");
		OKButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// subAddButton���Scence����Window����
				add_ConfmDialog.getScene().getWindow().hide();
			}
		});

	}

	@Override
	public void del_RegisDialog(Stage primaryPage) {

	}

	@Override
	public void del_ConfmDialog(Stage primaryPage) {
		// TODO Auto-generated method stub

	}

	@Override
	public void que_RegisDialog(Stage primaryPage) {
		// TODO Auto-generated method stub

	}

	@Override
	public void que_ConfmDialog(Stage primaryPage) {
		// TODO Auto-generated method stub

	}

	@Override
	public void upd_RegisDialog(Stage primaryPage) {
		// TODO Auto-generated method stub

	}

	@Override
	public void upd_ConfmDialog(Stage primaryPage) {
		// TODO Auto-generated method stub

	}

	@FXML public void add_password(ActionEvent event) {}

	@FXML public void add_website(ActionEvent event) {}

	@FXML public void add_urls(ActionEvent event) {}

	@FXML public void add_userName(ActionEvent event) {}

	@FXML public void add_email(ActionEvent event) {}

	@FXML public void add_tel(ActionEvent event) {}

	@FXML public void add_timeStamp(ActionEvent event) {}

	@FXML public void add_submit(ActionEvent event) {}

}