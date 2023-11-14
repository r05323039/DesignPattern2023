package ian.Behavioral.Mediator.level1;

class User {
    private String name;
    private Mediator chatRoom;
    // 每個物件只要跟中介者互動，透過中介者轉發到所有物件，由複雜的網狀結構，變成星狀結構

    public User(String name) {
        this.name = name;
    }

    void joinChatRoom(Mediator room) {
        this.chatRoom = room;
        room.addUser(this);
        System.out.println(name + "加入會議");
    }

    void sendMessage(String message) {
        if (chatRoom == null)
            throw new RuntimeException("Not in the chatroom");
        System.out.println(this.name + "發送 : " + message);
        chatRoom.sendMessage(message, this);
    }

    void receive(User user, String message) {
        System.out.printf("%s 視窗 | %s : %s%n", this.name, user.getName(), message);
    }

    public String getName() {
        return name;
    }
}
