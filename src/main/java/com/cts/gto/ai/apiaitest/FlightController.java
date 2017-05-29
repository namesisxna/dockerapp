package com.cts.gto.ai.apiaitest;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class FlightController {
	
	@RequestMapping(value = "/flight", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String getFlight() {
		System.out.println("invoked");
		return "flight booked";
	}

}
