package com.example.demo1.pojo;

/**
 * @author 孙国鹏
 * @date 2021/3/17 8:55
 */
public class NewsCategory {
    private  int id;
    private String pressCategory;
    private String categoryName;
    private int dictSort;

    public int getDictSort() {
        return dictSort;
    }

    public void setDictSort(int dictSort) {
        this.dictSort = dictSort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPressCategory() {
        return pressCategory;
    }

    public void setPressCategory(String pressCategory) {
        this.pressCategory = pressCategory;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "NewsCategory{" +
                "id=" + id +
                ", pressCategory='" + pressCategory + '\'' +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
