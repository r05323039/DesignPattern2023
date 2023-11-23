package ian.Structural.Proxy.level2;

class BookSearchService implements BookSearch {
    @Override
    public String search(String bookTitle) {
        try {
            System.out.println("real service searching...");
            Thread.sleep(2000);//模擬延遲
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "訊息 about " + bookTitle;
    }
}
