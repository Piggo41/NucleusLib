package piggo.nucleuslib;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import piggo.nucleuslib.api.data.NucleusResourceReloader;
import piggo.nucleuslib.util.ItemUtils;

public class NucleusLib implements ModInitializer {

	public static final String MODID = "nucleuslib";

	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	public static final ItemGroup ELEMENTS_GROUP = FabricItemGroup.builder(new Identifier(NucleusLib.MODID, "elements"))
			.icon(() -> new ItemStack(ItemUtils.getItem(new Identifier(NucleusLib.MODID, "hydrogen"))))
			.build();

	public static final ItemGroup COMPOUNDS_GROUP = FabricItemGroup.builder(new Identifier(NucleusLib.MODID, "compounds"))
			.icon(() -> new ItemStack(ItemUtils.getItem(new Identifier(NucleusLib.MODID, "hydrogen"))))
			.build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}
