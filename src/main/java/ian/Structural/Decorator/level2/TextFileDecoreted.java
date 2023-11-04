package ian.Structural.Decorator.level2;

class TextFileDecoreted implements TextFile {

    private String content;

    public TextFileDecoreted(String content) {
        this.content = content;
    }

    @Override
    public String open() {
        return "open file";
    }

    @Override
    public String read() {
        return this.content;
    }
}
