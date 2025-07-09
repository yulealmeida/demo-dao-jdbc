package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
    private Integer id;
    private String name;

    public Department () {
    }

    public Department (Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public Department setName (String name) {
        this.name = name;
        return this;
    }

    public Integer getId () {
        return id;
    }

    public Department setId (Integer id) {
        this.id = id;
        return this;
    }

    @Override
    public boolean equals (Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode () {
        return Objects.hashCode(id);
    }

    @Override
    public String toString () {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
