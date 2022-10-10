public class FanDisplay {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.getOn();
        fan.setSpeed(fan.MEDIUM);
        fan.setColor("red");
        fan.setRadius(10);

        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("Color: " + fan.getColor());
        System.out.println("Radius: " + fan.getRadius());
    }
}

class Fan {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public boolean getOn() {
        return on = true;
    }
    public boolean setOn(boolean on) {
        return this.on = on;
    }

    public boolean getOff() {
        return on = false;
    }
    public boolean setOff(boolean on) {
        return this.on = on;
    }

    public int getSpeed() {
        return speed;
    }
    public int setSpeed(int speed) {
        if (on) {
            this.speed = speed;
        }
        return speed;
    }

    public double getRadius() {
        return radius;
    }
    public double setRadius(double radius) {
        return this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public String setColor(String color) {
        return this.color = color;
    }

    public void display() {
        System.out.println();
    }
}
