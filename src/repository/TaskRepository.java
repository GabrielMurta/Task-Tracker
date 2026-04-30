package repository;

import models.Task;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskRepository {

    public List<Task> tasks = new ArrayList<>();

    public Task FindById(int id){
       return tasks.stream()
               .filter(t -> t.getId() == id)
               .findFirst()
               .orElse(null);
    }

    public void CreateTask(Task task){
        tasks.add(task);
    }

    public void SaveTask(Task task){
        tasks.remove(FindById(task.getId()));
        tasks.add(task);
    }

    public void DeleteTask(int id){
        tasks.remove(FindById(id));
    }

    public List<Task> ListTask(){
        return tasks;
    }
}
