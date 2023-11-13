package ian.Behavioral.Iterator.level1;

import java.util.ArrayList;
import java.util.List;

class Bookshelf {
    private List<Book> books;

    public Bookshelf() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Iterator<Book> iterator() {
        return new GenericsIterator<Book>(books);
        // 將訪問Collections的方法封裝在迭代器中，將集合本身與訪問的邏輯分離
    }
}
