package to.refactoring.streams;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class ExD_Collect {
    List<String> strings = asList("one", "two", "three");

    @Test
    public void test() {
        List<String> collected = new ArrayList<>();

        for (String thing : strings) {
            collected.add(thing);
        }

        assertThat(collected, equalTo(asList("one", "two", "three")));
    }
}
