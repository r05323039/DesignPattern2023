package ian.Behavioral.Memento.level1;

class Client {
    public static void main(String[] args) {
        History history = new History();
        Editor editor = new Editor();
        editor.setContent("1111");
        history.save(editor);

        System.out.println(editor);

        editor.setContent("2222");
        System.out.println(editor);

        history.undo(editor);
        System.out.println(editor);

        history.undo(editor);
        System.out.println(editor);
    }
}
