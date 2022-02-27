package com.faboslav.friendsandfoes;

import com.faboslav.friendsandfoes.config.FriendsAndFoesConfig;
import com.faboslav.friendsandfoes.init.RegistryInit;
import com.faboslav.friendsandfoes.world.gen.feature.StructureFeature;
import draylar.omegaconfig.OmegaConfig;
import net.fabricmc.api.ModInitializer;

public class FriendsAndFoes implements ModInitializer
{
	public static final FriendsAndFoesConfig CONFIG = OmegaConfig.register(FriendsAndFoesConfig.class);

	@Override
	public void onInitialize() {
		RegistryInit.init();
		StructureFeature.init();
	}
}