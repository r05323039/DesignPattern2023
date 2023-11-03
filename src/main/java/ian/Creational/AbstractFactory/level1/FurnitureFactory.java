package ian.Creational.AbstractFactory.level1;

 interface FurnitureFactory {
    Chair createChair();// 工廠實例再實作創建方法

    Table createTable();

    // 如果未來需要不同風格的工廠，就不用修改原本的工廠
}
