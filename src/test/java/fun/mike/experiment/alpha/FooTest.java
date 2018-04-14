package fun.mike.experiment.alpha;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FooTest {
    @Test
    public void plusTwo() {
        assertEquals(4, Foo.plusTwo(2));
    }
}
