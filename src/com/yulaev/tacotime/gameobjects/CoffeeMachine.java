package com.yulaev.tacotime.gameobjects;

import com.yulaev.tacotime.R;
import android.content.Context;

/** This class describes the Coffee Machine used in the TacoTime game
 * 
 * @author ivany
 *
 */

public class CoffeeMachine extends GameItem {
	
	//Define all of the state indices
	public static final int STATE_IDLE=0;
	public static final int STATE_BREWING=1;
	public static final int STATE_DONE=2;
	
	/** Constructor for CoffeeMachine mostly mimics a game items, except it sets the name by itself. Also it sets up
	 * all of the CoffeeMachine states and the associated bitmaps; the bitmap provided as an argument is just a "default" bitmap
	 * that probably never gets used.
	 * @param caller
	 * @param r_bitmap
	 * @param x_pos
	 * @param y_pos
	 * @param orientation
	 */
	public CoffeeMachine(Context caller, int r_bitmap, int x_pos, int y_pos, int orientation) {
		super(caller, "CoffeeMachine", r_bitmap, x_pos, y_pos, orientation, 10, 10);
		
		//Add states that describe behavior of coffee machine
		//super.addState(String stateName, int state_delay_ms, int r_bitmap, boolean input_sensitive, boolean time_sensitive)
		this.addState("idle", 0, R.drawable.coffeemachine_idle, true, false);
		this.addState("brewing", 5000, R.drawable.coffeemachine_brewing, false, true);
		this.addState("done", 0, R.drawable.coffeemachine_done, true, false);
	}
}
