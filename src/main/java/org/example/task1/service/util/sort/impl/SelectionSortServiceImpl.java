package org.example.task1.service.util.sort.impl;

import org.example.task1.entity.IntArray;
import org.example.task1.service.util.edit.EditService;
import org.example.task1.service.util.edit.impl.EditServiceImpl;
import org.example.task1.service.util.extremum.ExtremumService;
import org.example.task1.service.util.extremum.impl.ExtremumServiceImpl;
import org.example.task1.service.util.sort.SortService;

public class SelectionSortServiceImpl implements SortService {
  ExtremumService extremumService = new ExtremumServiceImpl();
  EditService editService = new EditServiceImpl();

  @Override
  public void sort(IntArray array) {
    for(int i = 0; i < array.getLength() - 1; i++) {
      int minIndex = extremumService.findIndexOfMin(array, i, array.getLength());
      editService.swap(array, minIndex, i);
    }
  }
}
