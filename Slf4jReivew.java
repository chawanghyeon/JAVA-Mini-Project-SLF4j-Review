package slf4j_review;

import java.util.Scanner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Slf4jReivew {
	private static int logined;
	static void login(String id) {
		if(id.equals("playdata")) {
			if(logined == 0) {
				log.trace("�α��� ����");
				logined++;
			}else {
				log.trace("�������� �α��� ���Դϴ�.");
			}
		}else {
			log.trace("�α��� ����");
		}
	}
	static void logout() {
		if(logined != 0) {
			logined = 0;
			log.trace("�α׾ƿ�");
		}else {
			log.trace("�̹� �α׾ƿ� �����Դϴ�.");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("id�� �Է��ϼ��� : ");
		String input = s.nextLine();
		login(input);
		System.out.print("id�� �Է��ϼ��� : ");
		input = s.nextLine();
		login(input);
		logout();
		System.out.print("id�� �Է��ϼ��� : ");
		input = s.nextLine();
		login(input);
		s.close();
	}

}
