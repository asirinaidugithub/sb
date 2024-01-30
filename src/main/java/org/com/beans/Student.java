package org.com.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {
    private String id;
    private String name;
    private Integer marks;

    /**
     * @param id
     * @param name
     */
    public Student(String id, String name,Integer marks) {
        this.name = name;
        this.id = id;
        this.marks=marks;
    }
}
