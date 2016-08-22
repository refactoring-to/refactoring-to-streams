package to.refactoring.streams;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static java.util.Arrays.asList;
import static java.util.Locale.ENGLISH;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class ExC_Collect {
    List<String> strings = asList("one", "two", "three", "four");

    @Test
    public void stream_map_with_method_reference() {
        List<String> louder = new ArrayList<>();

        strings.stream().map(String::toUpperCase)
            .forEach(louder::add);

        assertThat(louder, equalTo(asList("ONE", "TWO", "THREE", "FOUR")));
    }

    @Test
    public void for_loop() {
        List<String> louder = new ArrayList<>();

        for (String thing : strings) {
            louder.add(thing.toUpperCase(ENGLISH));
        }

        assertThat(louder, equalTo(asList("ONE", "TWO", "THREE", "FOUR")));
    }
}
