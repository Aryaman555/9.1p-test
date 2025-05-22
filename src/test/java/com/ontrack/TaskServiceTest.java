package com.ontrack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {

	@Test
	public void testGetSubmissionStatus_NotSubmitted() {
	    TaskService service = new TaskService();
	    assertEquals("Not Submitted", service.getSubmissionStatus("T102"));
	}

	@Test
	public void testGetSubmissionStatus_Unknown() {
	    TaskService service = new TaskService();
	    assertEquals("Not Found", service.getSubmissionStatus("T999"));
	}

}
