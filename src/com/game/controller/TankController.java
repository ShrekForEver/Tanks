package com.game.controller;

import com.game.model.TankModel;
import com.game.view.TankView;
import org.lwjgl.input.Keyboard;

public class TankController extends GameObjectController {
    private TankView view;
    private TankModel model;
    private boolean isSaceClicked=false;
    public TankController(TankView view, TankModel model) {
        this.model = model;
        this.view = view;
    }
    public void getInput() {
        
        while (Keyboard.next()) {
            if (Keyboard.isKeyDown(Keyboard.KEY_UP) && Keyboard.isKeyDown(Keyboard.KEY_LEFT)) {
                model.stop();
                model.moveTop();
                model.moveLeft();
            } else if (Keyboard.isKeyDown(Keyboard.KEY_UP) && Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) {
                model.stop();
                model.moveTop();
                model.moveRight();
            } else if (Keyboard.isKeyDown(Keyboard.KEY_DOWN) && Keyboard.isKeyDown(Keyboard.KEY_LEFT)) {
                model.stop();
                model.moveBottom();
                model.moveLeft();
            } else if (Keyboard.isKeyDown(Keyboard.KEY_DOWN) && Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) {
                model.stop();
                model.moveBottom();
                model.moveRight();
            } else if (Keyboard.isKeyDown(Keyboard.KEY_DOWN) && Keyboard.isKeyDown(Keyboard.KEY_UP)) {
                model.stop();
            } else if (Keyboard.isKeyDown(Keyboard.KEY_LEFT) && Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) {
                model.stop();
            } else if (Keyboard.isKeyDown(Keyboard.KEY_UP)) {
                model.stop();
                model.moveTop();
            } else if (Keyboard.isKeyDown(Keyboard.KEY_DOWN)) {
                model.stop();
                model.moveBottom();
            } else if (Keyboard.isKeyDown(Keyboard.KEY_LEFT)) {
                model.stop();
                model.moveLeft();
            } else if (Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) {
                model.stop();
                model.moveRight();
            } else if (Keyboard.isKeyDown(Keyboard.KEY_SPACE)) {
                model.addBullet();
                model.stop();
            } else {
                model.stop();
            } 
        }
    }
}
