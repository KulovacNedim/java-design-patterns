package Solid.Srp;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        Jurnal jurnal = new Jurnal();
        jurnal.addEntry("I smiled today");
        jurnal.addEntry("I ate a bug :)");
        System.out.println(jurnal);

        Persistence persistence = new Persistence();
        String filename = "journal.txt";
        persistence.saveToFile(jurnal, filename, true);
        Runtime.getRuntime().exec("notepad.exe " + filename);
    }
}
