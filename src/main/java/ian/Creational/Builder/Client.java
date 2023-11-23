package ian.Creational.Builder;

class Client {
    public static void main(String[] args) {
        People Ian = People.Builder("Ian", "Lin") // 必填參數，放在Builder建構子，甚至final
                .setNickName("IANLIN").build();
        System.out.println(Ian);
    }
}
