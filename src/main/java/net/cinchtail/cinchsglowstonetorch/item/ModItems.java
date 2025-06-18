package net.cinchtail.cinchsglowstonetorch.item;

import net.cinchtail.cinchsglowstonetorch.CinchsGlowstoneTorch;
import net.cinchtail.cinchsglowstonetorch.block.ModBlocks;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CinchsGlowstoneTorch.MOD_ID);

    public static final RegistryObject<Item> GLOWSTONE_TORCH = ITEMS.register("glowstone_torch",
            () -> new ModStandingAndWallBlockItem(ModBlocks.GLOWSTONE_TORCH.get(), ModBlocks.GLOWSTONE_WALL_TORCH.get(),
                    new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
