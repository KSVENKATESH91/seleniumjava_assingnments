package week1.day2_breakoutassignments;

public class Browser {
	
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully!");
		return browserName;
	}

	public void loadUrl() {
		System.out.println("Application URL loaded successfully!");
	}
	
	public static void main(String[] args) {
		Browser obj = new Browser();
		System.out.println("Browser Name is " + obj.launchBrowser("Chrome"));
		obj.loadUrl();
	}
}
