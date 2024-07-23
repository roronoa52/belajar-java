package View;

import Service.TodolistService;

import java.util.Scanner;

public class TodolistView {

    private TodolistService todolistService;

    public Scanner scanner = new Scanner(System.in);

    public TodolistView(TodolistService todolistService) {
        this.todolistService = todolistService;
    }

    public void viewTodolist(){
        while (true){

            todolistService.showTodoList();

            System.out.println("1. Membuat Todolist");
            System.out.println("2. Menghapus Todolist");
            System.out.println("x. Keluar dari aplikasi");
            System.out.print("Masukan pilihan: ");
            String input = scanner.nextLine();

            if (input.equals("1")) {

                System.out.print("Masukan todo: ");
                String todo = scanner.nextLine();
                todolistService.addTodoList(todo);
            } else if (input.equals("2")) {

                System.out.print("Masukan nomor: ");
                String todo = scanner.nextLine();
                todolistService.removeTodoList(Integer.parseInt(todo) - 1);
            } else if (input.equals("x")) {
                break;
            }else{
                System.out.println("Pilihan salah");
                break;
            }

        }

    }
}
