package com.targettech.corejava;

public class Department {
    private String depid;
    private String depname;
    private String Deplocation;

    public Department(String depid, String depname, String deplocation) {
        this.depid = depid;
        this.depname = depname;
        Deplocation = deplocation;
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public String getDeplocation() {
        return Deplocation;
    }

    public void setDeplocation(String deplocation) {
        Deplocation = deplocation;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depid='" + depid + '\'' +
                ", depname='" + depname + '\'' +
                ", Deplocation='" + Deplocation + '\'' +
                '}';
    }
}
