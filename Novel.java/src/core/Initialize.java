package core;

public class Initialize {

	public static void main(String[] args) {
		//core.Info.MangePrint();
		//↑何を書いていたんだ私は まんげまんげ
		
		//Environment specific initialization.
		core.Boot.EnvironmentInitialize();
		System.out.println();
		
		//Print application information to console.
		core.AppInfo.PrintAppInfo();
		
		//Initialize the Application Window.
		core.MainWindow.InitializeWindow();
	}

}
