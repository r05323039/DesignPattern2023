package ian.Structural.Decorator.level2;

abstract class AbstractTextFileDecorator implements TextFile {

    public AbstractTextFileDecorator(TextFile file) {
        this.file = file;
    }

    private TextFile file;

    @Override
    public String open() {
        return file.open();
    }

    @Override
    public String read() {
        return file.read();
    }
}
