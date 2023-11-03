package ian.Structural.Composite.level2;

public class FileSystemNodeImpl implements FileSystemNode {
    // 樹葉（Leaf）和樹枝（Composite）有共同的方法和屬性，共同的抽象類別先實作介面，再讓樹枝樹葉繼承
    // 樹枝有額外的責任去管理子元件。
    private String name;
    private DirectoryNode parent = null;//再未被 add()前，沒有父節點
    private String absolutePath;

    public FileSystemNodeImpl(String name) {
        this.name = name;
        this.absolutePath = name;
    }

    public String getName() {
        return name;
    }

    public String getAbsolutePath() {
        return this.absolutePath;
    }

    public void addParent(DirectoryNode parentNode) {
        this.parent = parentNode;
        this.absolutePath = parent.getAbsolutePath() + "/" + this.name;
        // 樹枝添加子類到自己的List，同時呼叫子類的方法設定其父節點及更新路徑
    }

    public void removeParent() { // 移除父節點，並把路徑初始化為自己的檔名
        this.parent = null;
        this.absolutePath = this.name;
    }

    @Override
    public void displayAbsolutePath() {
        System.out.println(this.absolutePath);
    }
}
