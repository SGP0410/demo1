package com.example.demo1.pojo;

/**
 * @author 孙国鹏
 * @date 2021/3/19 11:15
 */
public class CostType {
    private int id;
    private int classifyId;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(int classifyId) {
        this.classifyId = classifyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CostType{" +
                "id=" + id +
                ", classifyId=" + classifyId +
                ", name='" + name + '\'' +
                '}';
    }
}
