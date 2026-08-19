// To situp a setList and setTasks for public
public class TaskManager{
    
private Task[] stasks; 
private int scount;

// Constuctor: create a manager that can hold N tasks
public TaskManager(int size){
    tasks = new Task[size];
    count = 0;
}

// Add a new Task to the manager
public void addTask(Task task){
    if (count < tasks.length){
        tasks[count] = task;
        count++;
    }else{
        System.out.println("Task list id full.");
    }
}
// Print all tasks
public void printTasks(){
    System.out.println("\nYour Tasks:");
    System.out.println("-----------");

    for (int i = 0; i < count; i++){
         System.out.println("List:" + tasks[i].getList());
         System.out.println("Number of tasks:" + tasks[i].getTasks());
         System.out.println();
    }
}

}

  
