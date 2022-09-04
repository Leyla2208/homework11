package homework11.Dao;
import homework11.App.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao{
    private List<Family> families;

    public CollectionFamilyDao() {
        this.families = new ArrayList<>();
    }

    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public FamilyDao getFamilyByIndex(int index) {
        return (FamilyDao) families.get(index);
    }

    @Override
    public boolean deleteFamily(int index) {
        return families.remove(index) != null;
    }

    @Override
    public boolean deleteFamily(FamilyDao family) {
        return false;
    }

    @Override
    public void saveFamily(FamilyDao family) {

    }

    @Override
    public boolean deleteFamily(Family family) {
        return families.remove(family);
    }

    @Override
    public void saveFamily(Family family) {
        if(!families.contains(family)) families.add(family);
    }
}
