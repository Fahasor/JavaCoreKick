package org.example.task1.service.sort.impl;

import org.example.task1.entity.IntArray;
import org.example.task1.service.edit.SwapService;
import org.example.task1.service.edit.impl.SwapServiceImpl;
import org.example.task1.service.metrics.MetricsService;
import org.example.task1.service.metrics.impl.MetricsServiceImpl;
import org.example.task1.service.sort.SortService;

public class SelectionSortServiceImpl implements SortService {
  MetricsService metricsService = new MetricsServiceImpl();
  SwapService editService = new SwapServiceImpl();

  @Override
  public void sort(IntArray array) {
    for(int i = 0; i < array.getLength() - 1; i++) {
      int minIndex = metricsService.findIndexOfMin(array, i, array.getLength());
      editService.swap(array, minIndex, i);
    }
  }
}
