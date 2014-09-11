package serch.sdk;

import java.io.File;

/**
 * A class to search the android sdk that should be located in the c:/ drive for
 * easier searching or use the command prompt to enter a new dir and search
 * string.
 * 
 * @author richa_000
 *
 */
public class AndroidSearch {

	String pathToSDK = "";
	String searchFor = "";

	public AndroidSearch() {
		searchDir(pathToSDK);
	}

	private void searchDir(String pathToSDK2) {
		// TODO Auto-generated method stub
		File directory = new File("c:\\");
		File[] files = directory.listFiles();

		for (int index = 0; index < files.length; index++) {
			// for every file check if its a dir or a file
			File temp = files[index];
			if (temp.isDirectory()) {
				//recursive call
			}else{
				//file then search this file
			}
		}
	}
}
