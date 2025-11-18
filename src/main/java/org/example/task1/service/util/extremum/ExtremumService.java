package org.example.task1.service.util.extremum;

import org.example.task1.entity.IntArray;

public interface ExtremumService {
  int findIndexOfMin(IntArray array, int leftBorder, int rightBorder);
  int findIndexOfMax(IntArray array, int leftBorder, int rightBorder);
}
