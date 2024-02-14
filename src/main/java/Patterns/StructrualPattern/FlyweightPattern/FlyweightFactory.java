package Patterns.StructrualPattern.FlyweightPattern;

import java.util.HashMap;

public class FlyweightFactory {
    private static HashMap<RobotType, IRobot> cache = new HashMap<>();

    public static IRobot CreateRobot(RobotType type){
        if(cache.containsKey(type)){
            return cache.get(type);
        }
        if(type == RobotType.HUMAN){
            RobotImage img = new RobotImage();
            IRobot humanRobot = new HumanRobot(type, img);
            cache.put(type, humanRobot);
            return humanRobot;
        } else if (type == RobotType.DOG) {
            RobotImage img = new RobotImage();
            IRobot dogRobot = new HumanRobot(type, img);
            cache.put(type, dogRobot);
            return dogRobot;
        }else{
            return null;
        }
    }
}
