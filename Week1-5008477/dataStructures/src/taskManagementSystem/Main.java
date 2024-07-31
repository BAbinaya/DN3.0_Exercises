package taskManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create a new singly linked list
        SinglyLinkedList taskList = new SinglyLinkedList();
        
        // Add tasks to the linked list
        taskList.addTask(new Task("1", "Task One", "Pending"));
        taskList.addTask(new Task("2", "Task Two", "In Progress"));
        taskList.addTask(new Task("3", "Task Three", "Completed"));
        
        // Traverse and print all tasks
        System.out.println("All tasks:");
        taskList.traverseTasks();
        
        // Search for a task by ID
        String searchId = "2";
        Task foundTask = taskList.searchTask(searchId);
        if (foundTask != null) {
            System.out.println("Task found with ID " + searchId + ": " + foundTask);
        } else {
            System.out.println("Task with ID " + searchId + " not found.");
        }
        
        // Delete a task by ID
        String deleteId = "1";
        taskList.deleteTask(deleteId);
        System.out.println("Tasks after deletion of ID " + deleteId + ":");
        taskList.traverseTasks();
    }
}

