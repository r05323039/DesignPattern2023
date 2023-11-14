package ian.Behavioral.Memento.level2;

class GameMemento {
    private Player player;

    public GameMemento(Player state) {
        this.player = state;
    }

    public Player getPlayer() {
        return player;
    }
}
