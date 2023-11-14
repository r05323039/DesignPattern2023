package ian.Behavioral.Memento.level2;

import java.util.ArrayList;
import java.util.List;

class SaveManager {
    private List<GameMemento> savePoints = new ArrayList<>();

    public void save(Player player) {
        savePoints.add(player.save());
    }

    public void restore(Player player, int savePointIndex) {
        GameMemento gameMemento = savePoints.get(savePointIndex);
        player.load(gameMemento);
    }
}
