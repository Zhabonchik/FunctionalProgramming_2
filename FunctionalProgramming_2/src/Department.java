import java.sql.Struct;
import java.util.*;
class Department {
    private String name;
    private ArrayList <String> involvedDepartments;
    private ArrayList <Manufacture> manufacturesList;



    Department() {
        name = "";
        involvedDepartments = new ArrayList<>();
        manufacturesList = new ArrayList<>();
    }

    Department(String name, ArrayList<String> involvedDepartments,
               ArrayList<Manufacture> manufacturesList) {
        this.name = name;
        this.involvedDepartments = involvedDepartments;
        this.manufacturesList = manufacturesList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInvolvedDepartments(ArrayList<String> involvedDepartments) {
        this.involvedDepartments = involvedDepartments;
    }

    public void setManufacturesList(ArrayList<Manufacture> manufacturesList) {
        this.manufacturesList = manufacturesList;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getInvolvedDepartments() {
        return involvedDepartments;
    }

    public ArrayList<Manufacture> getManufacturesList() {
        return manufacturesList;
    }

    public ArrayList<DepartmentAndManufacture> getDepartmentsAndManufacture() {
        ArrayList<DepartmentAndManufacture> list = new ArrayList<>();
        for (Manufacture m : manufacturesList) {
            list.add(new DepartmentAndManufacture(this, m.getName()));
        }
        return list;
    }

    @Override
    public String toString() {
        return name + involvedDepartments + manufacturesList;
    }
}


