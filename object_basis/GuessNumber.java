// ��������Ϸ
class GuessGame{
	public void Stratgame(){
		// �������� Player �Ĳ����ֶ���
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		// ��������������������GuessGame�߼��еĲ���������
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		// ��ȡ��Ϸ����� Math.random��������0-1֮����� 
		int targetNumber = (int)(Math.random()*10);
		System.out.println("randow is" + targetNumber);
		while(true){
			// ���� p1 ����ȡ�������
			p1.guess();
			guessp1 = p1.number;
			System.out.println("player one guessed" + " " + guessp1);
			
			// ���� p2 ����ȡ�������
			p2.guess();
			guessp2 = p2.number;
			System.out.println("player two guessed" + " " + guessp2);
			
			// ���� p3 ����ȡ�������
			p3.guess();
			guessp3 = p3.number;
			System.out.println("player three guessed" + " " + guessp3);
			
			// �ж��Ƿ�������ֵ��߼�����
			boolean p1right = false;
			boolean p2right = false;
			boolean p3right = false;
			if(guessp1 == targetNumber){
				p1right = true;
			}
			if(guessp2 == targetNumber){
				p2right = true;
			}
			if(guessp3 == targetNumber){
				p3right = true;
			}
			if(p1right || p2right || p3right){
				System.out.println("we have a winner");
				System.out.println("player one got it right?" + " " + p1right);
				System.out.println("player two got it right?" + " " + p2right);
				System.out.println("player three got it right?" + " " +  p3right);
				System.out.println("game over");
				break;
			}else{
				System.out.println("fuck");
			}
			
			/*
			д��:
			if(guessp1 == targetNumber){
				p1right = true;
			}
			if(guessp2 == targetNumber){
				p2right = true;
			}
			if(guessp3 == targetNumber){
				p3right = true;
			}
			�Լ�:
			if(guessp1 == targetNumber){
				boolean p1right = true;
			}
			if(guessp2 == targetNumber){
				boolean p2right = true;
			}
			if(guessp3 == targetNumber){
				boolean p3right = true;
			}
			���϶��Ǵ����д�� 
			*/
			
		}
		
		
	}
}

class Player{
	int number = 0;
	public void guess(){
		number = (int)(Math.random()*10);
		System.out.println("Im guessing" + " " + number);
	}
}

class GuessNumber{
	public static void main(String args[]){
		GuessGame game = new GuessGame();
		game.Stratgame();
	}
}