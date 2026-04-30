package models;

import enums.Status;

import java.util.Date;

public class Task {
    private int id;
    private String description;
    private Date createdAt;
    private Date updatedAt;
    private Status status;

    public Task(int id, String description, Date createdAt){
        this.id = id;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = createdAt;
        this.status = Status.ToDo;
    };

    public void TaskUpdate(String description, Date updatedAt){
        this.description = description;
        this.updatedAt = updatedAt;
    }

    public void SetInProgress(){
        this.status = Status.InProgress;
    }

    public void SetDone(){
        this.status = Status.Done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", status=" + status +
                '}';
    }
}
