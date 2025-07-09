package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {
    private String name;
    private Integer id;
    private String email;
    private Double baseSalary;
    private Date birthdate;

    private Department department;

    public Seller () {
    }

    public Seller (String name, Integer id, String email, Double baseSalary, Date birthdate, Department department) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.baseSalary = baseSalary;
        this.birthdate = birthdate;
        this.department = department;
    }

    public String getName () {
        return name;
    }

    public Seller setName (String name) {
        this.name = name;
        return this;
    }

    public Integer getId () {
        return id;
    }

    public Seller setId (Integer id) {
        this.id = id;
        return this;
    }

    public String getEmail () {
        return email;
    }

    public Seller setEmail (String email) {
        this.email = email;
        return this;
    }

    public Double getBaseSalary () {
        return baseSalary;
    }

    public Seller setBaseSalary (Double baseSalary) {
        this.baseSalary = baseSalary;
        return this;
    }

    public Date getBirthdate () {
        return birthdate;
    }

    public Seller setBirthdate (Date birthdate) {
        this.birthdate = birthdate;
        return this;
    }

    public Department getDepartment () {
        return department;
    }

    public Seller setDepartment (Department department) {
        this.department = department;
        return this;
    }

    @Override
    public boolean equals (Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(id, seller.id);
    }

    @Override
    public int hashCode () {
        return Objects.hashCode(id);
    }

    @Override
    public String toString () {
        return "Seller{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", baseSalary=" + baseSalary +
                ", birthdate=" + birthdate +
                ", department=" + department +
                '}';
    }
}
