package dad.javafx.calculadoraFXML.calculadora;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class CalculadoraController implements Initializable{

	Calculadora calculadora;
	
	
    @FXML
    private VBox view;
	
    @FXML
    private TextField textoText;

    @FXML
    private Button sieteButton;

    @FXML
    private Button cuatroButton;

    @FXML
    private Button unoButton;

    @FXML
    private Button ceroButton;

    @FXML
    private Button ochoButton;

    @FXML
    private Button cincoButton;

    @FXML
    private Button dosButton;

    @FXML
    private Button nueveButton;

    @FXML
    private Button seisButton;

    @FXML
    private Button tresButton;

    @FXML
    private Button puntoButton;

    @FXML
    private Button borrarTodoButton;

    @FXML
    private Button multiplicarButton;

    @FXML
    private Button menosButton;

    @FXML
    private Button masButton;

    @FXML
    private Button borrarButton;

    @FXML
    private Button dividirButton;

    @FXML
    private Button igualButton;

    
    @FXML
    void onBorrarAction(ActionEvent event) {
    	calculadora.borrar();
    	textoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onBorrarTodoAction(ActionEvent event) {
    	calculadora.borrarTodo();
    	textoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onCeroAction(ActionEvent event) {
    	calculadora.insertar('0');
    	
    	textoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onCincoAction(ActionEvent event) {
    	calculadora.insertar('5');
    	textoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onCuatroAction(ActionEvent event) {
    	calculadora.insertar('4');
    	textoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onDividirAction(ActionEvent event) {
    	calculadora.operar('/');
    	textoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onDosAction(ActionEvent event) {
    	calculadora.insertar('2');
    	textoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onIgualAction(ActionEvent event) {
    	calculadora.operar('=');
    	textoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onMasAction(ActionEvent event) {
    	calculadora.operar('+');
    	textoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onMultiplicarAction(ActionEvent event) {
    	calculadora.operar('*');
    	textoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onNueveAction(ActionEvent event) {
    	calculadora.insertar('9');
    	textoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onOchoAction(ActionEvent event) {
    	calculadora.insertar('8');
    	textoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onPuntoAction(ActionEvent event) {
    	calculadora.insertarComa();
    	textoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onRestarAction(ActionEvent event) {
    	calculadora.operar('-');
    	textoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onSeisAction(ActionEvent event) {
    	calculadora.insertar('6');
    	textoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onSieteAction(ActionEvent event) {
    	calculadora.insertar('7');
    	textoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onTresAction(ActionEvent event) {
    	calculadora.insertar('3');
    	textoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onUnoAction(ActionEvent event) {
    	calculadora.insertar('1');
    	textoText.setText(calculadora.getPantalla());
    }
    
	public CalculadoraController() throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/calculadoraFXML.fxml"));
		loader.setController(this);
		loader.load();
		
		calculadora= new Calculadora();
	}
	
	public VBox getView() {
		return view;
	}
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("funciona");
		
	}
}
