package baitap31_1;

public class Bao extends ThuVien{
    int ngayPhatHanh;

    public Bao() {
    }
    public Bao(String tenNhaXuatBan, int soBanPhatHanh) {
        super(tenNhaXuatBan, soBanPhatHanh);
    }

    public Bao(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(String tenNhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
        super(tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }
}
