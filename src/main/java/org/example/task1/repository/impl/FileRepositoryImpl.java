package org.example.task1.repository.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.example.task1.entity.IntArray;
import org.example.task1.exception.SerializationFailedException;
import org.example.task1.repository.FileRepository;
import org.example.task1.serialization.intarray.IntArraySerializer;
import org.example.task1.serialization.intarray.impl.IntArraySerializerImpl;

public class FileRepositoryImpl implements FileRepository {

  private File file;

  public void FileRepository(Path path) {
    file = path.toFile();
  }

  @Override
  public List<IntArray> readIntArrays() throws IOException {
    IntArraySerializer intArraySerializer = new IntArraySerializerImpl();
    List<IntArray> list = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      try {
        list.add(intArraySerializer.deserialize(reader));
      } catch (SerializationFailedException exception) {

      }
    }

    return
  }
}
