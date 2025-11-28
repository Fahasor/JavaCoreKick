package org.example.task1.repository.impl;

import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.task1.repository.FileRepository;
import org.junit.jupiter.api.Test;

class FileRepositoryImplTest {

  private static final Logger log = LogManager.getLogger(FileRepositoryImplTest.class);

  @Test
  void readAll() throws IOException {
    FileRepository fileRepository = new FileRepositoryImpl();
    List<int[]> list = fileRepository.readAll();
    log.info(list);
  }
}