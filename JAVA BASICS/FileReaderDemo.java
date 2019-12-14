import java.io.*;

class FileReaderDemo {

	public static void main(String[] args) throws IOException{
		    FileReader fr = new FileReader("xyz.txt");
			 int i = fr.read();
		       while(i!= -1){
				   System.out.println((char)i);
				   i=fr.read();
			   }
	}
}