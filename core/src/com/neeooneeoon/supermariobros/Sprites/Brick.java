package com.neeooneeoon.supermariobros.Sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.World;
import com.neeooneeoon.supermariobros.Scenes.HUD;
import com.neeooneeoon.supermariobros.SuperMarioBros;

public class Brick extends InteractiveTileObject{
    @Override
    public void onHeadHit() {
        Gdx.app.log("Brick", "Collision");
        setCategoryFilter(SuperMarioBros.DESTROYED_BIT);
        getCell().setTile(null);
        HUD.addScore(200);
        SuperMarioBros.manager.get("audio/sounds/breakblock.wav", Sound.class).play();
    }

    public Brick(World world, TiledMap map, Rectangle bounds) {
        super(world, map, bounds);
        fixture.setUserData(this);
        setCategoryFilter(SuperMarioBros.BRICK_BIT);
    }
}
