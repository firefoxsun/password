package com.wei.table;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TextFieldTest extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Creating a GridPane container
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(5);
		grid.setHgap(5);

		// Defining the Name text field
		final TextField name = new TextField();
		name.setPromptText("Enter your first name.");
		GridPane.setConstraints(name, 0, 0);
		grid.getChildren().add(name);

		// Defining the Last Name text field
		final TextField lastName = new TextField();
		lastName.setPromptText("Enter your last name.");
		GridPane.setConstraints(lastName, 0, 1);
		grid.getChildren().add(lastName);

		// Defining the Comment text field
		final TextField comment = new TextField();
		comment.setPromptText("Enter your comment.");
		GridPane.setConstraints(comment, 0, 2);
		grid.getChildren().add(comment);

		// Defining the Comment text field
		final TextField comment2 = new TextField();
		comment2.setPromptText("Enter your comment2.");
		GridPane.setConstraints(comment2, 0, 3);
		grid.getChildren().add(comment2);
		
		
		// Defining the Submit button
		Button submit = new Button("Submit");
		GridPane.setConstraints(submit, 1, 0);
		grid.getChildren().add(submit);

		// Defining the Clear button
		Button clear = new Button("Clear");
		GridPane.setConstraints(clear, 1, 1);
		grid.getChildren().add(clear);

		// Adding a Label
		final Label label = new Label();
		GridPane.setConstraints(label, 0, 3);
		GridPane.setColumnSpan(label, 2);
		grid.getChildren().add(label);

		Scene s = new Scene(grid, 500, 300);
		primaryStage.setScene(s);

		primaryStage.show();

		submit.setOnAction((ActionEvent e) -> {
			if ((comment.getText() != null && !comment.getText().isEmpty())) {
				label.setText(name.getText() + " " + lastName.getText() + ", " + "thank you for your comment!");
			} else {
				label.setText("You have not left a comment.");
			}
		});

		clear.setOnAction((ActionEvent e) -> {
			name.clear();
			lastName.clear();
			comment.clear();
			label.setText(null);
		});
	}

	public static void main(String[] args) {
		launch(args);
	}

}
