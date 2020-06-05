
package read_text_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread extends java.lang.Thread{
    
    private String folder;
    private int  thr;

    @Override
    public void run(){
            try {
                super.run();
                File ee = new File(folder);
                Scanner s = new Scanner(ee);
                while(s.hasNextLine())
                    System.out.println(s.nextLine());
                    java.lang.Thread.sleep(thr);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    public Thread(int sleep, String file){
        super();
        this.thr = sleep;
        this.folder = file;
    }
}
    

