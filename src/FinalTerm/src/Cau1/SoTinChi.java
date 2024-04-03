package Cau1;
public class SoTinChi extends Hl_Inter {
        MonHoc monHoc;
        int current = -1;
        public SoTinChi(MonHoc monHoc) {
            this.monHoc = monHoc;
        }
        @Override
        public Object first() {
            current=0;
            return monHoc.getItem(current);
        }
        @Override
        public Object next() {
            if (!isDone()){
                return monHoc.getItem(++current);
            }
            return null;
        }
        @Override
        public Object currentItem() {
            if (current>=0 && current<monHoc.count())
                return monHoc.getItem(current);
            return null;
        }
        @Override
        public boolean isDone() {
            if (current>=monHoc.count()-1)
                return true;
            return false;
        }
    }



