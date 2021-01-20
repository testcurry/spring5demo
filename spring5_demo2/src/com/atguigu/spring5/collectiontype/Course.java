package com.atguigu.spring5.collectiontype;/**
 * @Author Curry
 * @Create 2021-01-5:02
 */

/**
 *@Description todo
 *@ClassName Course
 *@Author admin
 *@Date 2021/1/3 5:02
 *@Version 1.0
 */
public class Course {
    private String courseName;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
}
