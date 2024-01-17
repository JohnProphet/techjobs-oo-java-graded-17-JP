package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job job1 = new Job("Web Developer", new Employer("LaunchCode"), new Location("StL"), new PositionType("Back-end developer"), new CoreCompetency("Java"));
        Job job2 = new Job("Web Graphics", new Employer("CodeLaunch"), new Location("LtS"), new PositionType("Front-end developer"), new CoreCompetency("Java"));
        assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Web Graphics", new Employer("CodeLaunch"), new Location("LtS"), new PositionType("Front-end developer"), new CoreCompetency("Java"));
        Job job2 = new Job("Web Graphics", new Employer("CodeLaunch"), new Location("LtS"), new PositionType("Front-end developer"), new CoreCompetency("Java"));
        assertEquals(job1.toString(), job2.toString());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("TestJob", new Employer("LaunchCode"), new Location("StL"), new PositionType("TestPosition"), new CoreCompetency("test"));
        assertTrue(job1.toString().startsWith(lineSeparator()));
        assertTrue(job1.toString().endsWith(lineSeparator()));
    }


    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("TestJob", new Employer("LaunchCode"), new Location("StL"), new PositionType("TestPosition"), new CoreCompetency("test"));
        assertEquals(job1.getName(), "TestJob");
        assertEquals(job1.getEmployer().toString(), "LaunchCode");
        assertEquals(job1.getLocation().toString(), "StL");
        assertEquals(job1.getPositionType().toString(), "TestPosition");
        assertEquals(job1.getCoreCompetency().toString(), "test");
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job1 = new Job("Web Developer", new Employer(""), new Location("StL"), new PositionType(""), new CoreCompetency("test"));
        assertEquals(job1.getName(), "Web Developer");
        assertEquals(job1.getEmployer().toString(), "Data not available");
        assertEquals(job1.getLocation().toString(), "StL");
        assertEquals(job1.getPositionType().toString(), "Data not available");
        assertEquals(job1.getCoreCompetency().toString(), "test");
    }


}