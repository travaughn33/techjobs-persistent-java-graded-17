package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required")
    @Size(min=1,max=80, message = "Location must be between 1 and 80 characters")
    public String location;

    @OneToMany
    @JoinColumn (name = "employer_id")
    private final List<Job> jobs = new ArrayList<>();

    public Employer() {}

    public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public List<Job> getJobs() {
        return jobs;
    }
}
