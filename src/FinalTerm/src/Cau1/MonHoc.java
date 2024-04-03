package Cau1;
public class MonHoc {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        public int getItem(int i){
            return arr[i];
        }
        public int count(){
            return arr.length;
        }
        public Hl_Inter createIterator(){
            return new SoTinChi(this);
        }
    }
