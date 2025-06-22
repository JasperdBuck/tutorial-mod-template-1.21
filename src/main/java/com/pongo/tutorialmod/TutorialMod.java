package com.pongo.tutorialmod;

import com.pongo.tutorialmod.block.ModBlocks;
import com.pongo.tutorialmod.item.ModItems;
import com.pongo.tutorialmod.item.ModitemGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModitemGroups.registerModItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}