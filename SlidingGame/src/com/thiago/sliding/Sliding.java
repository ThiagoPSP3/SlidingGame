package com.thiago.sliding;

import com.thiago.framework.Screen;
import com.thiago.framework.implementation.AndroidGame;

public class Sliding extends AndroidGame {
    @Override
    public Screen getInitScreen() {
        return new LoadingScreen(this); 
    }
    
}