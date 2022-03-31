package com.company;

import java.util.Objects;

public class Task {
    private String title;
    private String contentTask;
    private boolean isActive;
    public Task() {

    }
    public Task(String title, String contentTask, boolean isActive) {
        this.title = title;
        this.contentTask = contentTask;
        this.isActive = isActive;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentTask() {
        return contentTask;
    }

    public void setContentTask(String contentTask) {
        this.contentTask = contentTask;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return isActive == task.isActive && title.equals(task.title) && contentTask.equals(task.contentTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, contentTask, isActive);
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", contentTask=" + contentTask +
                ", isActive=" + isActive +
                '}';
    }
}
