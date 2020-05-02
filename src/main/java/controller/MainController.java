package controller;

import java.net.URL;
import java.util.ResourceBundle;

import address_book.*;
import controller.AddGroup;
import controller.AddPerson;
import controller.DeleteGroup;
import controller.DeleteGroupFalse;
import controller.DeletePerson;
import controller.DeletePersonFalse;
import controller.ExportCSV;
import controller.ExportVCard;
import javafx.fxml.FXML;

public class MainController {
	
	AddressUtil ad = new AddressUtil();
	
	public MainController() {

	}

	@FXML
	private void initialize(URL arg0, ResourceBundle arg1) {

	}

	// �����ϵ��
	public void goToAddGroupUI() throws Exception {
		controller.AddGroup addGroup = new AddGroup();
		addGroup.showWindow();
	}

	// �����ϵ��
	public void goToAddPersonUI() throws Exception {
		controller.AddPerson addPerson = new AddPerson();
		addPerson.showWindow();
	}

	// �����ļ�ΪCSV
	public void goToExportCSVUI() throws Exception {
		//controller.ExportCSV exportCSV = new ExportCSV();
		//exportCSV.showWindow();
		ad.csvwrite();
	}

	// �����ļ�ΪvCard
	public void goToExportVCardUI() throws Exception {
		//controller.ExportVCard exportVCard = new ExportVCard();
		//exportVCard.showWindow();
		ad.vcardwrite();
	}

	// �����ļ�ΪCSV
	public void goToImportCSVUI() throws Exception {
		//controller.ExportCSV exportCSV = new ExportCSV();
		//exportCSV.showWindow();
		ad.csvread();
	}

	// �����ļ�ΪvCard
	public void goToImportVCardUI() throws Exception {
		//controller.ExportVCard exportVCard = new ExportVCard();
		//exportVCard.showWindow();
		ad.vcardread();
	}

	// ɾ����ϵ��ȷ�Ͻ���
	public void goToDeletePersonUI() throws Exception {
		controller.DeletePerson deletePerson = new DeletePerson();
		deletePerson.showWindow();
	}

	// δѡ��ɾ������ϵ�˵���ʧ��ҳ��
	public void goToDeletePersonFalseUI() throws Exception {
		controller.DeletePersonFalse deletePersonFalse = new DeletePersonFalse();
		deletePersonFalse.showWindow();
	}

	// ɾ����ϵ��ȷ�Ͻ���
	public void goToDeleteGroupUI() throws Exception {
		controller.DeleteGroup deleteGroup = new DeleteGroup();
		deleteGroup.showWindow();
	}

	// δѡ��ɾ������ϵ�鵯��ʧ��ҳ��
	public void goToDeleteGroupFalseUI() throws Exception {
		controller.DeleteGroupFalse deleteGroupFalse = new DeleteGroupFalse();
		deleteGroupFalse.showWindow();
	}

	// �û���Ϣ����� ���� ��ť�ر�ҳ��
	public void Confirmed() throws Exception {
		System.out.println("��������");
	}

	// �û���Ϣ����� ���� ��ť�ر�ҳ��
	public void Reseted() throws Exception {
		System.out.println("��������");
	}

	// �û���Ϣ����� ͷ�� ��ť�ر�ҳ��
	public void ChangedImg() throws Exception {
		System.out.println("��������ͷ���¼�");
	}

	// ��� ���� ��ť�����¼�
	public void Searched() throws Exception {
		System.out.println("���������¼�");
	}

}
