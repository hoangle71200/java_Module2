package baitap31_1;

public abstract class ThuVien {
    static int maTaiLieu;
    String tenNhaXuatBan;
    int soBanPhatHanh;

    public ThuVien() {
    }

    public ThuVien(String tenNhaXuatBan, int soBanPhatHanh) {
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public static int getMaTaiLieu() {
        return maTaiLieu;
    }

    public static void setMaTaiLieu(int maTaiLieu) {
        ThuVien.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }
}
