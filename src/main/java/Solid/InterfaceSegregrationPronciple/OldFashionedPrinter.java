package Solid.InterfaceSegregrationPronciple;

/**
 * This class also has to implement every Machine's method
 * even if it doesn't need it
 */
public class OldFashionedPrinter implements Machine {

    @Override
    public void print(Document d) {
        //
    }

    @Override
    public void fax(Document d) throws Exception {
        throw new Exception();
    }

    @Override
    public void scan(Document d) throws Exception {
        throw new Exception();
    }
}
