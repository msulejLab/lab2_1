package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    int[] seq;
    SearchResult searchResult;

    @Test
    public void canFindElementInSingleSequence() {
        seq = new int[] {4};
        searchResult = BinarySearch.search(4, seq);

        assertTrue(searchResult.isFound());
    }

    @Test
    public void cannotFindElementInSingleSequence() {
        seq = new int[] {2};
        searchResult = BinarySearch.search(4, seq);

        assertFalse(searchResult.isFound());
    }

    @Test
    public void isFirstElementInSequence() {
        seq = new int[] {2, 5, 7};
        searchResult = BinarySearch.search(2, seq);

        assertEquals(1, searchResult.getPosition());
    }

    @Test
    public void isLastElementInSequence() {
        seq = new int[] {4, 8, 12, 13, 15, 18};
        searchResult = BinarySearch.search(18, seq);

        assertEquals(seq.length, searchResult.getPosition());
    }
}
