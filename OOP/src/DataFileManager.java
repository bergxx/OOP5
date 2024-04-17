package familytree;

import java.util.List;

public class DataFileManager implements FamilyTreeFileManager<Human> {

    @Override
    public void saveFamilyTree(String filename, List<Human> family) {
    }

    @Override
    public List<Human> loadFamilyTree(String filename) {
        return null;
    }
}