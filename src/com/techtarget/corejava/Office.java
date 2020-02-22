package com.targettech.corejava;

public class Office {
    private String address;
    private String name;
    private String phone;
    private Employee emp;
    private Department dep;
    private Jobs job;
    private Location loc;

    public Office(String address, String name, String phone, Employee e,Department d,Jobs j, Location l) {
        this.address = address;
        this.name = name;
        this.phone = phone;
        this.emp=e;
        this.dep=d;
        this.job=j;
        this.loc=l;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }

    public Jobs getJob() {
        return job;
    }

    public void setJob(Jobs job) {
        this.job = job;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Office{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", emp=" + emp +
                ", dep=" + dep +
                ", job=" + job +
                ", loc=" + loc +
                '}';
    }

    public static void main(String[] args) {
        Employee e1=new Employee(1, "Ravi","clerk");
        Department d1=new Department("1001","sales","Aldie");
        Jobs j1=new Jobs(20,"section manager",20000);
        Location l1=new Location(10,"VA","USA");
        Office officeobj=new Office("123 mastery pl","northrop","634823642873",e1,d1,j1,l1);
        System.out.println(officeobj.toString());
    }
}
