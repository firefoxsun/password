package controller;

import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import view.MainPage;

/**
 * @author zxr:zhaoxinran_dlmuit@163.com
 * @version ����ʱ�䣺2017��12��24�� ����1:04:16 ��˵�� AltretDialog
 */
public class AlertDialog {
	// When the addUser success
	@FXML
	private Button OKButton;


	//���ڼ����û��Ƿ����ӽ������ݿ���
	public void subAddButton() {
		// ����AlertDialog.fxml�ļ�
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/view/subAddButton.fxml"));
		try {
			loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ��ȡ���ڵ�
		Parent root = loader.getRoot();
		// ��ʼ������
		Stage subAddButton = new Stage(StageStyle.DECORATED);
		// ����һ��ģʽ���ڣ���ֹ�¼����ݵ������������ߴ��ڲ�νṹ

		subAddButton.initModality(Modality.WINDOW_MODAL);
		// ʵ��ģ̬ ���ӽڵ��븸�ڵ�����
		subAddButton.initOwner(new Stage());
		// ָ��Ҫ�ڴ˽׶�ʹ�õĳ�����
		Scene scene = new Scene(root);
		subAddButton.setScene(scene);
		// ����ͨ�����ɼ�������Ϊtrue����ʾ�˴���
		subAddButton.show();

		// controller�ؼ�����
		this.OKButton = (Button) root.lookup("#OKButton");
		OKButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// subAddButton���Scence����Window����
				subAddButton.getScene().getWindow().hide();
			}
		});

	}

	@FXML public void OKButton(ActionEvent event) {
		
	}


}