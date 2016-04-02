package edu.iis.mto.bsearch;

import org.junit.Test;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class BinarySearchTest {
    int[] seq;
    SearchResult searchResult;

    @Test
    public void canFindElementInSingleSequence() {
        seq = new int[] {4};
        searchResult = BinarySearch.search(4, seq);

        assertThat(searchResult.isFound(), is(true));
    }

    @Test
    public void cannotFindElementInSingleSequence() {
        seq = new int[] {2};
        searchResult = BinarySearch.search(4, seq);

        assertThat(searchResult.isFound(), is(false));
    }

    @Test
    public void isFirstElementInSequence() {
        seq = new int[] {2, 5, 7};
        searchResult = BinarySearch.search(2, seq);

        assertThat(searchResult.getPosition(), is(1));
    }

    @Test
    public void isLastElementInSequence() {
        seq = new int[] {4, 8, 12, 13, 15, 18};
        searchResult = BinarySearch.search(18, seq);

        assertThat(searchResult.getPosition(), is(seq.length));
    }

    @Test
    public void isMiddleElementInOddSequence() {
        seq = new int[] {4, 8, 12, 16, 20};
        searchResult = BinarySearch.search(12, seq);

        assertThat(searchResult.getPosition(), is(seq.length / 2 + 1));
    }
}
