package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;


import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

@Test
public void testSettingJobId(){
    Job testJob = new Job("Data Scientist",new Employer("Tesla"),new Location("Alaska"), new PositionType("Entry Level"),new CoreCompetency("Javascript"));
    Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertNotEquals(testJob.getId(),job1.getId());
}
@Test
public void testJobConstructorSetsAllFields(){
    Job productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals("Product tester", productTester.getName());
    assertTrue(productTester.getEmployer().getValue() instanceof String);
    assertTrue(productTester.getLocation().getValue() instanceof String);
    assertTrue(productTester.getPositionType().getValue() instanceof String);
    assertTrue(productTester.getCoreCompetency().getValue() instanceof String);
}


@Test
    public void testJobsForEquality(){
    Job testJobA = new Job("Data Scientist",new Employer("Tesla"),new Location("Alaska"), new PositionType("Entry Level"),new CoreCompetency("Javascript"));
    Job testJobB = new Job("Data Scientist",new Employer("Tesla"),new Location("Alaska"), new PositionType("Entry Level"),new CoreCompetency("Javascript"));
    assertFalse(testJobA.equals(testJobB));
}
}
