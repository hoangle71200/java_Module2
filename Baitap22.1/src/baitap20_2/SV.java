package baitap20_2;

public class SV extends inforSV {
    private int id;
    private String name;
    private String gender;

    public SV() {
    }

    public SV(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public SV(int id, String name, String gender, int pointToan, int pointVan, int pointAnh) {
        super(pointToan, pointVan, pointAnh);
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "SV{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", pointToan=" + getPointToan() +
                ", pointVan=" + getPointVan() +
                ", pointAnh=" + getPointAnh() +
                '}';
    }
}
