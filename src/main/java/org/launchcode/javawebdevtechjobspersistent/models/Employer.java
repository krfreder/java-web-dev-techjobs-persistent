package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Please enter a location.")
    @Size(min = 2, max = 250, message = "Must be between 2 and 250 characters.")
    private String location;

    @OneToMany
//    if something brakes, reconsider the code below first, originally used "employer"
    @JoinColumn
    private final List<Job> jobs = new ArrayList<>();

    public Employer(String location) {
        this.location = location;
    }

    public Employer() {}

    public String getLocation() { return location; }

    public List<Job> getJobs() { return jobs; }

    public void setLocation(String location) { this.location = location; }


}
