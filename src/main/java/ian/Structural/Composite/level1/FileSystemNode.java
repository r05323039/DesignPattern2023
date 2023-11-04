package ian.Structural.Composite.level1;

interface FileSystemNode {
    // 適用樹狀結構
    // 實作節點介面，為同一個組合系統，零件有
    // 1. Leaf 樹葉構件 : 最末梢，不能再往後add,remove
    // 2. Composite 樹枝構件 : 有自己的 List<Node> 可再串接 樹枝或樹葉
    String getName();

    void display();
}
