package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description is required")
    @Size(min=1,max=500, message = "Description must be between 1 and 500 characters")

    @ManyToMany(mappedBy="skills")
    private final List<Job> jobs = new ArrayList<>();

    public String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Skill() {

    }
    public List<Job> getJobs() {
        return jobs;
    }
}
