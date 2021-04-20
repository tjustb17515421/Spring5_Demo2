package com.atguigu.sping5.Collectiontype;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    //1 数组类型属性
    private String[] courses;
    //2 list 集合类型属性
    private List<String> list;
    //3 map 集合类型属性
    private Map<String,String> maps;
    //4 set 集合类型属性
    private Set<String> sets;

    //5 list 集合类型属性,存入的是对象
    private List<Course> courseList;
    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }


    public void setSets(Set<String> sets) {
        this.sets = sets;
    }
    public void setCourses(String[] courses) {
        this.courses = courses;
    }
    public void setList(List<String> list) {
        this.list = list;
    }
    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }
    public void show()
    {
        System.out.println(courses);
        System.out.println(list.toString());
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(courseList);
    }
}
