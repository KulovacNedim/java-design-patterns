package Solid.InterfaceSegregrationPronciple.segragetedInterfaces;

import Solid.InterfaceSegregrationPronciple.Document;

public class Photocopier implements Printer, Scanner {

    @Override
    public void Print(Document d) throws Exception {
        throw new Exception();
    }

    @Override
    public void Scan(Document d) throws Exception {
        throw new Exception();
    }
}
