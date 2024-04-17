package familytree;

public class Presenter<T> {
    private FamilyTree<T> model;
    private FamilyTreeCLI<T> view;

    public Presenter(FamilyTree<T> model, FamilyTreeCLI<T> view) {
        this.model = model;
        this.view = view;
    }

    public void initialize() {
        view.start();
    }

    public void addMember(String name, LocalDate dob, Gender gender, T mother, T father) {
        Human newMember = new Human(name, dob, gender, mother, father);
        model.addMember(newMember);
        view.printMessage("Новый член семьи успешно добавлен.");
    }

    public void deleteMember(String name) {
        boolean deleted = model.deleteMemberByName(name);
        if (deleted) {
            view.printMessage("Член семьи успешно удален.");
        } else {
            view.printMessage("Член семьи с указанным именем не найден.");
        }
    }

    public void printFamily() {
        List<T> family = model.getFamily();
        if (family.isEmpty()) {
            view.printMessage("В семейном древе нет членов.");
        } else {
            view.printFamily(family);
        }
    }
}