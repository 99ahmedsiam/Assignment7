/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package read_text_files;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class text implements Runnable {

    private File folder;

    @Override
    public void run() {
        Scanner s;
        try {
            s = new Scanner(folder);
            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
                java.lang.Thread.sleep(1000);
            }
            s.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (InterruptedException ex) {
            Logger.getLogger(text.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public text(File file) {
        this.folder = file;
    }
}
