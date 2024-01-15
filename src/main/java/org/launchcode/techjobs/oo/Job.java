package org.launchcode.techjobs.oo;

import java.util.Objects;

import static java.lang.System.lineSeparator;

public class Job {
    private int id;
    private static int nextId = 1;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    private static String empty = "Data not available";

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
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return lineSeparator() +
                "ID:  " + this.id + lineSeparator() +
                "Name:  " + this.name + lineSeparator() +
                "Employer:  " + this.employer + lineSeparator() +
                "Location:  " + this.location + lineSeparator() +
                "Position Type:  " + this.positionType + lineSeparator() +
                "Core Competency:  " + this.coreCompetency + lineSeparator();
//        name == null ? empty : name,
//        employer == null ? empty : employer,
//        location == null ? empty : location,
//        positionType == null ? empty : positionType,
//        coreCompetency == null ? empty : coreCompetency;
        }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
