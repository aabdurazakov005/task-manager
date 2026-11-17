package com.taskmanager.model;

import java.time.LocalDateTime;

public class Task {
   private int id;
   private String title;
   private String description;
   private TaskStatus status;
   private LocalDateTime createdAt;

   @Override
   public String toString() {
      return "Task{" +
              "id=" + id +
              ", title='" + title + '\'' +
              ", description='" + description + '\'' +
              ", status=" + status +
              ", createdAt=" + createdAt +
              '}';
   }

   public int getId() {
      return id;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public TaskStatus getStatus() {
      return status;
   }

   public void setStatus(TaskStatus status) {
      this.status = status;
   }

   public LocalDateTime getCreatedAt() {
      return createdAt;
   }

   public Task(int id, String title, String description, TaskStatus status) {
      this.id = id;
      this.title = title;
      this.description = description;
      this.status = status;
      this.createdAt = LocalDateTime.now();
   }
}
