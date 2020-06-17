package class03;

/**
 * @program: HouDuanStudy
 * @description: 话筒
 * @author: Jaysrr
 * @create: 2020-06-17 21:49
 **/
public class MicroPhone {
    private long id;
    private int size;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private boolean isWireless;
    private double volume;

    @Override
    public String toString() {
        return "MicroPhone{" +
                "size=" + size +
                ", isWireless=" + isWireless +
                ", volume=" + volume +
                '}';
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public MicroPhone() {
    }

    public MicroPhone(int size, boolean isWireless, double volume) {
        this.size = size;
        this.isWireless = isWireless;
        this.volume = volume;
    }
}
