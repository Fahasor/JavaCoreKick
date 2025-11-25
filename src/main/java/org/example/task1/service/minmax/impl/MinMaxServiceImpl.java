package org.example.task1.service.minmax.impl;

import org.example.task1.entity.IntArray;
import org.example.task1.service.minmax.MinMaxService;

public class MinMaxServiceImpl implements MinMaxService {

  @Override
  public int findIndexOfMin(IntArray array, int leftBorder, int rightBorder) {
    int min = array.getElement(leftBorder);
    for (int i = leftBorder + 1; i < rightBorder; i++) {
      int element = array.getElement(i);
      min = Integer.min(min, element);
    }
    return min;
  }

  @Override
  public int findIndexOfMax(IntArray array, int leftBorder, int rightBorder) {
    int max = array.getElement(leftBorder);
    for (int i = leftBorder + 1; i < rightBorder; i++) {
      int element = array.getElement(i);
      max = Integer.max(max, element);
    }
    return max;
  }
}
