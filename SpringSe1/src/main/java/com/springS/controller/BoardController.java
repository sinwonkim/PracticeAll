package com.springS.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

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
	
	// return 값 없을시 매핑된 value값+.jsp로 리턴
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
	
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam(value ="bno", required = false, defaultValue="0") int bno, Model model) throws Exception {
		
		// Model attributes()작업을 할때  아무런 이름없이 데이터를 넣으면 자동으로 클래스의 이름을 소문자로 시작해서 사용함
		model.addAttribute(service.read(bno));
	}
	
	// 게시판 삭제처리 
	@RequestMapping(value = "/remove", method= RequestMethod.POST)
	public String remove(@RequestParam("bno")int bno, RedirectAttributes rttr) throws Exception {
		
		service.remove(bno);
		
		// 삭제결과 RedirectAttributes의  addFlashAttribute 활용
		rttr.addFlashAttribute("msg2","SUCCESS");
		
		return "redirect:/board/listAll";
	}
	
	// modify get방식은 조회 페이지로 이동하게 함   return 에 뷰페이지 작성 안할시 value.jsp 로 되고 
	@RequestMapping(value="/modify",method = RequestMethod.GET)
	public void modifyGET(int bno, Model model) throws Exception {
		
		// Model attributes()작업을 할때  아무런 이름없이 데이터를 넣으면 자동으로 클래스의 이름을 소문자로 시작해서 사용함
		model.addAttribute(service.read(bno));
	}
	
	// modify post방식은 실제 수정 작업을 처리함 리턴타입은 등록,삭제와 동일하게 처리함 	
	@RequestMapping(value="/modify",method = RequestMethod.POST)
	public String modifyPOST(BoardVO board, RedirectAttributes rttr)throws Exception {
		
		service.modify(board);
		rttr.addFlashAttribute("msg3","SUCCESS");
		
		return "redirect:/board/listAll";
	}
}
