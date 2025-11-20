package testscript;

public class NavigationCommands extends Base {
	void navigationCommands()
	{
		driver.navigate().to("https://www.amazon.in/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
   
		NavigationCommands navigationcommands = new NavigationCommands();
		navigationcommands.browserInitialization();
		navigationcommands.navigationCommands();
		

	}

}
