package com.andrearota.general.hackerrank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MazeSolver {

	public int minMoves(char[][] maze) {
		
		int rows = maze.length;
		int columns = maze[0].length;
		
		Queue<Cell> fringe = new LinkedList<Cell>();
		
		int[][] labels = new int[rows][columns];
		
		for (int[] labelRow : labels) {
			Arrays.fill(labelRow, -1);
		}
		
		int sx=0, sy=0;
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				if(maze[i][j] == 'S') {
					sx = i;
					sy = j;
				}
			}
		}
		
		labels[sx][sy] = 0;
		
		fringe.add(new Cell(sx, sy));
		
		while(!fringe.isEmpty()) {
			
			Cell current = fringe.poll();
			
			for(int dX = -1; dX <= 1; dX++) {
				for(int dY = -1; dY <= 1; dY++) {
					if(Math.abs(dX) != Math.abs(dY)) {
						if(current.getX()+dX>=0 && current.getX()+dX<rows && current.getY()+dY>=0 && current.getY()+dY<columns) {
							char neighboorValue = maze[current.getX()+dX][current.getY()+dY];
							
							switch(neighboorValue) {
							
							case '.':
							case 'E':
								if(labels[current.getX()+dX][current.getY()+dY] == -1 || labels[current.getX()+dX][current.getY()+dY] > labels[current.getX()][current.getY()]) {
									labels[current.getX()+dX][current.getY()+dY] = labels[current.getX()][current.getY()] + 1;
									if(neighboorValue!='E') {
										fringe.add(new Cell(current.getX()+dX, current.getY()+dY));
									}
								}
								break;
								
							case 'X':
							default:
								break;
						
						
							}

						}
					}

				}
			}
		}
		
		int ex = 0, ey = 0;
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				if(maze[i][j] == 'E') {
					ex=i;
					ey=j;
				}
			}
		}
		
		return labels[ex][ey];
	}
	

}
