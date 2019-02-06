package application;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class MovieApplication extends Application {
	
	private VBox root;
	private HBox row0, row1, row2;
	private Stage stage;
	private Button submit;
	
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
    	stage = primaryStage;
        stage.setTitle("Hello World!");
        
        Text username = new Text("Username: ");
        Text password = new Text("Password: ");
        username.resize(100, 100);
        password.resize(100, 100);
        username.setStyle("-fx-background-color: ");
        
        TextField userField = new TextField();
        TextField passField = new TextField();
        
        submit = new Button("Log In");
        submit.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        root = new VBox();
        
        row0 = new HBox();
        row1 = new HBox();
        row2 = new HBox();
        
        row0.getChildren().addAll(username, userField);
        row1.getChildren().addAll(password, passField);
        row2.getChildren().add(submit);
        row0.setAlignment(Pos.CENTER);
        row1.setAlignment(Pos.CENTER);
        row2.setAlignment(Pos.CENTER);
        row0.setSpacing(15);
        row1.setSpacing(15);
        row0.setStyle("-fx-background-color: #D9E300;");
        row1.setStyle("-fx-background-color: #D9E300;");
        row2.setStyle("-fx-background-color: #D9E300;");
        
        root.getChildren().addAll(row0, row1, row2);
        root.setSpacing(15);
        root.setMinSize(400, 200);
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #00A7E3;");
        
        stage.setScene(new Scene(root, 400, 300));
        stage.show();
    }
    
}