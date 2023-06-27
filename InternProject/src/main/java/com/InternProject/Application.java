package com.InternProject;

import com.InternProject.entity.Task;
import com.InternProject.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    public Application(TaskService taskService) {
        this.taskService = taskService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    private final TaskService taskService;

    @Override
    public void run(String... args) throws Exception {
        Task task = new Task("вова", "качается", "под пиво");
        taskService.save(task);
        Task task1 = new Task("вова", "качается", "под пиво");
        taskService.save(task1);
        Task task2 = new Task("миха", "любит", "пиво");
        taskService.update(1l, task2);
        System.out.println(taskService.getById(1l));
        taskService.delete(2l);
    }
}
