
package sample.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

  @GetMapping("/")
  public String getHello() {
    return "HelloWorld";
  }

}