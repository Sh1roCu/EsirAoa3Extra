package cn.sh1rocu.esiraoa3extra.item.weapon.shotgun;

import net.minecraft.util.SoundEvent;
import net.tslat.aoa3.common.registration.AoASounds;

import javax.annotation.Nullable;

public class GingerBlaster extends BaseShotgun {
    public GingerBlaster(final double dmg, final int pellets, final int durability, final int fireDelayTicks, final float knockbackFactor, final float recoil) {
        super(dmg, pellets, durability, fireDelayTicks, knockbackFactor, recoil);
    }

    @Nullable
    @Override
    public SoundEvent getFiringSound() {
        return AoASounds.ITEM_GUN_SHOTGUN_HEAVY_FIRE_LONG.get();
    }
}
