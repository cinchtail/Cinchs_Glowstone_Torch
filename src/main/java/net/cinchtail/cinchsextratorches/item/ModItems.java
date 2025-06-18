package net.cinchtail.cinchsextratorches.item;

import net.cinchtail.cinchsextratorches.CinchsExtraTorches;
import net.cinchtail.cinchsextratorches.block.ModBlocks;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CinchsExtraTorches.MOD_ID);

    public static final RegistryObject<Item> GLOWSTONE_TORCH = ITEMS.register("glowstone_torch",
            () -> new ModStandingAndWallBlockItem(ModBlocks.GLOWSTONE_TORCH.get(), ModBlocks.GLOWSTONE_WALL_TORCH.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> GLOW_INK_TORCH = ITEMS.register("glow_ink_torch",
            () -> new ModStandingAndWallBlockItem(ModBlocks.GLOW_INK_TORCH.get(), ModBlocks.GLOW_INK_WALL_TORCH.get(),
                    new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
