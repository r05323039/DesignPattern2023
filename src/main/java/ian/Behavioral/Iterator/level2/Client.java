package ian.Behavioral.Iterator.level2;

class Client {
    public static void main(String[] args) {
        User alice = new User("Alice");
        User bob = new User("Bob");
        User carol = new User("Carol");

        alice.addFriend(bob);
        bob.addFriend(carol);
        carol.addFriend(alice);

        System.out.println("DFS Traversal:");
        DFSIterator dfsIterator = new DFSIterator(alice);
        while (dfsIterator.hasNext()) {
            System.out.println(dfsIterator.next().getName());
        }
    }
}

