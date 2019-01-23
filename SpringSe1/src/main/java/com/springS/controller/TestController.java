package com.springS.controller;

import java.util.logging.Logger;

import javax.inject.Inject;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.TestService;
import vo.TestVo;

@Controller
public class TestController {
	
	@Inject
	private TestService testService;
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String moveTest() {
		
		int result = testService.insertTest();
		System.out.println("결과값 >> "+result);
		
		return "test";
	}
	
	@RequestMapping(value="/host")
	public String print( @ModelAttribute("msg")String aop) {
		
		
		
		return "result";
	}
	
	@RequestMapping(value="/contentVo")
	public String content(Model model, @ModelAttribute("location")String locate) {
		TestVo testVo = new TestVo("as","29");
		
		testVo.setAge("30");
		testVo.setLocate(locate);
		model.addAttribute(testVo);
		return "result";
	}
}
