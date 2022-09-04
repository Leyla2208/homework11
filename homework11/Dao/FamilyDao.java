package homework11.Dao;

import homework11.App.Family;

import java.util.List;
public interface FamilyDao {
    List<Family> getAllFamilies();
    FamilyDao getFamilyByIndex(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(FamilyDao family);
    void saveFamily(FamilyDao family);

    boolean deleteFamily(Family family);

    void saveFamily(Family family);
}
