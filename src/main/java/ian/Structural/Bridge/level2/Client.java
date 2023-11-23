package ian.Structural.Bridge.level2;

class Client {
    public static void main(String[] args) {
        SenderEmail emailSender = new SenderEmail();
        SenderLetter senderLetter = new SenderLetter();

        MessageInfo infoMessage = new MessageInfo(emailSender);
        infoMessage.send();

        infoMessage.setSender(senderLetter);
        infoMessage.send();
    }
}
