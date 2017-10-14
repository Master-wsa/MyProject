package com.netctoss.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netctoss.service.PowersService;

@Controller
@RequestMapping("powers")
public class PowersAction {
	
	@Resource
	private PowersService powersService;
	
}
