package dev.ftb.mods.ftbic.block.entity.machine;

import dev.ftb.mods.ftbic.FTBICConfig;
import dev.ftb.mods.ftbic.block.FTBICElectricBlocks;
import dev.ftb.mods.ftbic.recipe.MachineRecipeResults;
import dev.ftb.mods.ftbic.recipe.RecipeCache;
import dev.ftb.mods.ftbic.util.EnergyTier;

public class AntimatterConstructorBlockEntity extends MachineBlockEntity {
	public AntimatterConstructorBlockEntity() {
		super(FTBICElectricBlocks.ANTIMATTER_CONSTRUCTOR.blockEntity.get(), 1, 1);
	}

	@Override
	public void initProperties() {
		super.initProperties();
		inputEnergyTier = EnergyTier.EV;
		energyCapacity = FTBICConfig.ANTIMATTER_CONSTRUCTOR_CAPACITY;
		energyUse = FTBICConfig.ANTIMATTER_CONSTRUCTOR_USE;
	}

	@Override
	public MachineRecipeResults getRecipes(RecipeCache cache) {
		return cache.antimatterFabricator;
	}
}