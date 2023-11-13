package ian.Behavioral.Iterator.level1;

class Client {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.addBook(new Book("Design Patterns"));
        bookshelf.addBook(new Book("Effective Java"));
        bookshelf.addBook(new Book("Clean Code"));

        Iterator<Book> iterator = bookshelf.iterator();
        System.out.println(iterator.first());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        iterator.forEach(book -> System.out.println(book));
    }
}
