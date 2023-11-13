package ian.Behavioral.Mediator.level1;

import java.util.ArrayList;
import java.util.List;

class ChatRoom implements Mediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User talker) {
        if (!users.contains(talker))
            throw new RuntimeException("User is not in the room");

        for (User u : users) {
            if (u != talker) {
                u.receive(talker, message);
            }
        }
    }
}
