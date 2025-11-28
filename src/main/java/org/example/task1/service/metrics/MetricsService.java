package org.example.task1.service.metrics;

import org.example.task1.entity.IntArray;

public interface MetricsService {
  int findIndexOfMin(IntArray array, int leftBorder, int rightBorder);
  int findIndexOfMax(IntArray array, int leftBorder, int rightBorder);
  int sum(IntArray array);
}
