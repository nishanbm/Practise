package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginController {
	@FXML
	private Label lblMessage;
	@FXML
	private TextField txtUsername;
	@FXML
	private TextField txtPassword;
	
	public void function (ActionEvent event) throws Exception
	{
		if(txtUsername.getText().equals("") && txtPassword.getText().equals(""))
		{
			lblMessage.setText("Enter Username and Password");
		}
		else if(txtUsername.getText().equals(""))
		{
			lblMessage.setText("Enter Username");
		}
		else if(txtPassword.getText().equals(""))
		{
			lblMessage.setText("Enter Password");
		}
		else
		{
			if(txtUsername.getText().equals("admin") && txtPassword.getText().equals("admin"))
			{
				lblMessage.setText("LOGIN SUCCESSFUL");
				Stage primaryStage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("/application/mainPage.fxml"));
				Scene scene = new Scene(root,400,400);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				txtUsername.setText("");
				txtPassword.setText("");
				primaryStage.setScene(scene);
				primaryStage.show();
			}
			else
			{
				lblMessage.setText("LOGIN DENIED");
				txtPassword.setText("");
			}
		}
	}
	public void cancelfunction (ActionEvent event)
	{
		txtUsername.setText("");
		txtPassword.setText("");
		//this line helps to maintain you to provide clear textfield
	}
	public void addMedicine (ActionEvent event) throws Exception
	{
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/addMedicine.fxml"));
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	}

}
