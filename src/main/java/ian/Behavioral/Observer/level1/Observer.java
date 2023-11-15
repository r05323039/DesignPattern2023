package ian.Behavioral.Observer.level1;

interface Observer {
    void update(float temperature, float humidity);
    // 給subject的通知方法調用，更新Observer狀態
}
