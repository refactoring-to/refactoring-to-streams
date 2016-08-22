package to.refactoring.streams;

import org.junit.Test;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;


public class ExF_Find {

    public static @Nullable String find(List<String> strings, Predicate<? super String> criteria) {
        for (String string : strings) {
            if (criteria.test(string)) {
                return string;
            }
        }
        return null;
    }

    @Test
    public void finds_item_when_first_in_list() {
        assertThat(find(asList("one", "two", "three"), s -> s.startsWith("o")), equalTo("one"));
    }

    @Test
    public void finds_first_item_when_many_in_list() {
        assertThat(find(asList("one", "two", "three"), s -> s.startsWith("t")), equalTo("two"));
    }

    @Test
    public void returns_null_if_nothing_found() {
        assertThat(find(asList("one", "two", "three"), s -> s.startsWith("f")), equalTo(null));
    }

    @Test
    public void returns_null_on_empty_list() {
        assertThat(find(emptyList(), s -> s.startsWith("f")), equalTo(null));
    }

    @Test
    public void doesnt_evaluate_predicate_after_match_found() {
        assertThat(find(asList("one", null), s -> s.startsWith("o")), equalTo("one"));
    }
}
