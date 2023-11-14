package ian.Behavioral.Memento.level1;

import java.util.Stack;

class History {
    private final Stack<EditorMemento> states = new Stack<>();

    public void save(Editor editor) {
        states.push(editor.save());
    }

    public void undo(Editor editor) {
        if (!states.isEmpty()) {
            editor.restore(states.pop());// 取出最近一次的快照，用後進先出的Stack
        } else {
            System.out.println("No states to undo.");
        }
    }
}