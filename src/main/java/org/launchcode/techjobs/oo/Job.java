package org.launchcode.techjobs.oo;

import java.util.Objects;

import static java.lang.System.lineSeparator;

public class Job {
    private final int id;
    private static int nextId = 1;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    private static final String empty = "Data not available";

    // Initialize a unique ID and a second to initialize the other five
    //  fields. The second constructor calls the first in order to
    //  initialize the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
//        nextId++;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {

        if (employer.getValue() == "") {
            this.employer.setValue(empty);
        }
        if (location.getValue() == "") {
            this.location.setValue(empty);
        }
        if (positionType.getValue() == "") {
            this.positionType.setValue(empty);
        }
        if (coreCompetency.getValue() == "") {
            this.coreCompetency.setValue(empty);
        }

        return lineSeparator() +
                "ID: " + this.id + lineSeparator() +
                "Name: " + this.name + lineSeparator() +
                "Employer: " + this.employer + lineSeparator() +
                "Location: " + this.location + lineSeparator() +
                "Position Type: " + this.positionType + lineSeparator() +
                "Core Competency: " + this.coreCompetency + lineSeparator();
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        if (name.isEmpty()) {
            return empty;
        } else {
            return name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        if (employer.getValue().isEmpty()) {
            employer.setValue("Data not available");
        }
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        if (location.getValue().isEmpty()) {
            location.setValue("Data not available");
        }
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        if (positionType.getValue().isEmpty()) {
            positionType.setValue("Data not available");
        }
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        if (coreCompetency.getValue().isEmpty()) {
            coreCompetency.setValue("Data not available");
        }
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}

