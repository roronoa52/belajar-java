package Repository;

import Entity.Todolist;

public class TodolistRepositoryImpl implements TodolistRepository {

    public Todolist[] data = new Todolist[10];


    @Override
    public Todolist[] getAll() {
        return data;
    }

    @Override
    public void add(Todolist todolist) {
        boolean isFull = true;

        for (var i = 0; i < data.length; i++){
            if(data[i] == null){
                isFull = false;
                break;
            }
        }

        if (isFull){
            Todolist[] temp = data;
            data = new Todolist[data.length*2];

            for (var i = 0; i < temp.length; i++){
                data[i] = temp[i];
            }
        }

        for (var i = 0; i < data.length; i++){
            if(data[i] == null){
                data[i] = todolist;
                break;
            }
        }
    }

    @Override
    public void remove(Integer index) {

        if(data[index] != null){
            data[index] = null;
        }

        Todolist[] temp = data;
        for (var i = 0; i < temp.length; i++){
            if(data[i] == null && i + 1 < data.length){
                data[i] = temp[i+1];
                data[i+1] = null;
            }
        }

    }
}
