package Bai6;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSPeed (float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed () {
        float[] arrSpeed = {getxSpeed(), getySpeed()};
        return arrSpeed;
    }
    @Override
    public String toString () {
        return "(" + getX() + "," + getY() + ")" + ", speed= (" + getxSpeed() + "," + getySpeed() + ")";
    }
    public MovablePoint move () {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    public static void main(String[] args) {
        Point mov1 = new MovablePoint(1, 2, 10, 20);
        MovablePoint mov2 = new MovablePoint(3, 4, 30, 40);
        System.out.println(mov1.toString());
        MovablePoint mov11 = (MovablePoint) mov1;
        System.out.println(mov2);
        System.out.println(mov1);
//        mov1.move();
        mov2.move();
        System.out.println(mov1.toString());
        System.out.println(mov2.toString());
    }
}
