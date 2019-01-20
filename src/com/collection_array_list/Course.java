package com.collection_array_list;

/**
 * 课程类：
 */

public class Course {
    private String id;
    private String name;
    public Course(String id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(!(obj instanceof Course)) {
            return false;
        }
        Course course = (Course) obj;
        if(this.name == null) {
            if(course.getName() == null) {
                return true;
            }
            return false;
        } else  {
            if(this.name.equals(course.name)) {
                return true;
            }
            return false;
        }
    }
}
