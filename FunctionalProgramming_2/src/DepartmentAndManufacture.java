class DepartmentAndManufacture {
    public Department department;
    public String manufacture;

    public DepartmentAndManufacture(Department department, String manufacture) {
        this.department = department;
        this.manufacture = manufacture;
    }
    public String getManufacture() {
        return manufacture;
    }

    public Department getDepartment() {
        return department;
    }
}
