// write a program to write in the File...

import java.io.*;

class FileWriterDemo {

	public static void main(String[] args) throws IOException{
		    FileWriter fw = new FileWriter("xyz.txt");
			 fw.write(100);
		       fw.flush();
                fw.close();
	}

}