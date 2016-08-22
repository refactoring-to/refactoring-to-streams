package to.refactoring.streams;

import org.junit.Test;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class ExB_Map {
    final List<String> numbers = asList("2", "3", "5", "7");

    @Test
    public void for_loop() {
        List<Integer> parsed = new ArrayList<>();
        for (String each : numbers) {
            parsed.add(Integer.parseInt(each));
        }

        assertThat(parsed, equalTo(asList(2, 3, 5, 7)));
    }
}
