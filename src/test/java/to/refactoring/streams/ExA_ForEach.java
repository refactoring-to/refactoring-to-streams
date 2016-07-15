package to.refactoring.streams;

import org.junit.Test;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class ExA_ForEach {
    List<String> things = asList("one", "two", "three", "four");

    @Test
    public void indexed_for_loop() {
        StringPrinter joined = new StringPrinter();

        for (String s : things) {
            joined.println(s);
        }

        assertThat(joined.toString(), equalTo("one\ntwo\nthree\nfour\n"));
    }

    static class StringPrinter extends PrintWriter {
        public StringPrinter() {
            super(new StringWriter());
        }

        @Override
        public String toString() {
            return out.toString();
        }
    }
}

