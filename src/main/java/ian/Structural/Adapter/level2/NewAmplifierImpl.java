package ian.Structural.Adapter.level2;

class NewAmplifierImpl implements NewAmplifier {

    @Override
    public double scale(double factor) {
        return factor * 2;
    }
}
