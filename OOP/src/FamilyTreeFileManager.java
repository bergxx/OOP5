package familytree;

import java.util.List;

public interface FamilyTreeFileManager<T> {
    void saveFamilyTree(String filename, List<T> family);
    List<T> loadFamilyTree(String filename);
}