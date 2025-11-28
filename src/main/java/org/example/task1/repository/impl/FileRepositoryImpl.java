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
import org.example.task1.serialization.readerwrap.SerializerReaderWrapper;
import org.example.task1.serialization.serializer.intarray.IntArraySerializer;
import org.example.task1.serialization.serializer.intarray.impl.IntArraySerializerImpl;

public class FileRepositoryImpl implements FileRepository {

  private final Path ARRAYS_PATH = Path.of("src/main/resources/arrays.txt");

  private final File file;

  public FileRepositoryImpl() {
    file = ARRAYS_PATH.toFile();
  }

  @Override
  public List<int[]> readAll() throws IOException {
    IntArraySerializer intArraySerializer = new IntArraySerializerImpl();
    List<int[]> list = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      SerializerReaderWrapper wrapper = new SerializerReaderWrapper(reader);
      do {
        try {
          list.add(intArraySerializer.deserialize(wrapper));
        } catch (SerializationFailedException _) {

        }
      } while (wrapper.getLastRead() != -1);
    }

    return list;
  }
}
