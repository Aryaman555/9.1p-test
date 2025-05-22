package com.ontrack;

import java.util.HashMap;
import java.util.Map;

public class TaskService {

    private Map<String, String> taskStatusMap = new HashMap<>();

    public TaskService() {
        taskStatusMap.put("T101", "Submitted");
        taskStatusMap.put("T102", "Not Submitted");
    }

    public String getSubmissionStatus(String taskId) {
        return taskStatusMap.getOrDefault(taskId, "Not Found");
    }
}
