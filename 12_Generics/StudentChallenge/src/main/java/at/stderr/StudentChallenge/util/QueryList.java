package at.stderr.StudentChallenge.util;

import at.stderr.StudentChallenge.module.Student;

import javax.management.Query;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class QueryList<T extends Student & QueryItem> extends ArrayList<T> {

    public QueryList() {
    }

    public QueryList(Collection<? extends T> c) {
        super(c);
    }

    public static <T extends Student & QueryItem> QueryList<T> getMatches(QueryList<T> items, String field, String value) {
       List<T> matches = new ArrayList<>();

        for ( var item : items ) {
            if (item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }
    public QueryList<T> getMatches(String field, String value) {
        QueryList<T> matches = new QueryList<>();

        for ( var item : this ) {
            if (item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }
}
