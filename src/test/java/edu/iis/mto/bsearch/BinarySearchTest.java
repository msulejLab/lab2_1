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
    public void isMiddleElementInOddSequence() {
        seq = new int[] {4, 8, 12, 16, 20};
        searchResult = BinarySearch.search(12, seq);

        assertThat(searchResult.getPosition(), is(seq.length / 2 + 1));
    }

    @Test
    public void cannotFindElementInEmptySequence() {
        seq = new int[] {};
        searchResult = BinarySearch.search(5, seq);

        assertThat(searchResult.isFound(), is(false));
    }

    @Test
    public void cannotFindElementInDisorderedSequence() {
        seq = new int[] {9, 4, 2, 1, 0};
        searchResult = BinarySearch.search(1, seq);

        assertThat(searchResult.isFound(), is(false));
    }

    @Test
    public void isFirstElementInOddSequence() {
        seq = new int[] {1, 2, 3, 4, 5, 6, 7};
        searchResult = BinarySearch.search(1, seq);

        assertThat(searchResult.getPosition(), is(1));
    }

    @Test
    public void isFirstElementInEvenSequence() {
        seq = new int[] {1, 2, 3, 4, 5, 6};
        searchResult = BinarySearch.search(1, seq);

        assertThat(searchResult.getPosition(), is(1));
    }

    @Test
    public void isLastElementInOddSequence() {
        seq = new int[] {1, 2, 3, 4, 5, 6, 7};
        searchResult = BinarySearch.search(7, seq);

        assertThat(searchResult.getPosition(), is(7));
    }

    @Test
    public void isLastElementInEvenSequence() {
        seq = new int[] {1, 2, 3, 4, 5, 6};
        searchResult = BinarySearch.search(6, seq);

        assertThat(searchResult.getPosition(), is(6));
    }
}
