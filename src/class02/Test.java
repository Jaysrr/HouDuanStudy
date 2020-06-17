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

        List<String> authors = new ArrayList();
        authors.add("Robort");
        authors.add("周志明");
        book.setAuthor(authors);

        book.setDepth(105.2d);
        book.setPrintingTime(new Date());
        book.setPublicationTime(new Date());
        book.setVersion(1.0);

        Book book2 = new Book();
        book2.setAuthor(new ArrayList<>());
        book2.setDepth(88.5d);
        book2.setPrintingTime(new Date());
        book2.setPublicationTime(new Date());
        book2.setVersion(8.0);

        System.out.println(book);
        System.out.println(book2);
        List<Book> books = new ArrayList<>();
        books.add(book);
        System.out.println(books);

    }
}
