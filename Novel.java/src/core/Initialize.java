package core;

public class Initialize {

	public static void main(String[] args) {
		//core.Info.MangePrint();
		core.Boot.EnvironmentInitialize();
		System.out.println();
		core.Info.PrintAppInfo();
		core.MainWindow.InitializeWindow();
	}

}
