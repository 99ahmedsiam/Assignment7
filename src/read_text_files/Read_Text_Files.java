
package read_text_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Read_Text_Files {

  
    
    public static void main(String[] args) {
        new java.lang.Thread(new text(new File("text1.txt")), "t1").start();
        new java.lang.Thread(new text(new File("text2.txt")), "t2").start();
      
    }    

    public static void getInfo(String s) {
        File e = new File(s);
        synchronized (e) {
            try {
                Scanner sc = new Scanner(e);
                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
            } catch (FileNotFoundException n) {
                n.printStackTrace();
            }
        }
    }
}

