package me.brendn.oak.api.client.settings;

/**
 * GameSettings wrapper.
 *
 * The reason these are direct references to settings rather than using a list is simply because of performance reasons.
 * Rather than scanning through a list to get a setting value, this will allow you to get the value directly.
 * It's messier, but faster!
 */
public interface ClientSettings {

	//====================================
	//  Sound and misc.===================
	//====================================

	float getMusicVolume();

	float getSoundVolume();

	float getMouseSensitivity();

	boolean isMouseInverted();

	int getDifficultySetting();

	//====================================
	//  Video Settings====================
	//====================================

	int getViewDistance();

	boolean isViewBobbing();

	boolean is3DAnaglyph();

	boolean isAdvancedOpenGL();

	int getFramerateLimit();

	boolean isFancyGraphics();

	boolean isSmoothLighting();

	int getGuiScale();

	//====================================
	//  F-Key Toggles=====================
	//====================================

	boolean isGuiHidden();

	boolean isSmoothCamera();

	boolean isThirdPerson();

	boolean isDebugMenuOpen();
}
