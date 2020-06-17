package class02;

import java.util.Date;
import java.util.List;

/**
 * @program: HouDuanStudy
 * @description:
 * @author: Jaysrr
 **/
public class Book {

    /**
     * 印刷日期
     */
    private Date printingTime;
    /**
     * 出版日期
     */
    private Date publicationTime;

    private String type;

    public Book(Date printingTime, Date publicationTime, String type, double depth, int version, List<String> author) {
        this.printingTime = printingTime;
        this.publicationTime = publicationTime;
        this.type = type;
        this.depth = depth;
        this.version = version;
        this.author = author;
    }

    private double depth;

    private int version;

    private List<String> author;

    public Book() {

    }

    public Date getPrintingTime() {
        return printingTime;
    }

    public void setPrintingTime(Date printingTime) {
        this.printingTime = printingTime;
    }

    public Date getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(Date publicationTime) {
        this.publicationTime = publicationTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "printingTime=" + printingTime +
                ", publicationTime=" + publicationTime +
                ", type='" + type + '\'' +
                ", depth=" + depth +
                ", version=" + version +
                ", author=" + author +
                '}';
    }


}
