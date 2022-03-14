package program1;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Photo {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		try {
		FileInputStream fr = new 
					 FileInputStream("/F:\\WebSeries\\Mr Robot");
			FileOutputStream fw = 
					new FileOutputStream("/F:\\WebSeries\\Mr Robot");
			
		
			int i = 0;
			while ((i = fr.read()) != -1) {
				fw.write(i);
			}
			fw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();

		System.out.println("time taken : " + (end - start) + " ms");
		
		try {
			FileReader fr=new FileReader("/F:\\\\WebSeries\\\\Mr Robot");
			FileWriter fw=new FileWriter("/F:\\\\WebSeries\\\\Mr Robot");
			int i=0;
			while((i=fr.read())!=-1) {
				fw.write(i);
			}
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("file is written");
	}
}



