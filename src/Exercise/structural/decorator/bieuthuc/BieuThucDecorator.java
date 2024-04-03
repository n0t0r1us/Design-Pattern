package structural.decorator.bieuthuc;

public abstract class BieuThucDecorator extends BieuThuc {

    BieuThuc bieuthuc;

    public BieuThucDecorator(BieuThuc bieuthuc) {
        this.bieuthuc = bieuthuc;
    }
}
