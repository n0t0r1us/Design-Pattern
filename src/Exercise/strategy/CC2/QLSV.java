package strategy.CC2;

import java.util.ArrayList;
import java.util.List;

public class QLSV {

    List<SinhVien> dssv = new ArrayList<>();
    public void sapXep(ISoSanh<SinhVien> s){
        for (int i = 0; i<dssv.size(); i++)
            for (int j= i+1; j< dssv.size(); j++)
                if(s.soSanh(dssv.get(i), dssv.get(j))>0){
                    SinhVien sv = dssv.get(i);
                    dssv.set(i, dssv.get(j));
                    dssv.set(j, sv);
                }

    }
    public void inDS(){
        for (int i = 0; i < dssv.size(); i++){
            dssv.get(i).create_list();
        }
    }
    public void addSV(SinhVien sinhVien){
        dssv.add(sinhVien);
    }
}
