package net.cinchtail.cinchsextratorches.block;

import net.cinchtail.cinchsextratorches.CinchsExtraTorches;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.level.block.Blocks.*;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CinchsExtraTorches.MOD_ID);

    public static final RegistryObject<Block> GLOWSTONE_TORCH = BLOCKS.register("glowstone_torch",
            () -> new GlowStoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(TORCH)
                    .noOcclusion().sound(SoundType.WOOD).instabreak().lightLevel((blockState) -> 9).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GLOWSTONE_WALL_TORCH = BLOCKS.register("glowstone_wall_torch",
            () -> new GlowStoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(TORCH)
                    .noOcclusion().sound(SoundType.WOOD).instabreak().lightLevel((blockState) -> 9).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> GLOW_INK_TORCH = BLOCKS.register("glow_ink_torch",
            () -> new GlowInkTorchBlock(BlockBehaviour.Properties.ofFullCopy(TORCH)
                                .noOcclusion().sound(SoundType.WOOD).instabreak().lightLevel((blockState) -> 7).sound(SoundType.WOOD), ParticleTypes.GLOW));
    public static final RegistryObject<Block> GLOW_INK_WALL_TORCH = BLOCKS.register("glow_ink_wall_torch",
            () -> new GlowInkWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(TORCH)
                    .noOcclusion().sound(SoundType.WOOD).instabreak().lightLevel((blockState) -> 7).sound(SoundType.WOOD),ParticleTypes.GLOW));


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}