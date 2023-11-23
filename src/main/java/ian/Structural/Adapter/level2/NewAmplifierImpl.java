package ian.Structural.Adapter.level2;

public class NewAmplifierImpl implements NewAmplifier {

    @Override
    public double scale(double factor) {
        return factor * 2;
    }
}
