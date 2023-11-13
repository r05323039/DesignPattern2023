package ian.Behavioral.Command.level2;

import java.util.ArrayList;
import java.util.List;

class RemoteControl {
    // 遙控器，不會跟電器耦合，只跟執行命令對話
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(int index, Command c) {
        commandList.add(index, c);
    }

    public void pressOnButton(int index) {
        Command c = commandList.get(index);
        if (c != null) {
            c.execute();
        }
    }

    public void pressOffButton(int index) {
        Command c = commandList.get(index);
        if (c != null) {
            c.undo();
        }
    }

    public void pressOnAll(){
        commandList.forEach(c-> c.execute());
    }

    public void pressOffAll(){
        commandList.forEach(c-> c.undo());
    }
}
