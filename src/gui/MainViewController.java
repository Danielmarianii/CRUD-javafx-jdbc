package gui;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class MainViewController {

	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	private void onMenuItemSeller() {
		System.out.println("click Seller");
	}
	
	@FXML
	private void onMenuItemDepartment() {
		System.out.println("click Department");
	}
	
	@FXML
	private void onMenuItemAbout() {
		System.out.println("click About");
	}
	
	
}
