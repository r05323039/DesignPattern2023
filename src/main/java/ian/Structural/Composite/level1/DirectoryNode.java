package ian.Structural.Composite.level1;

import java.util.ArrayList;
import java.util.List;

class DirectoryNode implements FileSystemNode {
    private String directoryName;
    private List<FileSystemNode> children = new ArrayList<>();


    public DirectoryNode(String directoryName) {
        this.directoryName = directoryName;
    }

    @Override
    public String getName() {
        return this.directoryName;
    }

    @Override
    public void display() {
        System.out.println("Directory: " + directoryName);
        for (FileSystemNode node : children) {
            node.display();
        }
    }
    public void add(FileSystemNode... nodes) {
        for (FileSystemNode node : nodes) {
            children.add(node);
        }
    }

    public void remove(FileSystemNode... nodes) {
        for (FileSystemNode node : nodes) {
            children.remove(node);
        }
    }
}
