package ian.Behavioral.Command.level1;

import java.util.LinkedList;
import java.util.Queue;

class Waiter {
    // Waiter透過命令模式，不會跟Cook耦合，只要專注點餐請求
    private Queue<OrderCommand> orderQueue= new LinkedList<>();

    public void takeOrder(OrderCommand orderCommand) {
        orderQueue.add(orderCommand);
    }

    public void sendOrdersToKitchen() {
        while (!orderQueue.isEmpty()) {
            OrderCommand command = orderQueue.poll();
            command.execute();
        }
    }
}
