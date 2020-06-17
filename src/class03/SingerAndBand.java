package class03;

/**
 * @program: HouDuanStudy
 * @description: 歌手和乐队 多对一
 * @author: Jaysrr
 * @create: 2020-06-17 21:59
 **/
public class SingerAndBand {
    private long id;
    private long singerId;
    private long bandId;

    @Override
    public String toString() {
        return "SingerAndBand{" +
                "id=" + id +
                ", singerId=" + singerId +
                ", bandId=" + bandId +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSingerId() {
        return singerId;
    }

    public void setSingerId(long singerId) {
        this.singerId = singerId;
    }

    public long getBandId() {
        return bandId;
    }

    public void setBandId(long bandId) {
        this.bandId = bandId;
    }
}
