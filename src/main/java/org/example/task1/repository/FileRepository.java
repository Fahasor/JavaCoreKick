package org.example.task1.repository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import org.example.task1.entity.IntArray;

public interface FileRepository {
  List<IntArray> getIntArrays(Path path) throws IOException;
}
