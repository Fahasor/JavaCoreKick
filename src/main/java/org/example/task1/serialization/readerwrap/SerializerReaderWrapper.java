package org.example.task1.serialization.readerwrap;

import java.io.IOException;
import java.io.Reader;

public class SerializerReaderWrapper {
  Reader reader;
  private int lastRead;

  public int getLastRead() {
    return lastRead;
  }

  public SerializerReaderWrapper(Reader reader) {
    this.reader = reader;
  }

  public void read() throws IOException {
    lastRead = reader.read();
  }
}
