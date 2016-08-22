package to.refactoring.streams;

import org.junit.Test;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static java.util.Arrays.asList;
import static java.util.Locale.ENGLISH;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class ExB_Map {
    List<String> strings = asList("one", "two", "three", "four");

    @Test
    public void for_loop() {
        List<String> louder = new ArrayList<>();

        for (String thing : strings) {
            louder.add(thing.toUpperCase(ENGLISH));
        }

        assertThat(louder, equalTo(asList("ONE", "TWO", "THREE", "FOUR")));
    }
}
