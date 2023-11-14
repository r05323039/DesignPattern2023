package ian.Behavioral.State.level1;

interface State {//定義不同的狀態，再由代表狀態class實作執行邏輯

    void play(MusicPlayer player);

    void stop(MusicPlayer player);

    void charge(MusicPlayer player);// 充電直接進入stop，簡化不實作chargeState，如果隨著時間充電，就需要實作

    // 複雜的狀態需要維持物件的屬性，所以用enum不合適，譬如播放次數超過3，就必須停電
}
