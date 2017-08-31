package com.hsd.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 固定资产
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/fixationProperty")
public class FixationPropertyController {
	
	
	@RequestMapping(value="")
	public String toFixationPropertyPage(){
		
		return "";
		
	}

}
