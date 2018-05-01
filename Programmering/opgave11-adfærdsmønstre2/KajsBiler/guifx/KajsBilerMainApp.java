package guifx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class KajsBilerMainApp extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
		stage.setTitle("Kajs Biler");
		BorderPane pane = new BorderPane();
		initContent(pane);

		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setMinHeight(160);
		stage.setMinWidth(330);
		stage.show();
	}

	// -------------------------------------------------------------------------

	private void initContent(BorderPane pane) {
		GridPane gridPane = new GridPane();
		initGridPane(gridPane);
		pane.setCenter(gridPane);
		pane.setPadding(new Insets(10));

	}

	Label lblPrisgrupper;
	ComboBox<String> cbbPrisgrupper;
	ListView<String> lvwBiler;

	Button btnOK, btnAnnuller;

	HBox hbButtons;

	private void initGridPane(GridPane gridPane) {
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setHgap(20);
		gridPane.setVgap(10);
		gridPane.setGridLinesVisible(false);

		lblPrisgrupper = new Label("Prisgrupper");
		gridPane.add(lblPrisgrupper, 0, 0);

		cbbPrisgrupper = new ComboBox<>();
		cbbPrisgrupper.setMinWidth(310);
		gridPane.add(cbbPrisgrupper, 0, 1);

		lvwBiler = new ListView<String>();
		gridPane.add(lvwBiler, 0, 2);

		hbButtons = new HBox();
		hbButtons.setSpacing(10);
		btnOK = new Button("OK");
		btnOK.setMinWidth(150);
		btnAnnuller = new Button("Annullér");
		btnAnnuller.setMinWidth(150);

		hbButtons.getChildren().add(btnOK);
		hbButtons.getChildren().add(btnAnnuller);

		gridPane.add(hbButtons, 0, 3);

	}
}
