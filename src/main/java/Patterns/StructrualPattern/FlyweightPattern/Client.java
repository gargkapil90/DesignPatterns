package Patterns.StructrualPattern.FlyweightPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        IRobot humanRobot = FlyweightFactory.CreateRobot(RobotType.HUMAN);
        IRobot dogRobot = FlyweightFactory.CreateRobot(RobotType.DOG);
        List<IRobot> robots = new ArrayList<>();
        for(int i = 0; i < 50; i++){
            robots.add(FlyweightFactory.CreateRobot(RobotType.HUMAN));
        }

    }
}
