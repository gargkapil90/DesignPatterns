package Patterns.StructrualPattern.FlyweightPattern;

public class HumanRobot implements IRobot{
    RobotType type;
    RobotImage robotImage;

    public HumanRobot(RobotType type, RobotImage robotImage) {
        this.type = type;
        this.robotImage = robotImage;
    }

    @Override
    public void display(int x, int y) {

    }
}
