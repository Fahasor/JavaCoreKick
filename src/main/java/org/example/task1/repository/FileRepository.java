package org.example.task1.repository;

import java.io.IOException;
import java.util.List;
import org.example.task1.entity.IntArray;

public interface FileRepository {
  List<IntArray> readIntArrays() throws IOException;
}
