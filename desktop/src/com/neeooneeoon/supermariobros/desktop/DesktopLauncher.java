package com.neeooneeoon.supermariobros.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.neeooneeoon.supermariobros.SuperMarioBros;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 400 * 3;
		config.height = 208 * 3;
		new LwjglApplication(new SuperMarioBros(), config);
	}
}
