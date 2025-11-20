package testscript;

public class Browsercommands extends Base
{
	void browserCommands()
	{
		//String Title = driver.getTitle();
		//System.out.println(Title);
//		String currenturl = driver.getCurrentUrl();
//		System.out.println(currenturl);
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
	}

	public static void main(String[] args) {
		Browsercommands browsercommands = new Browsercommands();
		browsercommands.browserInitialization();
		browsercommands.browserCommands();
		 

	}

}
