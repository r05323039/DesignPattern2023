package ian.Behavioral.Memento.level2;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

class Player implements Cloneable{
    private int level;
    private int HP;

    public Player(int level, int HP) {
        this.level = level;
        this.HP = HP;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getLevel() {
        return level;
    }

    public int getHP() {
        return HP;
    }

    @Override
    protected Player clone()  {
        try {
            return (Player) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public GameMemento save() {
        //重點 : Memento保存的狀態，如果是物件，要用deepClone或是new一個新的，否則都是同一個物件的reference
        return new GameMemento(this.clone());
    }

    public void load(GameMemento savePoint) {
        Player player = savePoint.getPlayer();
        this.HP = player.getHP();
        this.level = player.getLevel();
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
