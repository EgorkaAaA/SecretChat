package main;

import gui.GUILauncher;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import server.Server;


public class Main2 extends Application {
	@Override
	public void start(Stage primaryStage) {

		startProgram(primaryStage);
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void startProgram(Stage primaryStage){

		GUILauncher gl = new GUILauncher(primaryStage);
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to JavaChat(TM/Copyright/NSA/Ibasicallyownallthemessagesyoutype)");
		System.out.println("Server or Client mode? (Type \"1\" for Server, \"2\" for Client)");
		boolean isGoodInput = false;
		while(!isGoodInput){
			String in = sc.nextLine();
			if(in.equals("1")){
				isGoodInput = true;
				Server s = new Server();
				s.checkForConnections();
			}
			if(in.equals("2")){
				isGoodInput = true;
//				Client c = new Client();
//				try {
//					c.makeConnection();
//					c.checkServerMessages();
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
				gl.showClientGUI();
			}
			if(!(in.equals("1")||(in.equals("2")))){
				System.out.println("Please try again... must be a number between 1 and 2 inclusively.");
			}
		}


	}


}
