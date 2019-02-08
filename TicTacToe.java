
package ttt;
import java.util.Scanner;
import java.util.Random;
public class TicTacToe {
	static char[][] board = new char[3][3];	//2 dim array - game board
	public enum player{X,O};	// list players
	public static player turnPlayer = player.O; // player that make turn 
	static int turnCounter=0; //counter of turns to find stand-off
	static Scanner dataSc = new Scanner(System.in); //scanner to ask coordinates 
	public static String status = "game"; //game status for output win or stand-off message 
	
	public String getStatus(){
		return this.status;
	}
	public TicTacToe(){
		
		newGame(); //clear all places make them " "
		 //call method next player
		
		
	//	printBoard();		//call method print board
	}
	
	/**
	 * Method print board
	 * */
	public static void printBoard(){
		System.out.print("\n   a   b   c  \n");
		System.out.printf("1  %c | %c | %c \n",board[0][0],board[0][1],board[0][2]);	//print 1 line with corresponding values
		System.out.print("  ---|---|--- \n");
		System.out.printf("2  %c | %c | %c \n",board[1][0],board[1][1],board[1][2]);	//print 2 line with corresponding values
		System.out.print("  ---|---|--- \n");
		System.out.printf("3  %c | %c | %c \n",board[2][0],board[2][1],board[2][2]);	//print 3 line with corresponding values
	}
	
	/**
	 * Method makes all places empty, output rules
	 * */
	public static void newGame(){ 
		board[0][0]=(char)32;	//makes first place of board space(ASCII 32).
		board[0][1]=(char)32;	//all others as first
		board[0][2]=(char)32;
		board[1][0]=(char)32;
		board[1][1]=(char)32;
		board[1][2]=(char)32;
		board[2][0]=(char)32;
		board[2][1]=(char)32;
		board[2][2]=(char)32;
		turnCounter = 0;
		status = "game";
		nextPlayer();
		//welcome and rules messages
		//System.out.println("Welcome to Tic-tac-toe game.\nThere is board with 3 rolls on 3 collumns - 9 places.\nCoordinates of the board places are a1,a2,a3,b1,b2,b3,c1,c2,c3.");
		//System.out.println("Players have sings \"X\" or \"O\", choose places and enter corresponding coordinates.\nWinner - player who first will build line of 3 his sings.");
	}
	
