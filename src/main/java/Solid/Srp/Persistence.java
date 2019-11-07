package Solid.Srp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

public class Persistence {
    public void saveToFile (Jurnal jurnal, String filename, boolean overwrite) throws FileNotFoundException {
        if (overwrite || new File(filename).exists()) {
            try (PrintStream out = new PrintStream(filename)) {
                out.println(toString());
            }
        }
    }

    public Jurnal load(String filename) {return null;}
    public Jurnal load(URL url) {return null;}
}