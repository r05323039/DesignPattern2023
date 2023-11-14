package ian.Behavioral.State.level2;

class StoppedState implements State {
    @Override
    public void play(MusicPlayer player) {
        if (player.getAvailablePlayCount() > 0) {
            player.setState(new PlayingState());
            player.minusPlayCount();
            System.out.printf("%s 啟動播放，剩餘電量%d%n", player.getName(), player.getAvailablePlayCount());
        } else {
            System.out.printf("%s 沒電了%n", player.getName());
        }
    }

    @Override
    public void stop(MusicPlayer player) {
        System.out.printf("%s 已經停止，操作無效%n", player.getName());
    }

    @Override
    public void charge(MusicPlayer player) {
        player.resetPlayCount();
        System.out.printf("%s 充電%n", player.getName());
    }
}
