package me.myraclez.lync;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 *
 * It uses Foundation for fast and efficient development process.
 */
public final class LyncPlugin extends SimplePlugin {

	/**
	 *  bilo likes apples
	 */
	int apple = 5;

	/**
	* Automatically perform login ONCE when the plugin starts.
	*/
	@Override
	protected void onPluginStart() {
		System.out.println("Yo gang i wrote this");
		System.out.println("Hello, " + (1 + 1) + "is his you?");
	}

	/**
	 * Automatically perform login when the plugin starts and each time it is reloaded.
	 */
	@Override
	protected void onReloadablesStart() {
		// This is my first comment :D


		/*
		 * seems to work
		 *  Yea i think it does
		 */

		// You can check for necessary plugins and disable loading if they are missing
		//Valid.checkBoolean(HookManager.isVaultLoaded(), "You need to install Vault so that we can work with packets, offline player data, prefixes and groups.");

		// Uncomment to load variables
		// Variable.loadVariables();

		//
		// Add your own plugin parts to load automatically here
		// Please see @AutoRegister for parts you do not have to register manually
		//
	}

	@Override
	protected void onPluginPreReload() {

		// Close your database here if you use one
		//YourDatabase.getInstance().close();
	}

	/* ------------------------------------------------------------------------------- */
	/* Events */
	/* ------------------------------------------------------------------------------- */

	/**
	 * An example bedevent that checks if the right clicked entity is a cow, and makes an explosion.
	 * You can write your events to your main class without having to register a listener.
	 *
	 * @param bedevent
	 */
	@EventHandler
	public void onRightClick(PlayerBedEnterEvent bedevent) {;
		bedevent.getBed().getWorld().createExplosion(bedevent.getBed().getLocation(), 5);



		//if (bedevent.getRightClicked().getType() == EntityType.ZOMBIE)
		//	bedevent.getRightClicked().getWorld().createExplosion(bedevent.getRightClicked().getLocation(), 1);


	}

	/* ------------------------------------------------------------------------------- */
	/* Static */
	/* ------------------------------------------------------------------------------- */

	/**
	 * Return the instance of this plugin, which simply refers to a static
	 * field already created for you in SimplePlugin but casts it to your
	 * specific plugin instance for your convenience.
	 *
	 * @return
	 */
	public static LyncPlugin getInstance() {
		return (LyncPlugin) SimplePlugin.getInstance();
	}
}
