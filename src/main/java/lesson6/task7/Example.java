package lesson6.task7;

/*
7. In the Solution class, correct a couple of equals / hashCode methods in accordance with the rules for implementing these methods (check details with your favorite search engine).
Both the first and last strings should participate in the comparison using the equals method and the hashcode calculation.

"1) The result should be true;
2) Do not change the main method;"
 */

import java.util.HashSet;
import java.util.Set;

public class Example {
    private final String first, last;

    public Example(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Example ex = (Example) o;
        return (first == ex.first || (first != null &&first.equals(ex.getFirst()))) && (last == ex.last
                || (last != null && last .equals(ex.getLast())
        ));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((first == null) ? 0 : first.hashCode());
        result = prime * result; result = prime * result + ((last == null) ? 0 : last.hashCode());
        return result;
    }

    public static void main(String[] args) {
        Set<Example> s = new HashSet<>();
        s.add(new Example("Donald", "Duck"));
        System.out.println(s.contains(new Example("Donald", "Duck")));
    }
}



