package familytree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<T> implements Iterable<T> {
    private List<T> family;

    public FamilyTree() {
        this.family = new ArrayList<>();
    }

    public void addMember(T member) {
        if (member != null) {
            this.family.add(member);
        }
    }

    public List<T> getFamily() {
        return this.family;
    }

    @Override
    public Iterator<T> iterator() {
        return family.iterator();
    }
}