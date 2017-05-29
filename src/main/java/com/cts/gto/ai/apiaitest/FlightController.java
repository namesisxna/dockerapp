package com.cts.gto.ai.apiaitest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.gto.ai.util.ObjectToJson;


@Controller
public class FlightController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(FlightController.class);
	
	@RequestMapping(value = "/flight", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String getFlight() {
		System.out.println("invoked");
		return "flight booked";
	}
	
	@RequestMapping(value = "/bookFlight", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String bookFlight(@RequestParam(value="geo-city", defaultValue="India") String country) {
		System.out.println("invoked bookFlight method");
		LOGGER.info("invoked bookFlight method");
		LOGGER.info("input request geo-city:"+country);
		String jsonString = ObjectToJson.getJsonString("you want to book flight from "+country);
		LOGGER.info(jsonString);
		return jsonString;
	}

}
