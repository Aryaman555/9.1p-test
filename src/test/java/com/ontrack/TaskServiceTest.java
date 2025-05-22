package com.ontrack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {

    @Test
    public void testGetSubmissionStatus_Submitted() {
        TaskService service = new TaskService();
        String status = service.getSubmissionStatus("T101");  // Function doesn't exist yet
        assertEquals("Submitted", status);
    }
}
