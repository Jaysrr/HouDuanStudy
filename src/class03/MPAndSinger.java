package class03;

/**
 * @program: HouDuanStudy
 * @description: 麦克风和歌手一对一
 * @author: Jaysrr
 * @create: 2020-06-17 21:58
 **/
public class MPAndSinger {
    private long id;
    private long mphoneId;
    private long singId;

    @Override
    public String toString() {
        return "MPAndSinger{" +
                "id=" + id +
                ", mphoneId=" + mphoneId +
                ", singId=" + singId +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMphoneId() {
        return mphoneId;
    }

    public void setMphoneId(long mphoneId) {
        this.mphoneId = mphoneId;
    }

    public long getSingId() {
        return singId;
    }

    public void setSingId(long singId) {
        this.singId = singId;
    }
}
