package ian.Structural.Composite.level2;

import java.util.ArrayList;
import java.util.List;

class DirectoryNode extends NodeImpl {
    private List<NodeImpl> children = new ArrayList<>();

    public DirectoryNode(String name) {
        super(name);
    }

    public void add(NodeImpl... nodes) {
        for (NodeImpl node : nodes) {
            children.add(node);// 加入為自己的管理組件
            node.addParent(this); //更新子件的新父類資訊
        }
    }

    public void remove(NodeImpl... nodes) {
        for (NodeImpl node : nodes) {
            children.remove(node);
            node.removeParent();
        }
    }

    @Override
    public void removeParent() {
        super.removeParent();
        for (NodeImpl node : children) {// Directory被斷開後，其下管理的子件全部初始化節點
            node.removeParent();
        }
    }

    @Override
    public void displayAbsolutePath() {
        System.out.println("Directory : " + this.getAbsolutePath());
        for (NodeImpl node : children) {
            node.displayAbsolutePath();
        }
    }
}
