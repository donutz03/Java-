import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Main {

public static void main(String[] args) {

// Here you can try out the combined functionality of your classes
TodoList list = new TodoList();
Scanner scanner = new Scanner(System.in);

UserInterface ui = new UserInterface(list, scanner);
ui.start();

}
}



public class TodoList {
private List < String > tasks;

public TodoList() {
tasks = new ArrayList<>();
}

public void add(String task) {
tasks.add(task);
}

public void print() {
for (int i = 0; i < tasks.size(); i++) {
System.out.println((i + 1) + ": " + tasks.get(i));
}
}

public void remove(int number) {
tasks.remove(number - 1);
}
}


public class UserInterface {
private TodoList todoList;
private Scanner scanner;

public UserInterface(TodoList todoList, Scanner scanner) {
this.todoList = todoList;
this.scanner = scanner;
}

public void start() {
while (true) {
System.out.print("Command: ");
String command = scanner.nextLine();

if (command.equals("stop")) {
break;
} else if (command.equals("add")) {
System.out.print("To add: ");
String task = scanner.nextLine();
todoList.add(task);
} else if (command.equals("list")) {
todoList.print();
} else if (command.equals("remove")) {
System.out.print("Which one is removed? ");
int number = Integer.parseInt(scanner.nextLine());
todoList.remove(number);
}
}
}
}