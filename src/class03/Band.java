package class03;

import java.util.Date;

/**
 * @program: HouDuanStudy
 * @description: 乐队
 * @author: Jaysrr
 * @create: 2020-06-17 21:49
 **/
public class Band {
    private long id;
    private String bandName;
    /**
     * 成立时间
     */
    private Date startTime;

    @Override
    public String toString() {
        return "Band{" +
                "id=" + id +
                ", bandName='" + bandName + '\'' +
                ", startTime=" + startTime +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Band(long id, String bandName, Date startTime) {
        this.id = id;
        this.bandName = bandName;
        this.startTime = startTime;
    }

    public Band() {

    }
}
