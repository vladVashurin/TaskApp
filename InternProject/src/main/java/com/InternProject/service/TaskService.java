package com.InternProject.service;

import com.InternProject.entity.Task;
import com.InternProject.exception.TaskNotFoundException;
import com.InternProject.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Long save(String title, String text, String answer){
      return taskRepository.save(new Task(title,text,answer)).getTaskId();

    }

    public Long save(Task task){
        return taskRepository.save(task).getTaskId();
    }

    public Task getById(Long taskId){
       return taskRepository.findById(taskId).orElseThrow(()->new TaskNotFoundException("Unable to find task with id: " + taskId));}

    public Task update(Long taskId , Task t){
      Task task = getById(taskId);
      task.setTitle(t.getTitle());
      task.setText(t.getText());
      task.setAnswer(t.getAnswer());
return taskRepository.save(task);
    }

    public Task delete(Long taskId){
        Task task = getById(taskId);;
        taskRepository.delete(task);
        return task;
    }
}
