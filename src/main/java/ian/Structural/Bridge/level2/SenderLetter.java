package ian.Structural.Bridge.level2;

class SenderLetter implements Sender {
    @Override
    public void sendMessage(Message message) {
        System.out.println("透過Letter送出" + message);
    }
}
