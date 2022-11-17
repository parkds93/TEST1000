package com.eqm.project.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor //final을 붙이면 @Autowried 안해도 됨
public class MainController {
	
	/*
	 * 작 성 자 : 전준표
	 * 작 성 일 : 2022-11-16
	 * 작 성 내 용 : index페이지 뷰
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	 public ModelAndView indexView(ModelAndView mv) throws Exception{
		 
		 log.info("인덱스 페이지 접속");
		 mv.setViewName("index");
		 
		 return mv;
	 }
	
	 
		/*
		 * 작 성 자 : 전준표
		 * 작 성 일 : 2022-11-16
		 * 작 성 내 용 : index페이지 뷰
		 */
		 @RequestMapping(value = "/eqmrental/main", method = RequestMethod.GET)
		 public ModelAndView mainPageView(ModelAndView mv) throws Exception{
			 
			 log.info("메인 페이지 접속");
			 mv.setViewName("main");
			 
			 return mv;
		 }
		
	 
	
}
