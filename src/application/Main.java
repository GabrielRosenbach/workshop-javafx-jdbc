package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	/**
	 * Janela principal */
	private static Scene mainScene;
	
	/**
	 * Metodo que cria a janela base do programa */
	@Override
	public void start(Stage primaryStage) {
		
		try {
		
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			
			ScrollPane scrollPane = loader.load();
			
			scrollPane.setFitToHeight(true);
			scrollPane.setFitToWidth(true);
			
			mainScene = new Scene(scrollPane);
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("Sample JavaFX application");
			primaryStage.show();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Metodo que retorna a janela principal do programa */
	public static Scene getMainScene() {
		
		return mainScene;
	}
	
	/**
	 * Metodo que inicia a parte grafica do programa */
	public static void main(String[] args) {
		launch(args);
	}

}
