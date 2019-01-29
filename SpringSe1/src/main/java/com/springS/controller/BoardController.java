package com.springS.controller;

import javax.inject.Inject;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import service.BoardService;
import vo.BoardVO;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value= "/register", method = RequestMethod.GET)
	public void registerGET(BoardVO board,Model model) throws Exception {
		logger.info("register..............register GET");
	}
	
	// 실제로 화면에서 입력되어 들어오는 데이터를 처리하기 위해 BoardVO로 수집 , 데이터를 전달처리 하기위해 Model 클래스 
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registPOST(BoardVO board, RedirectAttributes rttr) throws Exception {
		
		rttr.addFlashAttribute("msg","SUCCESS");
		
		/*return "/board/sucess";*/
		
		service.regist(board);
	
		return "redirect:/board/listAll"; //
		
	}
	@RequestMapping(value="listAll", method=RequestMethod.GET)
	public void listAll(Model model) throws Exception {
		logger.info(" all list ");
		model.addAttribute("list", service.listAll());
		
	}
	
	// read는 리턴값 필요없음
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, Model model) throws Exception {
		
		model.addAttribute(service.read(bno));
	}
	
}
