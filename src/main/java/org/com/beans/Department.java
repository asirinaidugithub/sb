package org.com.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Department {
    private String name;
    private String location;
    private String contact;
    private List<Student> students;

    /**
     *
     * @param name
     * @param location
     * @param contact
     * @param students
     */
    public Department(String name, String location, String contact, List<Student> students) {
        this.name = name;
        this.location = location;
        this.contact = contact;
        this.students = students;
    }
}
