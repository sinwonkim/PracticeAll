package com.springS.controller;

import javax.inject.Inject;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registPOST(BoardVO board, RedirectAttributes rttr) throws Exception {
		
		rttr.addFlashAttribute("msg","SUCCESS");
		
		/*return "/board/sucess";*/
		
	
		return "redirect:/board/listAll";
		
	}
	@RequestMapping(value="listAll", method=RequestMethod.GET)
	public void listAll(Model model) throws Exception {
		logger.info(" all list ");
		model.addAttribute("list", service.listAll());
		
	}
	
}
