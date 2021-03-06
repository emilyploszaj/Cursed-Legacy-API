package io.github.minecraftcursedlegacy.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import io.github.minecraftcursedlegacy.impl.registry.ParentIdSetter;
import net.minecraft.item.PlaceableTileItem;

@Mixin(PlaceableTileItem.class)
public class MixinPlaceableTileItem implements ParentIdSetter {
	@Shadow
	private int field_2216;

	@Override
	public void setParentId(int id) {
		this.field_2216 = id;
	}
}
