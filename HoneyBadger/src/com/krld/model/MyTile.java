package com.krld.model;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class MyTile {
    //  private Image img;
    public static final int GRASS = 0;
    public static final int STONE = 1;
    public static final int DIRT = 2;
    public static final int FOREST_GRASS = 3;
    public static final int WATER = 4;
    public static Image GRASS_IMG;
    public static Image FORES_GRASS_IMG;
    public static Image STONE_IMG;
    public static Image DIRT_IMG;
    public static Image WATER_IMG;
    public static Image WATER2_IMG;
    private static int count = 0;

    static {
        try {
            GRASS_IMG = new Image("HoneyBadger/res/grass.png");
            FORES_GRASS_IMG = new Image("HoneyBadger/res/grass2.png");
            STONE_IMG = new Image("HoneyBadger/res/stone.gif");
            DIRT_IMG = new Image("HoneyBadger/res/dirt.png");
            WATER_IMG = new Image("HoneyBadger/res/water.png");
            WATER2_IMG = new Image("HoneyBadger/res/water2.png");
            GRASS_IMG.setFilter(Image.FILTER_NEAREST);
            FORES_GRASS_IMG.setFilter(Image.FILTER_NEAREST);
            STONE_IMG.setFilter(Image.FILTER_NEAREST);
            DIRT_IMG.setFilter(Image.FILTER_NEAREST);
            WATER_IMG.setFilter(Image.FILTER_NEAREST);
            WATER2_IMG.setFilter(Image.FILTER_NEAREST);
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    public MyTile(Image img) {
        //   this.img = img;
        count = getCount() + 1;
        System.out.println("com.krld.model.MyTile count: " + count);
    }

    public static int getCount() {
        return count;
    }

    public static void draw(int type, int x, int y, GameContainer gameContainer) {
        if (type == MyTile.GRASS) {
            GRASS_IMG.drawCentered(x, y);
        } else if (type == MyTile.FOREST_GRASS) {
            FORES_GRASS_IMG.drawCentered(x, y);
        } else if (type == MyTile.DIRT) {
            DIRT_IMG.drawCentered(x, y);
        } else if (type == MyTile.STONE) {
            STONE_IMG.drawCentered(x, y);
        } else if (type == MyTile.WATER) {

            if (gameContainer.getTime() % 1000 > 500) {
                WATER_IMG.drawCentered(x, y);

            } else {
                WATER2_IMG.drawCentered(x, y);
             //
            }
         //   gameContainer.getGraphics().drawString("x" + ((x + 1) / 32), x -16,y-16);
          //  gameContainer.getGraphics().drawString("y" + ((y + 1) / 32), x -16,y);

        }
    }
}
