package com.example.testattendence;

public class ClassItem {
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    private String className;
    private String subjectName;
    private long cid;

    public ClassItem(long cid, String className, String subjectName) {
        this.className = className;
        this.subjectName = subjectName;
        this.cid = cid;
    }



    public ClassItem(String className, String subjectName){
        this.className=className;
        this.subjectName=subjectName;
    }



    public long getCid() {
        return this.cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
