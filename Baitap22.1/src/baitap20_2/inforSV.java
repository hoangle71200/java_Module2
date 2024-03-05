package baitap20_2;

public abstract class inforSV {
    private int pointToan;
    private int pointVan;
    private int pointAnh;

    public inforSV() {
        this.pointToan = 0;
        this.pointVan = 0;
        this.pointAnh = 0;
    }

    public inforSV(int pointToan, int pointVan, int pointAnh) {
        this.pointToan = pointToan;
        this.pointVan = pointVan;
        this.pointAnh = pointAnh;
    }

    public int getPointToan() {
        return pointToan;
    }

    public void setPointToan(int pointToan) {
        this.pointToan = pointToan;
    }

    public int getPointVan() {
        return pointVan;
    }

    public void setPointVan(int pointVan) {
        this.pointVan = pointVan;
    }

    public int getPointAnh() {
        return pointAnh;
    }

    public void setPointAnh(int pointAnh) {
        this.pointAnh = pointAnh;
    }

    @Override
    public String toString() {
        return "inforSV{" +
                "pointToan=" + pointToan +
                ", pointVan=" + pointVan +
                ", pointAnh=" + pointAnh +
                '}';
    }
}
