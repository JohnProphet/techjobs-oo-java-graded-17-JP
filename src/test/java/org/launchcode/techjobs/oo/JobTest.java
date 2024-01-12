package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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
        assertEquals(job1, job2);
    }


}
