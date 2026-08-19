// Main.java of Task and TaskManager 
import java.util.Scanner;


public class Main(){
    public Static void (String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.print("Type your list name:");
    String listName = input.nextLine();

    System.out.print("Enter the number of tasks:");
    int numberOfYasks = input.nesxInt();

    // Create a Task object
    Task task = new Task();
    task.setlist(listName);
    task.setTasks(numberOfTasks);

    // Create a TaskManager that can hold 10 tasks
    TsakManager manager = new TaskManager(10);

    // Print all tasks
    manager.printTasks();

    input.close();


    }
