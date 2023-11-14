package ian.Behavioral.Memento.level2;

class Client {
    public static void main(String[] args) {
        SaveManager saveManager = new SaveManager();

        Player player = new Player(1, 10);
        saveManager.save(player);
        System.out.println(player);

        player.setLevel(5);
        player.setHP(30);
        saveManager.save(player);
        System.out.println(player);

        saveManager.restore(player, 0);
        System.out.println(player);

        saveManager.restore(player, 1);
        System.out.println(player);
    }
}
