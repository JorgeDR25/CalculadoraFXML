package dad.javafx.calculadoraFXML.calculadora;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadoraApp extends Application{

	private CalculadoraController control;

	@Override
	public void start(Stage primaryStage) {
		
		try {
			control = new CalculadoraController();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scene scene = new Scene(control.getView());
		
		primaryStage.setTitle("Scene Builder");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}

