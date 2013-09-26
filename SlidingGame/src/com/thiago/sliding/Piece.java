package com.thiago.sliding;

import android.graphics.Rect;

public class Piece {
	Rect rec;
	int posx;
	int posy;
	int index;
	
	
	public Piece(Rect rectangle,int positionx,int positiony,int positionindex){
		rec = rectangle;
		posx = positionx;
		posy = positiony;
		index = positionindex;
	}	
	public Rect getRect(){
		return rec;
	}	
	public int getPosX(){
		return posx;
	}	
	public int getPosY(){
		return posy;
	}
	public int getIndex(){
		return index;
	}
}
