package com.InternProject.controller;

import com.InternProject.controller.dto.TaskRequestDto;
import com.InternProject.controller.dto.TaskResponseDto;
import com.InternProject.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/{taskId}")
    public TaskResponseDto getTask(@PathVariable Long taskId) {
        return new TaskResponseDto(taskService.getById(taskId));
    }

    @PostMapping("/")
    public Long createTask(@RequestBody TaskRequestDto taskRequestDto) {
        return taskService.save(taskRequestDto.getTitle(), taskRequestDto.getText(), taskRequestDto.getAnswer());
    }

    @PutMapping("/{taskId}")
    public TaskResponseDto updateTask(@PathVariable Long taskId, @RequestBody TaskRequestDto taskRequestDto) {
        return new TaskResponseDto(taskService.update(taskId, taskRequestDto.getTitle(), taskRequestDto.getText(), taskRequestDto.getAnswer()));
    }

    @DeleteMapping("/taskId")
    public TaskResponseDto deleteTask(@PathVariable Long taskId) {
        return new TaskResponseDto(taskService.delete(taskId));
    }

}
