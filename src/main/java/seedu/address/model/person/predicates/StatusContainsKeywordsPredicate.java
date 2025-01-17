package seedu.address.model.person.predicates;

import java.util.function.Predicate;

import seedu.address.commons.util.StringUtil;
import seedu.address.model.person.Person;

/**
 * Tests that a {@code Person}'s {@code Status} matches any of the keywords given.
 */
public class StatusContainsKeywordsPredicate implements Predicate<Person> {
    private final String keyword;

    public StatusContainsKeywordsPredicate(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public boolean test(Person person) {
        return StringUtil.containsWordIgnoreCase(person.getStatus().toString(), keyword);
    }

}
