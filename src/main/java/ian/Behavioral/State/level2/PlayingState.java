package ian.Behavioral.State.level2;

class PlayingState implements State {
    @Override
    public void play(MusicPlayer player) {
        if (player.getAvailablePlayCount() > 0) {
            player.minusPlayCount();
            System.out.printf("%s 播放中，剩餘電量%d%n", player.getName(), player.getAvailablePlayCount());
        } else {
            System.out.printf("%s 沒電了%n", player.getName());
        }
    }

    @Override
    public void stop(MusicPlayer player) {
        player.setState(new StoppedState());
        System.out.printf("%s 由播放改為停止%n", player.getName());
    }

    @Override
    public void charge(MusicPlayer player) {
        player.setState(new StoppedState());
        player.resetPlayCount();
        System.out.printf("%s 充電%n", player.getName());
    }
}