	/**
	 * Method that call all method to make all needed steps
	 * */
	public static void playerTurn(player p,String place){ 
		//System.out.println("Please choose place to put your sign:"); // ask message
		//String x = randomInput(); //Random choose turns of players
		String x = place; //call Scanner to input data
		switch(x){ //check place that choose player and  if it's empty put corresponding sign
		 case "a1":			 			//actions corresponding to coordinates "a1"
			 	if(isEmpty(board[0][0]))	//checking empty
					if(p==player.X){		//sign player 'X'
						board[0][0]='X';	//put player sign
						if(isWin()==false)	//check that player wins or not(last turn)
							nextPlayer();	//if player is't win change player
					}
					else{					//sign player'O'
						board[0][0]='O';	//put player sign
						if(isWin()==false)	//check that player wins or not(last turn)
							nextPlayer();	//if player is't win change player
					}
				else{	//if board place isn't empty
				theGame.w.setStatus("Try another free field.");
				}
				printBoard();
				break; //exit case "a1"
		 case "a2":						//actions corresponding to coordinates "a2"	same as "a1"
				if(isEmpty(board[1][0]))
					if(p==player.X){
						board[1][0]='X';
						if(isWin()==false)
							nextPlayer();
					}
					else{
						board[1][0]='O';
						if(isWin()==false)
							nextPlayer();
					}
				else{
					theGame.w.setStatus("Try another free field.");
				}
				printBoard();
				break;
		 case "a3":						//actions corresponding to coordinates "a3"	same as "a1"
				if(isEmpty(board[2][0]))
					if(p==player.X){
						board[2][0]='X';
						if(isWin()==false)
							nextPlayer();
					}
					else{
						board[2][0]='O';
						if(isWin()==false)
							nextPlayer();
					}
				else{
					theGame.w.setStatus("Try another free field.");
				}
				printBoard();
				break;
		 case "b1":						//actions corresponding to coordinates "b1"	same as "a1"
				if(isEmpty(board[0][1]))
					if(p==player.X){
						board[0][1]='X';
						if(isWin()==false)
							nextPlayer();
					}
					else{
						board[0][1]='O';
						if(isWin()==false)
							nextPlayer();
					}
				else{
					theGame.w.setStatus("Try another free field.");
				}
				printBoard();
				break;
		 case "b2":						//actions corresponding to coordinates "b2"	same as "a1"
				if(isEmpty(board[1][1]))
					if(p==player.X){
						board[1][1]='X';
						if(isWin()==false)
							nextPlayer();
					}
					else{
						board[1][1]='O';
						if(isWin()==false)
							nextPlayer();
					}
				else{
					theGame.w.setStatus("Try another free field.");
				}
				printBoard();
				break;
		 case "b3":						//actions corresponding to coordinates "b3"	same as "a1"
				if(isEmpty(board[2][1]))
					if(p==player.X){
						board[2][1]='X';
						if(isWin()==false)
							nextPlayer();
					}
					else{
						board[2][1]='O';
						if(isWin()==false)
							nextPlayer();
					}
				else{
					theGame.w.setStatus("Try another free field.");
				}
				printBoard();
				break;
		 case "c1":						//actions corresponding to coordinates "c1"	same as "a1"
				if(isEmpty(board[0][2]))
					if(p==player.X){
						board[0][2]='X';
						if(isWin()==false)
							nextPlayer();
					}
					else{
						board[0][2]='O';
						if(isWin()==false)
							nextPlayer();
					}
				else{
					theGame.w.setStatus("Try another free field.");
					}
				printBoard();
				break;
		 case "c2":						//actions corresponding to coordinates "c2"	same as "a1"
				if(isEmpty(board[1][2]))
					if(p==player.X){
						board[1][2]='X';
						if(isWin()==false)
							nextPlayer();
					}
					else{
						board[1][2]='O';
						if(isWin()==false)
							nextPlayer();
					}
				else{
					theGame.w.setStatus("Try another free field.");
					}
				printBoard();
				break;
		 case "c3":						//actions corresponding to coordinates "c3"	same as "a1"
				if(isEmpty(board[2][2]))
					if(p==player.X){
						board[2][2]='X';
						if(isWin()==false)
							nextPlayer();
					}
					else{
						board[2][2]='O';
						if(isWin()==false)
							nextPlayer();
					}
				else{ //if player entered value of place that isn't empty
					theGame.w.setStatus("Try another free field.");
				}
				printBoard();
				break;
		default:	//if player entered some wrong value 
				System.out.println("Was choosen wrong value. Please choose correct value,\nthat corresponding to coordinates of the board(a1,a2,a3,b1,b2,b3,c1,c2,c3).");	
		} 
	}
	
	/*
	 *Method checks that place of board is empty and return boolean value
	 * */
	public static boolean isEmpty(char h){	//get place of board
		boolean result = false;	//result value
		if(h==(char)32)	// if checking value is space(ASCII 32);
			result=true;//as make result as empty value
		else
			result=false; // if isn't space as result will be not empty
		return result; // return value
	}
	
	/**
	 *Method change player, output corresponding message and add +1 to counter of turns
	 **/
	public static void nextPlayer(){
		
		if(turnPlayer==player.X){	//if player with sign X made turn
			turnPlayer=player.O;	//change player to O
			turnCounter++;			//add +1 to turn counter
			}
		else{						//made turn player O
			turnPlayer=player.X;	//change player to X
			turnCounter++;			//add +1 to turn counter
			}				//call printBoard Method
		theGame.w.setStatus("Now turn of player'"+turnPlayer+"'."); //output message that ask turn
	}
	
