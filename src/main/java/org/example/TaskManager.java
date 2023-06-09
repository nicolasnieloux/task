package org.example;

import java.util.Scanner;

public class TaskManager {
    TaskList taskList = new TaskList();
    private ApplicationConsole applicationConsole;

    public TaskManager(ApplicationConsole applicationConsole) {
        this.applicationConsole = applicationConsole;
    }

    public void menu() {
        while (true) {
            applicationConsole.showMessage("Enter a command: (add, remove, mark, list, exit, list)");
            String command = applicationConsole.readLine();

            if (command.equals("add")) {
                applicationConsole.showMessage("Ajouter un id");
                int id = Integer.parseInt(applicationConsole.readLine());
                applicationConsole.showMessage("Ajouter un content");
                String content = applicationConsole.readLine();

                taskList.add(id, content, false);
            }

            if (command.equals("list")) {

                for (Task task : taskList.getTaskList()
                ) {
                    applicationConsole.showMessage(task.toString());

                }
            }
            if (command.equals("remove")) {

                applicationConsole.showMessage("Supprimer grâce à l'id");
                int id = Integer.parseInt(applicationConsole.readLine());
                taskList.remove(id);

            }
            if (command.equals("exit")) {
                return;
            }
        }
    }

}