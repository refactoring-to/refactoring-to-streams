package to.refactoring.streams;

import org.junit.Test;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class ExA_ForEach {
    final List<String> things = asList("one", "two", "three", "four");

    final StringWriter text = new StringWriter();
    final PrintWriter printer = new PrintWriter(text);

    @Test
    public void indexed_for_loop() {
        for (int i = 0; i < things.size(); i++) {
            printer.println(things.get(i));
        }

        assertThat(text.toString(), equalTo("one\ntwo\nthree\nfour\n"));
    }
}

