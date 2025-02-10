package com.practice.assignments.jdbc.entity;

public class Employee {

    private int employeeId;
    private String employeeName;
    private String employeeEmail;
    private String mobileNo;
    private int deptId;

    Employee(Builder builder) {
        this.employeeId = builder.employeeId;
        this.employeeName = builder.employeeName;
        this.employeeEmail = builder.employeeEmail;
        this.mobileNo = builder.mobileNo;
        this.deptId = builder.deptId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public int getDeptId() {
        return deptId;
    }

    @Override
    public String toString() {
        return String.format("""
                Employee Id: %d; Employee Name: %s; Employee Email: %s; Employee Mobile No: %s; Dept Id: %d
                """, employeeId, employeeName, employeeEmail, mobileNo, deptId);
    }

    public static class Builder {
        private int employeeId;
        private String employeeName;
        private String employeeEmail;
        private String mobileNo;
        private int deptId;

        public Builder employeeId(int employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder employeeName(String employeeName) {
            this.employeeName = employeeName;
            return this;
        }

        public Builder employeeEmail(String employeeEmail) {
            this.employeeEmail = employeeEmail;
            return this;
        }

        public Builder mobileNo(String mobileNo) {
            this.mobileNo = mobileNo;
            return this;
        }

        public Builder deptId(int deptId) {
            this.deptId = deptId;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
