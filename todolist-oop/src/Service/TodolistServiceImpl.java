package Service;

import Entity.Todolist;
import Repository.TodolistRepository;

public class TodolistServiceImpl implements TodolistService{

    private TodolistRepository todolistRepository;

    public TodolistServiceImpl(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    @Override
    public void showTodoList() {

        Todolist[] model = todolistRepository.getAll();

        System.out.println("==========================================================");
        System.out.println();

        for (var i = 0; i < model.length; i++){

            Todolist todolist = model[i];

            if (todolist != null){
                System.out.println(i+1 +". "+todolist.getTodo());

            }
        }

        System.out.println();
        System.out.println("==========================================================");

    }

    @Override
    public void addTodoList(String todo) {

        Todolist todolist = new Todolist();
        todolist.setTodo(todo);
        todolistRepository.add(todolist);


    }

    @Override
    public void removeTodoList(Integer index) {

        todolistRepository.remove(index);

    }
}
