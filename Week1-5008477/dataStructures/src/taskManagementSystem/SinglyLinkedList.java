package taskManagementSystem;

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    // Method to add a task at the beginning
    public void addTask(Task task) {
        Node newNode = new Node(task);
        newNode.next = head;
        head = newNode;
    }

    // Method to search for a task by ID
    public Task searchTask(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Method to traverse and print all tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Method to delete a task by ID
    public void deleteTask(String taskId) {
        Node current = head;
        Node previous = null;

        // If head node itself holds the task to be deleted
        if (current != null && current.task.getTaskId().equals(taskId)) {
            head = current.next; // Changed head
            return;
        }

        // Search for the task to be deleted, keep track of the previous node
        while (current != null && !current.task.getTaskId().equals(taskId)) {
            previous = current;
            current = current.next;
        }

        // If the task was not present in the linked list
        if (current == null) {
            return;
        }

        // Unlink the node from linked list
        previous.next = current.next;
    }
}
