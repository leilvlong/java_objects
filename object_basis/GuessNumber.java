// 猜数字游戏
class GuessGame{
	public void Stratgame(){
		// 创建三个 Player 的猜数字对象
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		// 声明三个变量用来保存GuessGame逻辑中的产生的数字
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		// 获取游戏随机数 Math.random产生介于0-1之间的数 
		int targetNumber = (int)(Math.random()*10);
		System.out.println("randow is" + targetNumber);
		while(true){
			// 对象 p1 所获取的随机数
			p1.guess();
			guessp1 = p1.number;
			System.out.println("player one guessed" + " " + guessp1);
			
			// 对象 p2 所获取的随机数
			p2.guess();
			guessp2 = p2.number;
			System.out.println("player two guessed" + " " + guessp2);
			
			// 对象 p3 所获取的随机数
			p3.guess();
			guessp3 = p3.number;
			System.out.println("player three guessed" + " " + guessp3);
			
			// 判断是否猜中数字的逻辑处理
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
			写法:
			if(guessp1 == targetNumber){
				p1right = true;
			}
			if(guessp2 == targetNumber){
				p2right = true;
			}
			if(guessp3 == targetNumber){
				p3right = true;
			}
			以及:
			if(guessp1 == targetNumber){
				boolean p1right = true;
			}
			if(guessp2 == targetNumber){
				boolean p2right = true;
			}
			if(guessp3 == targetNumber){
				boolean p3right = true;
			}
			以上都是错误的写法 
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