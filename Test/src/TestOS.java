
public class TestOS {

	public static void main(String[] args) {

		System.out.println("*** PROGRAM STARTS ***\n");

		// List all the properties.
		// System.getProperties().list(System.out);

		String osName = System.getProperty("os.name");

		if ( osName.equalsIgnoreCase("Mac OS X") ) {
			System.out.println( System.getProperty("os.name") );
		} else if ( osName.equalsIgnoreCase("Windows 10") ) {
			System.out.println( System.getProperty("os.name") );
		} else {
			System.out.println("OS not identified.");
		}

		System.out.println("\n*** PROGRAM COMPLETES ***");

	}

}
