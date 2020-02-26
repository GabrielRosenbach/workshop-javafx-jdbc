package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemSellerAction() {
		
		System.out.println("onMenuItemSellerAction");
	}
	
	@FXML
	public void onMenuItemDepartmentAction() {
		
		System.out.println("onMenuItemDepartmentAction");
	}
	
	@FXML
	public void onMenuItemAboutAction() {
	
		loadView("/gui/About.fxml");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}
	
	//Devido a multi-thread, garante que esse processamento nao será interrompido
	private synchronized void loadView(String absoluteName) {
		
		try {//Recebe o caminho da view que será carregada
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			
			//Pega a scene do main
			Scene mainScene = Main.getScene();
			//Pega a vbox do main, onde será carregado os conteudos
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
			//Pega o menu do main, para ele continuar sendo exibido
			Node mainMenu = mainVBox.getChildren().get(0);
			
			//Limpa todos os filhos do main
			mainVBox.getChildren().clear();
			
			//Adiciona o menu no main
			mainVBox.getChildren().add(mainMenu);
			//Adiciona todos os filhos do vbox da nova view
			mainVBox.getChildren().addAll(newVBox.getChildren());
		
		} catch (IOException e) {
			
			Alerts.showAlert("IO Exception", "Error Loading View", e.getMessage(), AlertType.ERROR);
		}
	}

}
