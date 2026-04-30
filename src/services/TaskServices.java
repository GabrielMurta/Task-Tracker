package services;

import enums.Status;
import models.Task;
import repository.TaskRepository;

import java.util.Date;


public class TaskServices   {

    public TaskRepository _repository;

    public TaskServices(TaskRepository repository){
        _repository = repository;
    }

    public void CreateTask(int id, String description, Date createdAt){
        var task = new Task(id, description, createdAt);

        _repository.CreateTask(task);
        System.out.println("Task Created");
    }

    public void UpdateTask(int id, String description, Date updatedAt){

        var task = _repository.FindById(id);

        task.TaskUpdate(description, updatedAt);

        _repository.SaveTask(task);

        System.out.println("Task Updated");
    }

    public void DeleteTask(int id){
        _repository.DeleteTask(id);
        System.out.println("Task Deleted");
    }

    public void SetAsInProgress(int id){
        var task = _repository.FindById(id);

        if(task != null){
            task.SetInProgress();
            _repository.SaveTask(task);
            System.out.println("Task status = in progress");
        }

    }

    public void SetAsDone(int id){
        var task = _repository.FindById(id);

        if(task != null){
            task.SetDone();
            _repository.SaveTask(task);
            System.out.println("Task status = done");
        }

    }

    public void ListTask(){
        for(Task t : _repository.ListTask()){
            System.out.printf("Tarefa %d = %s -> %s", t.getId(), t.getDescription(), t.getStatus().toString());
        }
    }

    public void ListInProgressTask(){
      for(Task t : _repository.ListTask()){
          if(t.getStatus() == Status.InProgress){
              System.out.println(t);
          }
      }
    }

    public void ListDoneTask(){
        for(Task t : _repository.ListTask()){
            if(t.getStatus() == Status.Done){
                System.out.println(t);
            }
        }
    }
}
