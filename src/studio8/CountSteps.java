package studio8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.sun.swing.internal.plaf.synth.resources.synth;
import com.sun.swing.internal.plaf.synth.resources.synth_de;

// TODO: Develop an algorithm to count steps in accelerometer data
//    Major steeps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.
 public class CountSteps{
	 
	 public CountSteps() {
		 
	 }
	 
	 public static void main(String[] args) {
		 try {
			Scanner sys = new Scanner(new File("data/wdata.csv"));
			while(sys.hasNext()) {
				System.out.println(sys.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
	 
	 
 }