package org.example.task1.serialization.serializer.intserializer.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;
import org.example.task1.exception.SerializationFailedException;
import org.example.task1.serialization.readerwrap.SerializerReaderWrapper;
import org.example.task1.serialization.serializer.intserializer.IntSerializer;

public class IntSerializerImpl implements IntSerializer {

  @Override
  public int deserialize(SerializerReaderWrapper reader)
      throws IOException, SerializationFailedException {
    int INT_MAX_DIGITS = 10;

    ArrayList<Character> buffer = new ArrayList<>();
    int digitsProcessed = 0;

    do {
      reader.read();

      if (!Character.isDigit(reader.getLastRead())) {
        if (buffer.isEmpty()) {
          throw new SerializationFailedException(
              "digit expected, but '0x%04x' found".formatted(reader.getLastRead()));
        } else {
          break;
        }
      }

      if (buffer.size() < INT_MAX_DIGITS) {
        buffer.add((char) reader.getLastRead());
      }

      digitsProcessed++;
    } while (true);

    String string = buffer.stream().map(Object::toString).collect(Collectors.joining());
    int integer = Integer.parseInt(string);

    if (digitsProcessed > INT_MAX_DIGITS || integer < 0) {
      throw new SerializationFailedException("number overflows int");
    }

    return integer;
  }
}
