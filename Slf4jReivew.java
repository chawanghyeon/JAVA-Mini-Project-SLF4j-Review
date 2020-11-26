package slf4j_review;

import java.util.Scanner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Slf4jReivew {
	private static int logined;
	static void login(String id) {
		if(id.equals("playdata")) {
			if(logined == 0) {
				log.trace("로그인 성공");
				logined++;
			}else {
				log.trace("누군가가 로그인 중입니다.");
			}
		}else {
			log.trace("로그인 실패");
		}
	}
	static void logout() {
		if(logined != 0) {
			logined = 0;
			log.trace("로그아웃");
		}else {
			log.trace("이미 로그아웃 상태입니다.");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("id를 입력하세요 : ");
		String input = s.nextLine();
		login(input);
		System.out.print("id를 입력하세요 : ");
		input = s.nextLine();
		login(input);
		logout();
		System.out.print("id를 입력하세요 : ");
		input = s.nextLine();
		login(input);
		s.close();
	}

}
