package com.cami.convertirfechaacontrollers;

import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/inicio")
public class MainController {
	
@RecuestMapping("")
	public String bienvenida() {
	System.out.println("HOLA")
	return "index.jsp";

	}

}
