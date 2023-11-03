package ian.Structural.Bridge.level2;

class MessageInfo implements Message {
    private Sender sender;// 橋 : 接收實作Sender的物件，透過不同的工具發送

    public MessageInfo(Sender sender) {
        this.sender = sender;
    }

    @Override
    public void send() {
        sender.sendMessage(this);
    }

    @Override
    public void setSender(Sender sender) {
        this.sender = sender;
    }
}
