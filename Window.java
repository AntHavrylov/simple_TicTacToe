package ttt;
import javax.swing.*;

import ttt.TicTacToe.player;

import java.awt.*;
import java.awt.event.*;


public class Window extends JFrame {
	
		
		JFrame frame;
		JButton newGame;
		JButton exit;
		private JLabel statusBar;
		Panel p;
		
		
		public Window(){
			super("mG");
			
			p = new Panel();
			newGame = new JButton("New game");
			exit = new JButton("Exit");
			statusBar = new JLabel("game started");
			
			setLocationRelativeTo(null);
			setSize(205,280);
			setResizable(false);
			add(newGame, BorderLayout.NORTH);
			newGame.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					
					theGame.t.newGame();
					p.clearBoard();
				}
			});
			
			add(p, BorderLayout.CENTER);
			add(statusBar, BorderLayout.SOUTH);
			p.addMouseListener(new MouseListener(){

				@Override
				public void mouseClicked(MouseEvent e){
					
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					
				}
				@Override
				public void mouseExited(MouseEvent e) {
					
				}
				@Override
				public void mousePressed(MouseEvent e) {
					
				}
				@Override
				public void mouseReleased(MouseEvent event) {
					if(theGame.t.getStatus()=="game"){
						//statusBar.setText(String.format("Clicked at %d, %d",event.getX(),event.getY()));
							if(event.getX() < 67 && event.getY() < 67){
								if(theGame.t.isEmpty(theGame.t.board[0][0]))	
									if(theGame.t.turnPlayer==player.O)
										p.setR1();
									else
										p.setC1();
									theGame.t.playerTurn(theGame.t.turnPlayer, "a1");
							}
							if(event.getX() > 67 && event.getX() < 134 && event.getY() < 67){
								if(theGame.t.isEmpty(theGame.t.board[0][1]))	
									if(theGame.t.turnPlayer==player.O)
										p.setR2();
									else
										p.setC2();
									theGame.t.playerTurn(theGame.t.turnPlayer, "b1");
							}
							if(event.getX() > 134 && event.getY() < 67){
								if(theGame.t.isEmpty(theGame.t.board[0][2]))	
									if(theGame.t.turnPlayer==player.O)
										p.setR3();
									else
										p.setC3();
									theGame.t.playerTurn(theGame.t.turnPlayer, "c1");
							}
							if(event.getX() < 67 && event.getY() > 67 && event.getY() < 134){
								if(theGame.t.isEmpty(theGame.t.board[1][0]))	
									if(theGame.t.turnPlayer==player.O)
										p.setR4();
									else
										p.setC4();
									theGame.t.playerTurn(theGame.t.turnPlayer, "a2");
							}
							if(event.getX() > 67 && event.getX() < 134 &&  event.getY() > 67 && event.getY() < 134){
								if(theGame.t.isEmpty(theGame.t.board[1][1]))	
									if(theGame.t.turnPlayer==player.O)
										p.setR5();
									else
										p.setC5();
									theGame.t.playerTurn(theGame.t.turnPlayer, "b2");
							}
							if(event.getX() > 134 &&  event.getY() > 67 && event.getY() < 134){
								if(theGame.t.isEmpty(theGame.t.board[1][2]))	
									if(theGame.t.turnPlayer==player.O)
										p.setR6();
									else
										p.setC6();
									theGame.t.playerTurn(theGame.t.turnPlayer, "c2");
							}
							if(event.getX() < 67 && event.getY() > 134){
								if(theGame.t.isEmpty(theGame.t.board[2][0]))	
									if(theGame.t.turnPlayer==player.O)
										p.setR7();
									else
										p.setC7();
									theGame.t.playerTurn(theGame.t.turnPlayer, "a3");
							}
							if(event.getX() > 67 && event.getX() < 134 && event.getY() > 134){
								if(theGame.t.isEmpty(theGame.t.board[2][1]))	
									if(theGame.t.turnPlayer==player.O)
										p.setR8();
									else
										p.setC8();
									theGame.t.playerTurn(theGame.t.turnPlayer, "b3");
							}
							if(event.getX() > 134 && event.getY() > 134){
								if(theGame.t.isEmpty(theGame.t.board[2][2]))	
									if(theGame.t.turnPlayer==player.O)
										p.setR9();
									else
										p.setC9();
									theGame.t.playerTurn(theGame.t.turnPlayer, "c3");
							}
						}	
					
				}
							
			});
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
		}
		
		
		public void setStatus(String s){
			this.statusBar.setText(s);
		}


}
