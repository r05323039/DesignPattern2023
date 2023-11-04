package ian.Structural.Adapter.level3;

public class ComplexShapeAdapter implements Shape {

    private ComplexShape complexShape;
    private double defaultScaleFactor = 1;
    //scale(double d), resize()，當方法簽名不同
    // 1. 增加成員屬性，由建構子傳入或預設
    // 2. 新增resize(double b)方法，原本的留空

    public ComplexShapeAdapter(ComplexShape complexShape, double scaleFactor) {
        this.complexShape = complexShape;
        this.defaultScaleFactor = scaleFactor;
    }

    @Override
    public void draw() {
        complexShape.render();
    }

    @Override
    public void resize() {
        complexShape.scale(defaultScaleFactor);
    }
}
