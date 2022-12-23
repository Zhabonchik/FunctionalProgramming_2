import java.util.*;
public class Company {
    private String name;
    private ArrayList <Department> departmentList;

    Company() {
        this.name = "";
        this.departmentList = new ArrayList<>();
    }

    Company(String name, ArrayList <Department> departmentList) {
        this.name = name;
        this.departmentList = departmentList;
    }

    public String getName() {
        return name;
    }

    public ArrayList <Department> getDepartmentList() {
        return departmentList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmentList(ArrayList<Department> list) {
        this.departmentList = list;
    }

    @Override
    /*public String toString() {
        String answer = new String();
        answer += "{ " + "name: " + this.name + ";" + "departments: " + departmentList.toString() + " }";
        return answer;
    }*/
    public String toString() {
        return name + departmentList;
    }
}
