package com.neeooneeoon.supermariobros.Sprites;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.*;
import com.neeooneeoon.supermariobros.SuperMarioBros;

public class Mario extends Sprite {
    public World world;
    public Body b2body;

    public Mario(World world) {
        this.world = world;
        defineMario();
    }

    public void defineMario() {
        BodyDef bdef = new BodyDef();
        bdef.position.set(32 / SuperMarioBros.PPM, 32 / SuperMarioBros.PPM);
        bdef.type = BodyDef.BodyType.DynamicBody;
        b2body = world.createBody(bdef);

        FixtureDef fdef = new FixtureDef();
        CircleShape shape = new CircleShape();
        shape.setRadius(5 / SuperMarioBros.PPM);

        fdef.shape = shape;
        b2body.createFixture(fdef);
    }
}
