package Solid.InterfaceSegregrationPronciple;

/**
 * This class has to implement every Machine's method
 */
public class MultiFunctionPrinter implements Machine {
    @Override
    public void print(Document d) {
        //
    }

    @Override
    public void fax(Document d) throws Exception {
        //
    }

    @Override
    public void scan(Document d) throws Exception {
        //
    }
}
