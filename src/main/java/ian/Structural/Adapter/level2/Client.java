package ian.Structural.Adapter.level2;

class Client {
    public static void main(String[] args) {
        NewAmplifierAdapter adapter = new NewAmplifierAdapter(new NewAmplifierImpl(), 3);
        System.out.println(adapter.enlarge());
    }
}
