package controller;

import java.net.URL;
import java.util.ResourceBundle;

import controller.AddGroup;
import controller.AddPerson;
import controller.DeleteGroup;
import controller.DeleteGroupFalse;
import controller.DeletePerson;
import controller.DeletePersonFalse;
import controller.ExportCSV;
import controller.ExportVCard;
import javafx.fxml.FXML;

public class MainController
{
	public MainController()
	{
		
	}
	
	@FXML
	private void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	//添加联系组
	public void goToAddGroupUI() throws Exception {
		controller.AddGroup addGroup = new AddGroup();
		addGroup.showWindow();
	}
	
	//添加联系人
	public void goToAddPersonUI() throws Exception {
		controller.AddPerson addPerson = new AddPerson();
		addPerson.showWindow();
	}
	
	//导出文件为CSV
	public void goToExportCSVUI() throws Exception {
		controller.ExportCSV exportCSV = new ExportCSV();
		exportCSV.showWindow();
	}
	
	//导出文件为vCard
	public void goToExportVCardUI() throws Exception {
		controller.ExportVCard exportVCard = new ExportVCard();
		exportVCard.showWindow();
	}
	
	//删除联系人确认界面
	public void goToDeletePersonUI() throws Exception {
		controller.DeletePerson deletePerson = new DeletePerson();
		deletePerson.showWindow();
	}
	
	//未选择删除的联系人弹出失败页面
	public void goToDeletePersonFalseUI() throws Exception {
		controller.DeletePersonFalse deletePersonFalse = new DeletePersonFalse();
		deletePersonFalse.showWindow();
	}

	//删除联系组确认界面
	public void goToDeleteGroupUI() throws Exception {
		controller.DeleteGroup deleteGroup = new DeleteGroup();
		deleteGroup.showWindow();
	}
	
	//未选择删除的联系组弹出失败页面
	public void goToDeleteGroupFalseUI() throws Exception {
		controller.DeleteGroupFalse deleteGroupFalse = new DeleteGroupFalse();
		deleteGroupFalse.showWindow();
	}
	
	//用户信息栏点击 保存 按钮关闭页面
	public void Confirmed() throws Exception {
		System.out.println("触发保存");
	}
	
	//用户信息栏点击 重置 按钮关闭页面
	public void Reseted() throws Exception {
		System.out.println("触发重置");
	}
	
	//用户信息栏点击 头像 按钮关闭页面
	public void ChangedImg() throws Exception {
		System.out.println("触发更换头像事件");
	}
	
	//点击 搜索 按钮触发事件
	public void Searched() throws Exception {
		System.out.println("触发搜索事件");
	}
	
}
