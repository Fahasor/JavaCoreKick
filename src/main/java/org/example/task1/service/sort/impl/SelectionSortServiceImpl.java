package org.example.task1.service.sort.impl;

import org.example.task1.entity.IntArray;
import org.example.task1.service.edit.SwapService;
import org.example.task1.service.edit.impl.SwapServiceImpl;
import org.example.task1.service.minmax.MinMaxService;
import org.example.task1.service.minmax.impl.MinMaxServiceImpl;
import org.example.task1.service.sort.SortService;

public class SelectionSortServiceImpl implements SortService {
  MinMaxService extremumService = new MinMaxServiceImpl();
  SwapService editService = new SwapServiceImpl();

  @Override
  public void sort(IntArray array) {
    for(int i = 0; i < array.getLength() - 1; i++) {
      int minIndex = extremumService.findIndexOfMin(array, i, array.getLength());
      editService.swap(array, minIndex, i);
    }
  }
}
