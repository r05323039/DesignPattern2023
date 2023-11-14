package ian.Behavioral.Memento.level1;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

class Editor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public EditorMemento save() {//創建Memento物件，用來儲存當前屬性
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento) {
        content = memento.getState();// 拿到某個Memento物件，重新賦值
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.NO_CLASS_NAME_STYLE);
    }
}