package ian.Structural.Composite.level2;

class FileNode extends NodeImpl {

    public FileNode(String name) {
        super(name);
    }
    @Override
    public void displayAbsolutePath() {
        System.out.println("File : " + this.getAbsolutePath());
    }
}
