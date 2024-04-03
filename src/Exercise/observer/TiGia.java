package observer;

import java.util.ArrayList;
import java.util.List;

public class TiGia {
    //Buoc 2
    List<I_TheoDoiTiGia> observers = new ArrayList();

    public void attach(I_TheoDoiTiGia o) {
        if (!observers.contains(o))
            observers.add(o);
    }

    public void detach(I_TheoDoiTiGia o) {
        if (observers.contains(o))
            observers.remove(o);
    }

    public void notifyTiGia(float delta) {
        for (var obs : observers)
            obs.capNhatTiGia(delta);
    }

    //Iobserver
    //buoc1
    static public interface I_TheoDoiTiGia {
        void capNhatTiGia(float delta);
    }
}

