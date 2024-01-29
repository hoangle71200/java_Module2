package Bai6;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ (float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }
    public float[] getXYZ () {
        float[] arrXYZ = {getX(), getY(), this.z};
        return arrXYZ;
    }
    @Override
    public String toString () {
        return "(" + this.getX() + "," + this.getY() + "," + this.z + ")";
    }

    public static void main(String[] args) {
        Point2D x = new Point2D(1,2);
        System.out.println(x.toString());
        Point3D a = new Point3D(4,5,6);
        a.setXYZ(7,8,9);
        a.setXY(3,4);
        System.out.println(a.toString());
    }
}
