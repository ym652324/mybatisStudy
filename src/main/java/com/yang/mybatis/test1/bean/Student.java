package com.yang.mybatis.test1.bean;

import java.sql.Timestamp;
import java.util.Date;

public class Student {
    private Integer studentId;
    private String major;
    private Integer classId;
    private String StudentName;
    private String sex;
    private Date birthday;
    private Timestamp date;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", major='" + major + '\'' +
                ", classId=" + classId +
                ", StudentName='" + StudentName + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", date=" + date +
                '}';
    }

    public Student() {
    }

    public Student(Integer studentId, String major, Integer classId, String studentName, String sex, Date birthday, Timestamp date) {
        this.studentId = studentId;
        this.major = major;
        this.classId = classId;
        StudentName = studentName;
        this.sex = sex;
        this.birthday = birthday;
        this.date = date;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
