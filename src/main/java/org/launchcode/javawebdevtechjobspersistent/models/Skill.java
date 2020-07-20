package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    @NotEmpty(message = "Please add a description of the skill between 2 and 250 characters.")
    @Size(min = 2, max = 250, message = "Please add a description of the skill between 2 and 250 characters")
    private String description;

    public Skill(String description,List<Job> jobs) {
        this.description = description;
        this.jobs = jobs;
    }

    public Skill() {}

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public List<Job> getJobs() { return jobs; }

    public void setJobs(List<Job> jobs) { this.jobs = jobs; }
}