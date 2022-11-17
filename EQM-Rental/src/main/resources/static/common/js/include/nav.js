//nav 바 반응형을 위한 자바스크립트

			$(document).ready(function(){
				
				//메인 사이드 바 숨기기
				$("#main-sidebar").hide();
				
				//미니 사이드 바 마우스 오버시
				$("#mini-sidebar").mouseover(function(){
					$("#mini-sidebar").hide();
					$("#main-sidebar").show();
				})
				//메인 사이드바 마우스를 떠날 경우
				$("#main-sidebar").mouseleave(function(){
					$("#main-sidebar").hide();
					$("#mini-sidebar").show();
				})
				
			})