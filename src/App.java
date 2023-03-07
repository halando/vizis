import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
     Label label1 = new Label("Szám");
     TextField field1 = new TextField();
     Button button1 = new Button("Mehet");

     button1.setOnAction(event -> {
        String numStr = field1.getText();
        int num = Integer.parseInt(numStr);
        Integer numDouble = num *2;
        System.out.println("Működik");
        field1.setText(numDouble.toString());
        
     });

        HBox hbox = new HBox();
        hbox.setPadding(new Insets(20));
        hbox.setSpacing(20);
        hbox.getChildren().add(label1);
        hbox.getChildren().add(field1);
        hbox.getChildren().add(button1);
        Scene scene = new Scene(hbox);
        stage.setScene(scene);
        stage.show();
    }

}
