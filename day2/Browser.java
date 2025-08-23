package week1.day2;

public class Browser {

	public static void main(String[] args) {
		
		Browser myBrowser = new Browser();
		myBrowser.launchBrowser("Chrome");
		myBrowser.loadUrl();

	}
	public void launchBrowser(String browserName)
	{
		System.out.println(browserName + " browser is launched.");
	}
	public void loadUrl()
	{
		   System.out.println("Loading default URL");
	}

}
