import java.util.Scanner;

public class Main {

    public static String[] todolist = new String[3];

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        menu(scanner);

    }

    public static void menu(Scanner scanner){
        while (true){

            viewTodoList();

            System.out.println("1. Membuat Todolist");
            System.out.println("2. Menghapus Todolist");
            System.out.println("x. Keluar dari aplikasi");
            System.out.print("Masukan pilihan: ");
            String input = scanner.nextLine();

            if (input.equals("1")) {

                System.out.print("Masukan todo: ");
                String todo = scanner.nextLine();
                addTodoList(todo);
            } else if (input.equals("2")) {

                System.out.print("Masukan nomor: ");
                String todo = scanner.nextLine();
                deleteTodo(Integer.parseInt(todo) - 1);
            } else if (input.equals("x")) {
                break;
            }else{
                System.out.println("Pilihan salah");
                break;
            }

        }

    }

    public static void viewTodoList(){

        System.out.println("==========================================================");
        System.out.println();

        for (var i = 0; i < todolist.length; i++){
            if (todolist[i] != null){
                System.out.println(i+1 +". "+todolist[i]);

            }
        }

        System.out.println();
        System.out.println("==========================================================");
    }

    public static void addTodoList(String todo){
        boolean isFull = true;

        for (var i = 0; i < todolist.length; i++){
            if(todolist[i] == null){
                isFull = false;
                break;
            }
        }

        if(isFull){
            String[] temp = todolist;
            todolist = new String[todolist.length*2];

            for (var i = 0; i < temp.length; i++){
                todolist[i] = temp[i];
            }

        }

        for (var i = 0; i < todolist.length; i++){
            if(todolist[i] == null){
                todolist[i] = todo;
                break;
            }
        }

    }

    public static void deleteTodo (Integer index){

        if(todolist[index] != null){
            todolist[index] = null;
        }

        String[] temp = todolist;
        for (var i = 0; i < temp.length; i++){
            if(todolist[i] == null && i + 1 < todolist.length){
                todolist[i] = temp[i+1];
                todolist[i+1] = null;
            }
        }

    }
}