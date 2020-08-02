/**
 * 
 */
package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Oscar
 *
 */
@RestController
@CrossOrigin(origins = "*")
public class DemoController {

	  @GetMapping("/mensaje")
	  public String mensaje() {
	    return "hola desde spring rest";
	  }
}
