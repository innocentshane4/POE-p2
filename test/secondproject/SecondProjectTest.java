/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package secondproject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class SecondProjectTest {
    
    public SecondProjectTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class SecondProject.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SecondProject.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isUsernameValid method, of class SecondProject.
     */
    @Test
    public void testIsUsernameValid() {
        System.out.println("isUsernameValid");
        String username = "";
        boolean expResult = false;
        boolean result = SecondProject.isUsernameValid(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPasswordComplex method, of class SecondProject.
     */
    @Test
    public void testIsPasswordComplex() {
        System.out.println("isPasswordComplex");
        String password = "";
        boolean expResult = false;
        boolean result = SecondProject.isPasswordComplex(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class SecondProject.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        String taskName = "";
        int taskNumber = 0;
        String expResult = "";
        String result = SecondProject.createTaskID(taskName, taskNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTaskDetails method, of class SecondProject.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        String taskName = "";
        int taskNumber = 0;
        String taskDescription = "";
        String taskID = "";
        String expResult = "";
        String result = SecondProject.printTaskDetails(taskName, taskNumber, taskDescription, taskID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTaskDescriptionValid method, of class SecondProject.
     */
    @Test
    public void testIsTaskDescriptionValid() {
        System.out.println("isTaskDescriptionValid");
        String taskDescription = "";
        boolean expResult = false;
        boolean result = SecondProject.isTaskDescriptionValid(taskDescription);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
