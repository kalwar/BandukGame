package com.appketo.banduk;

import android.content.Context;
import android.content.SharedPreferences;

public class GameData{
    private static final String GAME_DATA_FILE_NAME = "GAME_DATA_FILE_NAME";
    private static final String GAME_DATA_WINS = "GAME_DATA_WINS";
    private static final String GAME_DATA_LOSSES = "GAME_DATA_LOSSES";
	private static final Context c = null;
    public static void updateGameWinResults(Context ctx, Boolean gameWon){
        if(gameWon){
            ctx.getSharedPreferences(GAME_DATA_FILE_NAME, Context.MODE_PRIVATE).edit().putInt(GAME_DATA_WINS, getGameWins(ctx) + 1).commit();
        } else {
            ctx.getSharedPreferences(GAME_DATA_FILE_NAME, Context.MODE_PRIVATE).edit().putInt(GAME_DATA_WINS, getGameLosses(ctx) + 1).commit();
        }
    }
    public static int getGameWins(Context ctx){
        SharedPreferences sp = c.getSharedPreferences(GAME_DATA_FILE_NAME, Context.MODE_PRIVATE);
            return sp.getInt(GAME_DATA_WINS, 0);
    }
    public static int getGameLosses(Context ctx){
        SharedPreferences sp = c.getSharedPreferences(GAME_DATA_FILE_NAME, Context.MODE_PRIVATE);
            return sp.getInt(GAME_DATA_LOSSES, 0);
    }
	public static void updateGameWinResults(CannonView cannonView,
			boolean gameWon) {
		// TODO Auto-generated method stub
		
	}
	public static void updateGameLoseResults(CannonView cannonView, boolean b) {
		// TODO Auto-generated method stub
		
	}
}
