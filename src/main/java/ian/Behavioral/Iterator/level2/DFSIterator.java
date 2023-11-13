package ian.Behavioral.Iterator.level2;

import java.util.*;

class DFSIterator implements Iterator {// 深度優先搜索
    private Set<User> visited = new HashSet<>();
    private Stack<User> check = new Stack<>();

    public DFSIterator(User startUser) {
        check.push(startUser);
    }

    @Override
    public boolean hasNext() {
        while (!check.isEmpty() && visited.contains(check.peek())) {
            // 重複對象就用pop拿掉
            check.pop();
        }
        return !check.isEmpty();
    }

    @Override
    public User next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        User current = check.pop();
        visited.add(current);

        // 檢查朋友的名單，是否有自己沒有追蹤的
        current.getFriends().forEach(friend -> {
            if (!visited.contains(friend)) {
                check.push(friend);
            }
        });
        return current;
    }
}
