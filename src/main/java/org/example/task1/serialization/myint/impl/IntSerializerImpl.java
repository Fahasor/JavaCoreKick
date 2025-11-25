package org.example.task1.serialization.myint.impl;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import org.example.task1.exception.SerializationFailedException;
import org.example.task1.serialization.myint.IntSerializer;

public class IntSerializerImpl implements IntSerializer {
  int INT_MAX_DIGITS = 10;
  
  @Override
  public int deserialize(Reader reader) throws IOException, SerializationFailedException {
    char[] buffer = new char[INT_MAX_DIGITS];
    int characterCode = reader.read();
    char c = (char) characterCode;

    if (characterCode == -1 || c == '\n') {
      throw new SerializationFailedException("early EOF/EOL found");
    }

    int charsNum = 1;
    buffer[0] = c;
    int charsProcessed = 0;
    do {
      characterCode = reader.read();
      c = (char) characterCode;

      if (characterCode == -1 || c == '\n' || c == ' ') {
        break;
      }

      if (!Character.isDigit(c)) {
        throw new SerializationFailedException("digit expected, but '%c' found".formatted(c));
      }

      if(charsNum < INT_MAX_DIGITS) {
        buffer[charsProcessed] = c;
        charsNum++;
      }
      charsProcessed++;
    } while (true);

    String string = Arrays.toString(Arrays.copyOfRange(buffer, 0, charsNum));
    int integer = Integer.parseInt(string);

    if(charsProcessed > INT_MAX_DIGITS || integer < 0) {
      throw new SerializationFailedException("number overflows int");
    }

    return integer;
  }
}
