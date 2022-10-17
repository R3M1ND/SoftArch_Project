package book.book;


import java.util.List;

public class BookReader {
    public static void main(String[] args) {
        Readable book = new ReadedBook("Memo", List.of("I", "love", "you", "so", "much"));
        book.printToScreen();
    }
}
