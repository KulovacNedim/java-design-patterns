package Solid.SingleResponsibilityPrinciple;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        Solid.SingleResponsibilityPrinciple.Jurnal jurnal = new Solid.SingleResponsibilityPrinciple.Jurnal();
        jurnal.addEntry("I smiled today");
        jurnal.addEntry("I ate a bug :)");
        System.out.println(jurnal);

        Solid.SingleResponsibilityPrinciple.Persistence persistence = new Solid.SingleResponsibilityPrinciple.Persistence();
        String filename = "journal.txt";
        persistence.saveToFile(jurnal, filename, true);
        Runtime.getRuntime().exec("notepad.exe " + filename);
    }
}
