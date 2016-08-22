package to.refactoring.streams;

import org.junit.Test;

import java.util.*;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.groupingBy;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ExE_Group {
    List<String> numbers = asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");

    Map<Integer, List<String>> expectedGroups = new HashMap<>();
    {
        expectedGroups.put(3, asList("one", "two", "six", "ten"));
        expectedGroups.put(4, asList("four", "five", "nine"));
        expectedGroups.put(5, asList("three", "seven", "eight"));
    }

    @Test
    public void for_loop() {
        Map<Integer, List<String>> groups = new HashMap<>();

        for (String number : numbers) {
            int length = number.length();

            List<String> group;
            if (groups.containsKey(length)) {
                group = groups.get(length);
            }
            else {
                group = new ArrayList<>();
                groups.put(length, group);
            }
            group.add(number);
        }

        assertThat(groups, equalTo(expectedGroups));
    }
}
