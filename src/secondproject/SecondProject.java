/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secondproject;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class SecondProject {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic he

        
     // Registration
        String firstName = JOptionPane.showInputDialog("Enter First Name: ");
        String lastName = JOptionPane.showInputDialog("Enter Last Name: ");
        String registerUsername = JOptionPane.showInputDialog("Enter Username: ");
        String registerPassword = JOptionPane.showInputDialog("Enter Password: ");

        // Register and check if valid
        if (isUsernameValid(registerUsername) && isPasswordComplex(registerPassword)) {
            JOptionPane.showMessageDialog(null, "Username and password are valid.");
        } else {
            JOptionPane.showMessageDialog(null, "Username or password is invalid. Please try again.");
            return;
        }

        // Login 
        String loginUsername = JOptionPane.showInputDialog("Enter Username: ");
        String loginPassword = JOptionPane.showInputDialog("Enter Password: ");

        // Check if login is successful
        if (loginUsername.equals(registerUsername) && loginPassword.equals(registerPassword)) {
            JOptionPane.showMessageDialog(null, "Successful login. Welcome, " + firstName + " " + lastName + "!");
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
            doLogin();
        } else {
            JOptionPane.showMessageDialog(null, "Failed login. Please try again.");
        }
    }

    // login tasks
    private static void doLogin() {
        int choice;
        do {
            choice = Integer.parseInt(JOptionPane.showInputDialog("Choose an option:\n1. Add tasks\n2. Show report\n3. Quit"));
            switch (choice) {
                case 1:
                    // Add tasks
                    int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks:"));
                    int totalHours = 0;

                    for (int i = 0; i < numTasks; i++) {
                        String taskName = JOptionPane.showInputDialog("Enter task name:");
                        String taskDescription = JOptionPane.showInputDialog("Enter task description:");

                        //  if task description is valid
                        if (isTaskDescriptionValid(taskDescription)) {
                            //  task ID
                            String taskID = createTaskID(taskName, i);

                            // Create task details
                            String taskDetails = printTaskDetails(taskName, i, taskDescription, taskID);

                            //  task details
                            JOptionPane.showMessageDialog(null, taskDetails);

                            //  task duration
                            int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter task duration:"));
                            totalHours += taskDuration;
                        } else {
                            JOptionPane.showMessageDialog(null, "Task description is invalid. Please try again.");
                        }
                    }

                    // Display time
                    JOptionPane.showMessageDialog(null, "Total hours: " + totalHours);
                    break;
                case 2:
                    // Show report
                    JOptionPane.showMessageDialog(null, "Coming Soon");
                    break;
                case 3:
                    // Quit
                    JOptionPane.showMessageDialog(null, "Exiting the application.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);
    }

    //  to check if username is valid
    public static boolean isUsernameValid(String username) {
        // Check if username contains at least one underscore and is at least 6 characters long
        return username.length() >= 6 && username.contains("_");
    }

    //  check if password is complex
    public static boolean isPasswordComplex(String password) {
        //  if password is at least 8 characters long and contains at least one uppercase letter, one digit, and one special character
        return password.length() >= 8 && password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+=-{}|\\[\\];:',.<>/?]).*$");
    }

    //  create task ID
    public static String createTaskID(String taskName, int taskNumber) {
        return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":Developer";
    }

    //  print task details
    public static String printTaskDetails(String taskName, int taskNumber, String taskDescription, String taskID) {
        return "Task Name: " + taskName + "\nTask Number: " + taskNumber + "\nTask Description: " + taskDescription + "\nTask ID: " + taskID;
    }

    // to check if task description is valid
    public static boolean isTaskDescriptionValid(String taskDescription) {
        return true; // You can add your own validation logic here.
    }
}
    
    

   
    

