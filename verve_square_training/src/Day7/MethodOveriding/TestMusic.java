package Day7.MethodOveriding;

public class TestMusic {

	public static void main(String[] args)
	{
		System.out.println("\tMusic Applications");
		System.out.println("===============================");
		System.out.println("\t1st Apllication:");
		System.out.println("--------------------------");
		GaanaApplication objGaanaApplication = new GaanaApplication();
		objGaanaApplication.logInApplication("ABc", "hfk8546@#", "Sign-Up", "GaanaApplication");
		objGaanaApplication.uiGaanaApplication();
		System.out.println("\t\n2nd Apllication:");
		System.out.println("--------------------------");
		SpotifyApplication objSpotifyApplication = new SpotifyApplication();
		objSpotifyApplication.logInApplication("DEF", "jd74@#", "Sign-Up", "SpotifyApplication");
		System.out.println("\t\n3rd Apllication:");
		System.out.println("--------------------------");
		JioSaavnApplication objJioSaavnApplication = new JioSaavnApplication();
		objJioSaavnApplication.logInApplication("XYZ", "dkj756?%$", "Sign-Up", "JioSaavnApplication");
	}

}
