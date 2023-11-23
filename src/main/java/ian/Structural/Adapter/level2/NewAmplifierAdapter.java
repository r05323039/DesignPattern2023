package ian.Structural.Adapter.level2;

public class NewAmplifierAdapter implements Amplifier {

    private NewAmplifier complexShape;
    private double factor;
    //scale(double d), enlarge()，當方法參數不同
    // 1. 增加成員屬性，由 1. 建構子 2. setter 3. 預設 傳參
    // 2. 新增resize(double b)方法，原本的留空

    public NewAmplifierAdapter(NewAmplifier complexShape, double scaleFactor) {
        this.complexShape = complexShape;
        this.factor = scaleFactor;
    }

    @Override
    public double enlarge() {
       return complexShape.scale(factor);
    }
}
