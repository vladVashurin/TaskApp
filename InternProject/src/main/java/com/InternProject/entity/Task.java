package com.InternProject.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import java.util.Objects;

@Entity
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  private  Long taskId;

  private  String title;

  private  String text;

  private String answer;

    public Task(String title, String text, String answer) {
        this.title = title;
        this.text = text;
        this.answer = answer;
    }

    public Long getTaskId(){
        return taskId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(taskId, task.taskId) && Objects.equals(title, task.title) && Objects.equals(text, task.text) && Objects.equals(answer, task.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, title, text, answer);
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
