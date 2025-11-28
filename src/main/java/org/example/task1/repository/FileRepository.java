package org.example.task1.repository;

import java.io.IOException;
import java.util.List;

public interface FileRepository {
  List<int[]> readAll() throws IOException;
}
