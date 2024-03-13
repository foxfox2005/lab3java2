package java2;

public class hocsinh {
    private String name, major;
    private double point;

    public hocsinh() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public hocsinh(String name, String major, double point) {
        this.name = name;
        this.major = major;
        this.point = point;
    }
    public String getHocLuc(){
        if(point >= 9) {
            return "Xuat Xac";
        } else if (point >= 7.5) {
            return "gioi";
        } else if (point >=6.5) {
            return "kha";
        } else if (point >= 5) {
            return "trung binh";
        } else if (point >= 3) {
            return "yeu";
        } else {
            return "kem";
        }
    }
    public boolean isThuong(){
        return point >= 7.5;
    }
}
