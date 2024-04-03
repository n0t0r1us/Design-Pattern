package observer;

public class NhaDauTuB implements TiGia.I_TheoDoiTiGia {
    TiGia t;
    public NhaDauTuB(TiGia t){
        this.t = t;
        t.attach(this);
    }
    public void huyDangKy(){
        t.detach(this);
    }

    @Override
    public void capNhatTiGia(float delta) {
        if(delta > 0)
            System.out.println("B: Mua vao");
        else
            if(delta ==0)
                System.out.println("B: Ngoi cho");
            else
                System.out.println("B: Ban ra");
    }
}
