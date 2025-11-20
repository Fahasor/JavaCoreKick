package org.example.task1.repository.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import org.example.task1.entity.IntArray;
import org.example.task1.repository.FileRepository;

public class FileRepositoryImpl implements FileRepository {


  @Override
  public List<IntArray> getIntArrays(Path path) throws IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {

    }
  }
}
