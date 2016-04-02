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
}
