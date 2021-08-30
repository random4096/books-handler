package org.randy.bookshandler.openlibrary;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyServiceTest {

  @Autowired
  private MyService myService;

  @Test
  public void contextLoads() {
    assertThat(myService.message()).isNotNull();
  }

}
