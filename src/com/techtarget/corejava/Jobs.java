package com.targettech.corejava;

public class Jobs {
    private int jobid;
    private String jobtitle;
    private int salary;

    public Jobs(int jobid, String jobtitle, int salary) {
        this.jobid = jobid;
        this.jobtitle = jobtitle;
        this.salary = salary;
    }

    public int getJobid() {
        return jobid;
    }

    public void setJobid(int jobid) {
        this.jobid = jobid;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "jobid=" + jobid +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
