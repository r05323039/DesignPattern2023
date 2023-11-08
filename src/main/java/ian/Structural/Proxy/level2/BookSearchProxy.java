package ian.Structural.Proxy.level2;

import java.util.HashMap;
import java.util.Map;

class BookSearchProxy implements BookSearch {
    private final BookSearchService searchService;
    private final Map<String, String> cache = new HashMap<>();
    private long lastTimeRequest = System.currentTimeMillis();

    public BookSearchProxy(BookSearchService searchService) {
        this.searchService = searchService;
    }

    @Override
    public String search(String bookTitle) {
        // 訪問控制 : 檢測請求頻率
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastTimeRequest < 100) {
            throw new RuntimeException("請求過於頻繁，請稍後再試。");
        }
        lastTimeRequest = currentTime;

        // 緩存
        if (cache.containsKey(bookTitle)) {
            return cache.get(bookTitle) + " (from cache)";
        }

        // 如果緩存沒有，才調用真實service去查 (會比較慢)，並加入緩存
        String bookDetails = searchService.search(bookTitle);
        cache.put(bookTitle, bookDetails);
        return bookDetails;
    }
}
