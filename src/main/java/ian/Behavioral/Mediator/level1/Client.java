package ian.Behavioral.Mediator.level1;

class Client {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User ian = new User("Ian");
        User henry = new User("Henry");
        User mike = new User("Mike");

        ian.joinChatRoom(chatRoom);
        henry.joinChatRoom(chatRoom);
        mike.joinChatRoom(chatRoom);

        ian.sendMessage("HI");
    }
}
