package com.ubs.opsit.interviews;

import org.junit.Test;

import static com.ubs.opsit.interviews.support.BehaviouralTestEmbedder.aBehaviouralTestRunner;

/**
 * Acceptance test class that uses the JBehave (Gerkin) syntax for writing stories.  You need to
 * edit this class to complete the exercise.
 */
public class BerlinClockFixture {

    @Test
    public void berlinClockAcceptanceTests() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("berlin-clock.story")
                .run();
    }


    @Test
    public void berlinClockAcceptanceTestsEx1() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("Example1.story")
                .run();
    }


    @Test
    public void berlinClockAcceptanceTestsEx2() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("Example2.story")
                .run();
    }


    @Test
    public void berlinClockAcceptanceTestsEx3() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("Example3.story")
                .run();
    }


    @Test
    public void berlinClockAcceptanceTestsEx4() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("Example4.story")
                .run();
    }
}
