package org.example.command;

public class SimpleRemoteControl {
  private Command[] onCommands;
  private Command[] offCommands;

  private Command undoCommand;

  //Конструктор пульта предполагает 7 программируемых кнопок включения и 7 отключения функции
  public SimpleRemoteControl() {
    this.onCommands = new Command[7];
    this.offCommands = new Command[7];

    Command noCommand = new NoCommand();
    for (int i = 0; i < 7; i++) {
      this.onCommands[i] = noCommand;
      this.offCommands[i] = noCommand;
    }
    this.undoCommand = noCommand;
  }

  //Ассоциация кнопок пульта с командами
  public void setCommand(int slot, Command onCommand, Command offCommand) {
    this.onCommands[slot] = onCommand;
    this.offCommands[slot] = offCommand;
  }

  //Метод выполняет команду ON заданного слота
  public void onButtonWasPushed(int slot) {
    this.onCommands[slot].execute();
    this.undoCommand = this.onCommands[slot];
  }

  //Метод выполняет команду OFF заданного слота
  public void offButtonWasPushed(int slot) {
    this.offCommands[slot].execute();
    this.undoCommand = this.offCommands[slot];
  }

  public void undoButtonWasPushed() {
    undoCommand.undo();
  }

  public String toString() {
    StringBuffer stringBuff = new StringBuffer();
    stringBuff.append("\n------ Remote Control -------\n");
    for (int i = 0; i < onCommands.length; i++) {
      stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName().substring(onCommands[i].getClass().getName().lastIndexOf(".") + 1)
        + " " + offCommands[i].getClass().getName().substring(offCommands[i].getClass().getName().lastIndexOf(".") + 1) + "\n");
    }
    stringBuff.append("Last command to undo: " + this.undoCommand.getClass().getName().substring(this.undoCommand.getClass().getName().lastIndexOf(".") + 1) + "\n");
    return stringBuff.toString();
  }
}
