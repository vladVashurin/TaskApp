package com.InternProject.controller.dto;

import com.InternProject.entity.Task;

public class TaskResponseDto {

    private Long taskId;

    private String title;

    private String text;

    private String answer;

    public TaskResponseDto(Task task) {
        taskId = task.getTaskId();
        title = task.getTitle();
        text = task.getText();
        answer = task.getAnswer();
    }

    public TaskResponseDto(TaskRequestDto taskRequestDto) {
        this.title = taskRequestDto.getTitle();
        this.text = taskRequestDto.getText();
        this.answer = taskRequestDto.getAnswer();
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
