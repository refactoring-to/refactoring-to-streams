package to.refactoring.streams;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class ExD_Filter {
    List<Integer> numbers = asList(1, 2, 3, 4, 5, 6, 7, 8);

    @Test
    public void for_loop_with_conditional() {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int x : numbers) {
            if (x % 2 == 0) {
                evenNumbers.add(x);
            }
        }

        assertThat(evenNumbers, equalTo(asList(2, 4, 6, 8)));
    }
}
