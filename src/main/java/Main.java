import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		String javaVersion = System.getProperty("java.version");
		String javafxVersion = System.getProperty("javafx.version");
		Label l = new Label("Hello, this is JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
		Scene scene = new Scene(new StackPane(l), 640, 480);
		primaryStage.setScene(scene);
		primaryStage.show();
		System.out.println("Successful launch.");
		System.out.println("Java version: " + javaVersion);
		System.out.println("JavaFX version: " + javafxVersion);
	}
	
	public static void main(String[] args) {
		launch();
	}

}
