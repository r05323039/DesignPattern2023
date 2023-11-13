package ian.Behavioral.Iterator.level2;

import java.util.HashSet;
import java.util.Set;

public class User {
    private String name;
    private Set<User> friends;

    public User(String name) {
        this.name = name;
        this.friends = new HashSet<>();
    }

    public void addFriend(User friend) {
        friends.add(friend);
        friend.friends.add(this); // 雙向添加
    }

    public Set<User> getFriends() {
        return friends;
    }

    public String getName() {
        return name;
    }
}
