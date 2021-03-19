package com.example.demo1.pojo;

/**
 * @author 孙国鹏
 * @date 2021/3/19 11:14
 */
public class Group {
    private int id;
    private   int typeName;
    private   String name;

    public Group() {
    }

    public Group(int typeName, String name) {
        this.typeName = typeName;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTypeName() {
        return typeName;
    }

    public void setTypeName(int typeName) {
        this.typeName = typeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", typeName=" + typeName +
                ", name='" + name + '\'' +
                '}';
    }
}
