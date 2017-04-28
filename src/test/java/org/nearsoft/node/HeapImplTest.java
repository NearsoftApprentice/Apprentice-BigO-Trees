package org.nearsoft.node;

import org.junit.Test;

import java.util.Arrays;

public class HeapImplTest {

    @Test
    public void calculateHalfTest() {
        int[] array = new int[]{33, 31, 19, 27, 42, 35, 10, 26, 14, 44};
        HeapImpl heap = new HeapImpl(array);
        Arrays.stream(heap.getHeap()).forEach(e -> {
            System.out.print(e + " ");
        });
    }

}