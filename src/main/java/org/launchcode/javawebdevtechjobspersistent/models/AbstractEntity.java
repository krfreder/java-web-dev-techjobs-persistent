package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.*;
import java.util.Objects;

//Did you hear the joke about a wandering nun? She was a roman catholic.

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue
    private int id;

//    validation: cannot leave blank
    @NotBlank(message = "Please enter a name.")
    //    reasonable limitations on size of string
    @Size(min = 2, max = 250, message = "Must be between 2 and 250 characters.")
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity that = (AbstractEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}