package ian.Structural.Composite.level2;

class FileNode extends FileSystemNodeImpl {

    public FileNode(String name) {
        super(name);
    }
    @Override
    public void displayAbsolutePath() {
        System.out.println("File : " + this.getAbsolutePath());
    }
}
