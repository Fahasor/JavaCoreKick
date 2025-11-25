package org.example.task1.service.sort.impl;

import org.example.task1.entity.IntArray;
import org.example.task1.service.edit.SwapService;
import org.example.task1.service.edit.impl.SwapServiceImpl;
import org.example.task1.service.sort.SortService;

public class BubbleSortServiceImpl implements SortService {
  SwapService editService = new SwapServiceImpl();

  @Override
  public void sort(IntArray array) {
    int rightBorder = array.getLength();
    boolean isModified = false;
    do {
      isModified = false;
      for(int i = 1; i < rightBorder; i++) {
        if(array.getElement(i) < array.getElement(i - 1)) {
          editService.swap(array, i - 1, i);
          isModified = true;
        }
      }
    } while (isModified);
  }
}
