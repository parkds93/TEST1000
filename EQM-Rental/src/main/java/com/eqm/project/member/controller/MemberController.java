package com.eqm.project.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


/*
 *  작 성 자 : 전 준 표
 *  작 성 일 : 2022-11-16
 *  작 성 내  용 : 공용으로 로그인/회원가입/로그아웃을 담당하는 기능
 */


@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "/member")
public class MemberController {
	
		//로그인 뷰로 이동
		@GetMapping(value = "/loginView")
		public String loginView() throws Exception {
			return "member/loginView";
		}
		
		
		//회원유형 선택 뷰
		@GetMapping(value = "/joinType")
		public String userTypeView() {
			return "member/joinType";
		}
		//일반 회원가입 뷰
		@GetMapping(value = "/userJoinView")
		public String userJoinView() throws Exception {
			return "member/userJoinView";
		}
		//관리자 회원가입 뷰
		@GetMapping(value = "/adminJoinView")
		public String adminJoinView() throws Exception {
			return "user/adminJoinView";
		}
		
		//관리자 회원가입 뷰
		@GetMapping(value = "/partnerJoinView")
		public String partnerJoinView() throws Exception {
			return "user/adminJoinView";
		}
		
		
}
