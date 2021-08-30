package org.randy.bookshandler.back;

import org.randy.bookshandler.openlibrary.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "org.randy")
@RestController
public class DemoApplication {

  private MyService myService;

  public DemoApplication(MyService myService) {
    this.myService = myService;
  }

  @GetMapping("/")
  public String home() {
    System.out.println("hhhhh");
    System.out.println(myService.message());
    return myService.message();
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
