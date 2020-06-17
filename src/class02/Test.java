package class02;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: HouDuanStudy
 * @description:
 * @author: Jaysrr
 * @create: 2020-06-17 20:22
 **/
public class Test {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor(new ArrayList<>());
        book.setDepth(105.2d);
        book.setPrintingTime(new Date());
        book.setPublicationTime(new Date());
        book.setVersion(1);

        Book book2 = new Book();
        book2.setAuthor(new ArrayList<>());
        book2.setDepth(88.5d);
        book2.setPrintingTime(new Date());
        book2.setPublicationTime(new Date());
        book2.setVersion(8);

        System.out.println(book);
        List<Book> books = new ArrayList<>();
        books.add(book);
        System.out.println(books);

    }
}
