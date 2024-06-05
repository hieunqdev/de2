package hieunq23_117;

public class ThuCung extends DongVat{
    public String maThuCung;

    public ThuCung() {
    }

    public ThuCung(String maThuCung) {
        this.maThuCung = maThuCung;
    }

    public ThuCung(String maThuCung, String ten, int canNang, int gioiTinh) {
        super(ten, canNang, gioiTinh);
        this.maThuCung = maThuCung;
    }
    
     

    public void setMaThuCung(String maThuCung) {
        this.maThuCung = maThuCung;
    }

    public String getMaThuCung() {
        return maThuCung;
    }
    
    
}
