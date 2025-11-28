package org.example.task1.service.metrics.impl;

import org.example.task1.entity.IntArray;
import org.example.task1.service.metrics.MetricsService;

public class MetricsServiceImpl implements MetricsService {

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

  @Override
  public int sum(IntArray array) {
    int sum = 0;

    for (int i = 0; i < array.getLength(); i++) {
      sum += array.getElement(i);
    }

    return sum;
  }
}