	/**
	 * Method checks all possible variants of lines to win and "stand-off" variant
	 * */
	public static boolean isWin(){
			boolean result=false;
			//first horizontal line contain same signs
			if((board[0][0]!=(char)32)&&(board[0][0]==board[0][1]&&board[0][0]==board[0][2])){
				result=true;	//result makes to true - flag that need to stop game
				status = "w";	//marker become "w" = have winner
			}
			//second horizontal line contain same signs
			else if((board[1][0]!=(char)32)&&(board[1][0]==board[1][1]&&board[1][0]==board[1][2])){
				result=true;	//result makes to true - flag that need to stop game
				status = "w";	//marker become "w" = have winner
			}
			//third horizontal line contain same signs
			else if((board[2][0]!=(char)32)&&(board[2][0]==board[2][1]&&board[2][0]==board[2][2])){
				result=true;	//result makes to true - flag that need to stop game
				status = "w";	//marker become "w" = have winner
			}
			//first vertical column contain same signs
			else if((board[0][0]!=(char)32)&&(board[0][0]==board[1][0]&&board[0][0]==board[2][0])){
				result=true;	//result makes to true - flag that need to stop game
				status = "w";	//marker become "w" = have winner
			}
			//second vertical column contain same signs
			else if((board[0][1]!=(char)32)&&(board[0][1]==board[1][1]&&board[0][1]==board[2][1])){
				result=true;	//result makes to true - flag that need to stop game
				status = "w";	//marker become "w" = have winner
			}
			//third vertical column contain same signs
			else if((board[0][2]!=(char)32)&&(board[0][2]==board[1][2]&&board[0][2]==board[2][2])){
				result=true;	//result makes to true - flag that need to stop game
				status = "w";	//marker become "w" = have winner
			}
			//diagonal line from left up corner to bottom right contain same signs
			else if((board[0][0]!=(char)32)&&(board[0][0]==board[1][1]&&board[0][0]==board[2][2])){
				result=true;	//result makes to true - flag that need to stop game
				status = "w";	//marker become "w" = have winner
			}
			//diagonal line from right up corner to bottom left contain same signs
			else if((board[0][2]!=(char)32)&&(board[0][2]==board[1][1]&&board[0][2]==board[2][0])){
				result=true;	//result makes to true - flag that need to stop game
				status = "w";//marker become "w" = have winner
				//theGame.w.setStatus("player" + turnPlayer + "won!" );
				
			}
			//if was made 9 turns (+1 the first to output message)& have no winners
			if(!result&&(turnCounter==9)){ 
				result=true; //result makes to true - flag that need to stop game
				status = "s";//status become "s" from stand-off
			}	
			if (status == "w")
				theGame.w.setStatus("Game ended. " + turnPlayer + " won!");
			else if(status == "s")
				theGame.w.setStatus("Game ended. Stand-Off.");
			System.out.println(status);
		return result; // return result
		}
	
	/**
	 * Temporary method for input values instead players for check program can be called in playerTurn() method
	 * */
	public static String randomInput(){
		Random rama = new Random(); // identify random
		int num = rama.nextInt(9); 	// randomly gives values to num value
		String result = ""; // will return result
		switch(num){ //back to result coordinate values corresponding to randomly numbers
		case 0:
			result="a1";
			break;
		case 1: 
			result="a2";
			break;
		case 2:
			result="a3";
			break;
		case 3:
			result="b1";
			break;
		case 4:
			result="b2";
			break;
		case 5:
			result="b3";
			break;
		case 6:
			result="c1";
			break;
		case 7:
			result="c2";
			break;
		case 8:
			result="c3";
			break;
		default :
			System.out.println("err0r");
		}
		return result; //return result
	}
}
