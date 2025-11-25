package org.example.task1.service.minmax;

import org.example.task1.entity.IntArray;

public interface MinMaxService {
  int findIndexOfMin(IntArray array, int leftBorder, int rightBorder);
  int findIndexOfMax(IntArray array, int leftBorder, int rightBorder);
}
