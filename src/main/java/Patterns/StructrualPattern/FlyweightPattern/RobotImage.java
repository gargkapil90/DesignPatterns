package Patterns.StructrualPattern.FlyweightPattern;

public class RobotImage {
    private byte[] image;
    public byte[] getImage() {
        return DUMMY_IMAGE;
    }
//    public void setImage(byte[] image) {
//        this.image = image;
//    }

    public static final byte[] DUMMY_IMAGE = new byte[50*1024];

    static {
        for (int i = 0; i < DUMMY_IMAGE.length; i++) {
            DUMMY_IMAGE[i] = (byte) i;
        }
    }

    public RobotImage() {
        this.image = getImage();
    }
}
