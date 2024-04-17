package familytree;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Human father = new Human("Сергей", LocalDate.of(1975, 6, 20), Gender.Male, null, null);
        Human mother = new Human("Елена", LocalDate.of(1980, 9, 12), Gender.Female, null, null);
        Human child1 = new Human("Максим", LocalDate.of(2005, 1, 14), Gender.Male, mother, father);
        Human child2 = new Human("Егор", LocalDate.of(2008, 8, 10), Gender.Male, mother, father);
        Human child3 = new Human("София", LocalDate.of(2012, 11, 5), Gender.Female, mother, father);

        FamilyTree<Human> family = new FamilyTree<>();
        family.addMember(father);
        family.addMember(mother);
        family.addMember(child1);
        family.addMember(child2);
        family.addMember(child3);

        FamilyTreeCLI<Human> view = new FamilyTreeCLI<>(family);
        Presenter<Human> presenter = new Presenter<>(family, view);

        presenter.initialize();
    }
}