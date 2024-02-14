package Patterns.StructrualPattern.FlyweightPattern;

public class DogRobot implements IRobot{
    RobotType type;

    public RobotType getType() {
        return type;
    }

    public RobotImage getRobotImage() {
        return robotImage;
    }

    RobotImage robotImage;

    public DogRobot(RobotType type, RobotImage robotImage){
        this.type = type;
        this.robotImage = robotImage;
    }
    @Override
    public void display(int x, int y) {

    }
}
