package com.springS.controller;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.util.JSONPObject;

import service.TestService;
import vo.TestVo;

@Controller
public class TestController {
	
	@Inject
	private TestService testService;
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String moveTest() {
		
		int result = testService.insertTest();
		int result1	=testService.deleteTest();
		System.out.println("insert 결과값 >> "+result);
		System.out.println("delete 결과값 >> "+result1);
		
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
		model.addAttribute("t",testVo);
		return "result";
	}
	
	@RequestMapping(value="/doSON")
	public @ResponseBody TestVo asd() {
		TestVo vo = new TestVo("sinwons","");
		return vo;
		
	}
	
	@RequestMapping(value="listtest")
	public void testCode() {
		List<TestVo> list = new ArrayList<TestVo>();
		TestVo vovo = new TestVo("3","4");
		
		list = (List<TestVo>) vovo;
		System.out.println(list);
		return ;
	}
}
