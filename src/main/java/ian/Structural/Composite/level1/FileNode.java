package ian.Structural.Composite.level1;

class FileNode implements FileSystemNode {
    private String fileName;

    public FileNode(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public String getName() {
        return this.fileName;
    }


    @Override
    public void display() {
        System.out.println("File: " + fileName);
    }

}
