package baseballgame;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int command;
		Scanner sc = new Scanner(System.in);
		BaseballGame game = new BaseballGame();
		System.out.println("====������ �����մϴ�====");
		game.run();
		System.out.println("������ ���� �����Ϸ��� 1, �����Ϸ��� 2�� �Է��ϼ���");
		command = sc.nextInt();
		while(!isRestart(command)) {
			System.out.println("====������ �����մϴ�====");
			game.run();
			System.out.println("������ ���� �����Ϸ��� 1, �����Ϸ��� 2�� �Է��ϼ���");
			command = sc.nextInt();
		}
		
	}
	public static boolean isRestart(int command) {
		if(command == 1) {
			return false;
		}else{
			return true;
		}
	}
}
