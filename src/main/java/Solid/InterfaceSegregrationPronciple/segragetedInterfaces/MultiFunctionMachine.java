package Solid.InterfaceSegregrationPronciple.segragetedInterfaces;

import Solid.InterfaceSegregrationPronciple.Document;

public class MultiFunctionMachine implements MultiFunctionDevice {

    // compose this out of several modules
    private Printer printer;
    private Scanner scanner;

    public MultiFunctionMachine(Printer printer, Scanner scanner)
    {
        this.printer = printer;
        this.scanner = scanner;
    }

    @Override
    public void Print(Document d) throws Exception {
        printer.Print(d);
    }

    @Override
    public void Scan(Document d) throws Exception {
        scanner.Scan(d);
    }
}
