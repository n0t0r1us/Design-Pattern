package structural.decorator.bieuthuc;

public class Cong extends BieuThucDecorator{
    float toanHang;

    public Cong(float toanHang, BieuThuc bieuthuc) {
        super(bieuthuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bieuthuc.giaTri() + toanHang;
    }

    @Override
    public String bieuThuc() {
        return bieuthuc.bieuThuc() + "+" + toanHang;
    }

}
