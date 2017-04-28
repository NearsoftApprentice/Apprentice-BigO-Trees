package org.nearsoft.node;


import java.util.Arrays;

public class HeapImpl implements Heap {

    private int[] heap;


    public HeapImpl(int[] array) {

        if (array == null || array.length < 1) {
            throw new UnsupportedOperationException("");
        }
        heap = buildHeap(array);
    }

    public int getMax() {
        return heap[0];
    }

    public int[] heapSort() {
        return new int[0];
    }


    int getLeftChildIndex(int i) {

        return i == 0 ? 1 : i * 2 + 1;

    }

    int getRightChildIndex(int i) {
        return i == 0 ? 2 : i * 2 + 2;
    }


    private void heapIfY(int[] heap, int i) {

        int leftChildIndex = getLeftChildIndex(i);
        int rightChildIndex = getRightChildIndex(i);
        int currentIndexValue = heap[i];
        int heapSize = heap.length;

        boolean hasLeftChild = leftChildIndex < heapSize;
        boolean hasRightChild = rightChildIndex < heapSize;
        int extremeChildIndex;

        if (!hasLeftChild && !hasRightChild) {
            return;
        }
        int leftChildValue;
        int rightChildValue;

        if (hasRightChild && hasLeftChild) {

            leftChildValue = heap[leftChildIndex];
            rightChildValue = heap[rightChildIndex];
            extremeChildIndex = leftChildValue < rightChildValue ? rightChildIndex : leftChildIndex;

        } else if (hasLeftChild) {
            extremeChildIndex = leftChildIndex;

        } else {
            extremeChildIndex = rightChildIndex;
        }

        if (currentIndexValue < heap[extremeChildIndex]) {
            heap[i] = heap[extremeChildIndex];
            heap[extremeChildIndex] = currentIndexValue;
            heapIfY(heap, extremeChildIndex);
        }


    }

    int calculateHalf(int[] array) {
        int half = array.length / 2;
        return half % 2 != 0 ? ++half : half;

    }

    int[] buildHeap(int[] array) {
        int[] heap = Arrays.copyOf(array, array.length);
        int half = calculateHalf(heap);

        for (int i = half; i >= 0; i--) {
            heapIfY(heap, i);
        }
        return heap;
    }


}
