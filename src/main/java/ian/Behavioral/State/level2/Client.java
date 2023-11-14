package ian.Behavioral.State.level2;

class Client {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer("MP3");

        player.stop();
        player.stop();
        player.play();
        player.play();
        player.play();
        player.play();
        player.play();
        player.charge();
        player.stop();

        player.play();
        player.play();
        player.charge();
        player.play();
        player.stop();
    }
}
