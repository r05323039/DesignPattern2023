package ian.Structural.Bridge.level2;

class SenderEmail implements Sender {
    @Override
    public void sendMessage(Message message) {
        System.out.println("透過email送出" + message);
    }
}
