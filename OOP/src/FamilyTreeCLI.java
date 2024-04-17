package familytree;

import java.util.Scanner;

public class FamilyTreeCLI<T> {
    private FamilyTree<T> tree;
    private Scanner scanner;

    public FamilyTreeCLI(FamilyTree<T> tree) {
        this.tree = tree;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Добро пожаловать в программу родословного древа!");

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить члена семьи");
            System.out.println("2. Удалить члена семьи");
            System.out.println("3. Поиск члена семьи");
            System.out.println("4. Вывести всех членов семьи");
            System.out.println("5. Вывести родословное древо");
            System.out.println("6. Сохранить дерево в файл");
            System.out.println("7. Загрузить дерево из файла");
            System.out.println("8. Выйти из программы");

            System.out.print("Введите номер команды: ");
            int choice = getIntInput();

            switch (choice) {
                case 1:
                    System.out.println("Вы выбрали: Добавить члена семьи");
                    addMember();
                    break;
                case 2:
                    System.out.println("Вы выбрали: Удалить члена семьи");
                    deleteMember();
                    break;
                case 3:
                    System.out.println("Вы выбрали: Поиск члена семьи");
                    findMember();
                    break;
                case 4:
                    System.out.println("Вы выбрали: Вывести всех членов семьи");
                    printFamily();
                    break;
                case 5:
                    System.out.println("Вы выбрали: Вывести родословное древо");
                    printFamilyTree();
                    break;
                case 6:
                    System.out.println("Вы выбрали: Сохранить дерево в файл");
                    saveToFile();
                    break;
                case 7:
                    System.out.println("Вы выбрали: Загрузить дерево из файла");
                    loadFromFile();
                    break;
                case 8:
                    System.out.println("До свидания!");
                    return;
                default:
                    System.out.println("Некорректный ввод. Попробуйте снова.");
                    break;
            }
        }
    }

    private void addMember() {
        System.out.println("Введите имя нового члена семьи:");
        String name = getStringInput();
    }

    private void deleteMember() {
        System.out.println("Введите имя члена семьи для удаления:");
        String name = getStringInput();
    }

    private void findMember() {
        System.out.println("Введите имя члена семьи для поиска:");
        String name = getStringInput();
    }

    private void printFamily() {
        System.out.println("Список всех членов семьи:");
        int index = 1;
        for (T member : tree.getFamily()) {
            System.out.println(index + ". " + member);
            index++;
        }
    }

    private void printFamilyTree() {
    }

    private void saveToFile() {
        System.out.println("Введите имя файла для сохранения:");
        String filename = getStringInput();
    }

    private void loadFromFile() {
        System.out.println("Введите имя файла для загрузки:");
        String filename = getStringInput();
    }

    private int getIntInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("Некорректный ввод. Введите целое число.");
            scanner.next(); 
        }
        int choice = scanner.nextInt();
        scanner.nextLine(); 
        return choice;
    }

    private String getStringInput() {
        return scanner.nextLine().trim();
    }
}
