package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {

	public static Stage currentStage(ActionEvent event) {
		return (Stage) ((Node) event.getSource()).getScene().getWindow();
	}
	
	public static Integer tryParseInt(String string) {
		try {
			return Integer.parseInt(string);
		}catch(NumberFormatException e) {
			return null;
		}
	}
}
