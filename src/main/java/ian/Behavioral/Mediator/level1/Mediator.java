package ian.Behavioral.Mediator.level1;

interface Mediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
