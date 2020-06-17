package class03;

/**
 * @program: HouDuanStudy
 * @description: 话筒和乐队 多对多
 * @author: Jaysrr
 * @create: 2020-06-17 22:00
 **/
public class MPAndBand {
    private long id;
    private long mphoneId;
    private long bandId;

    @Override
    public String toString() {
        return "MPAndBand{" +
                "id=" + id +
                ", mphoneId=" + mphoneId +
                ", bandId=" + bandId +
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

    public long getBandId() {
        return bandId;
    }

    public void setBandId(long bandId) {
        this.bandId = bandId;
    }
}
