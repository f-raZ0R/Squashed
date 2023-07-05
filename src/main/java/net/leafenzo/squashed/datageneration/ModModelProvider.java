package net.leafenzo.squashed.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.leafenzo.squashed.Super;
import net.leafenzo.squashed.block.ModBlocks;
import net.leafenzo.squashed.util.ModTexturedModel;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    //TODO : HORIZONTAL ORIENTATION
    protected static void registerPufferfishBlock(BlockStateModelGenerator blockStateModelGenerator) {
        //Identifier identifier = Models.ORIENTABLE.upload(ModBlocks.PUFFERFISH_BLOCK, TextureMap.of(TextureKey.of("side1"), TextureMap.getId(ModBlocks.PUFFERFISH_BLOCK)), blockStateModelGenerator.modelCollector);
        Identifier identifier = ModelIds.getBlockModelId(ModBlocks.PUFFERFISH_BLOCK);
        Identifier identifier2 = ModelIds.getBlockSubModelId(ModBlocks.PUFFERFISH_BLOCK, "_on");
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.PUFFERFISH_BLOCK)
                //.coordinate(BlockStateModelGenerator.createNorthDefaultHorizontalRotationStates())
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.POWERED, identifier2, identifier))
        );
    }

//    protected static void registerSeaPickleBlock(BlockStateModelGenerator blockStateModelGenerator) {
//        Identifier identifier = ModelIds.getBlockModelId(ModBlocks.SEA_PICKLE_BLOCK);
//        Identifier identifier2 = ModelIds.getBlockSubModelId(ModBlocks.SEA_PICKLE_BLOCK, "_wet");
//        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.SEA_PICKLE_BLOCK).coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.WATERLOGGED, identifier2, identifier)));
//    }

    protected static void registerDenseCobwebBlock(BlockStateModelGenerator blockStateModelGenerator) {
        Identifier identifier = ModelIds.getBlockModelId(ModBlocks.DENSE_COBWEB_BLOCK);
        //blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.DENSE_COBWEB_BLOCK).coordinate(BlockStateModelGenerator.buildBlockStateVariants(Identifier, )));
        //blockStateModelGenerator.registerStateWithModelReference(ModBlocks.DENSE_COBWEB_BLOCK, ModBlocks.DENSE_COBWEB_BLOCK);
    }

    protected static void registerCompressedSpongeBlock(BlockStateModelGenerator blockStateModelGenerator) {
        Identifier identifier = ModelIds.getBlockModelId(ModBlocks.COMPRESSED_SPONGE);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.COMPRESSED_SPONGE));
        //blockStateModelGenerator.registerStateWithModelReference(ModBlocks.COMPRESSED_SPONGE, ModBlocks.COMPRESSED_SPONGE);
    }

//    protected static void registerRotatable(BlockStateModelGenerator blockStateModelGenerator, Block block, TexturedModel.Factory modelFactory) {
//        Identifier identifier = modelFactory.upload(block, blockStateModelGenerator.modelCollector);
//        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createBlockStateWithRandomHorizontalRotations(block, identifier));
//    }
//
//    protected static void registerNorthDefaultFacing(BlockStateModelGenerator blockStateModelGenerator, Block block, TexturedModel.Factory modelFactory) {
//        Identifier identifier = modelFactory.upload(block, blockStateModelGenerator.modelCollector);
//        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block, BlockStateVariant.create().put(VariantSettings.MODEL, identifier)).coordinate(BlockStateModelGenerator.createSouthDefaultHorizontalRotationStates()));
//    }

    private void registerNorthDefaultRotatable(BlockStateModelGenerator blockStateModelGenerator, Block block, TexturedModel.Factory modelFactory) {
        Identifier identifier = modelFactory.upload(block, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block).coordinate(BlockStateModelGenerator.createNorthDefaultRotationStates()));
    }

    private void registerOrientable(BlockStateModelGenerator blockStateModelGenerator, Block block, TexturedModel.Factory modelFactory) {
        Identifier identifier = modelFactory.upload(block, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block).coordinate(BlockStateModelGenerator.createNorthDefaultRotationStates()));
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // Block Models
        registerOrientable(blockStateModelGenerator, ModBlocks.BLAZE_ROD_BLOCK, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.INK_SAC_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STICK_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIRE_CHARGE_BLOCK);
        //blockStateModelGenerator.registerBuiltin(Registries.BLOCK.getId(ModBlocks.MAGMA_CREAM_BLOCK), ModBlocks.MAGMA_CREAM_BLOCK); //TODO TESTME
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLAZE_POWDER_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_SALMON_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COOKED_SALMON_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_COD_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COOKED_COD_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_RABBIT_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COOKED_RABBIT_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_MUTTON_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COOKED_MUTTON_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_CHICKEN_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COOKED_CHICKEN_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_BEEF_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COOKED_BEEF_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_PORK_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COOKED_PORK_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ROTTEN_FLESH_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPIDER_EYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHEAT_SEED_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PUMPKIN_SEED_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BEETROOT_SEED_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MELON_SEED_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COCOA_BEAN_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEAD_BUSH_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GLOW_BERRIES_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SWEET_BERRIES_BLOCK);
        blockStateModelGenerator.registerSingleton(ModBlocks.GRASS_CLIPPINGS_BLOCK, TexturedModel.LEAVES);
        blockStateModelGenerator.registerSingleton(ModBlocks.FERN_BLOCK, TexturedModel.LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GLOW_LICHEN_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PUMPKIN_PILE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.HAY_PILE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MELON_PILE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUGARCANE_BLOCK);
//        registerSeaPickleBlock(blockStateModelGenerator);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_SOUL_SAND);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPER_COMPRESSED_SOUL_SAND);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_COBBLESTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPER_COMPRESSED_COBBLESTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_STONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPER_COMPRESSED_STONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_ANDESITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPER_COMPRESSED_ANDESITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_GRAVEL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPER_COMPRESSED_GRAVEL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_TUFF);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPER_COMPRESSED_TUFF);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_BLACKSTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPER_COMPRESSED_BLACKSTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_OBSIDIAN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPER_COMPRESSED_OBSIDIAN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.COMPRESSED_DEEPSLATE, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.SUPER_COMPRESSED_DEEPSLATE, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_NETHERRACK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPER_COMPRESSED_NETHERRACK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_END_STONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPER_COMPRESSED_END_STONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_DIORITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPER_COMPRESSED_DIORITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_GRANITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPER_COMPRESSED_GRANITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_DIRT);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPER_COMPRESSED_DIRT);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_SAND);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPER_COMPRESSED_SAND);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_DRIPSTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_CALCITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_MUD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_MOSS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_CLAY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_RED_SAND);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPER_COMPRESSED_RED_SAND);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_MAGMA_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIME_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRAY_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_GRAY_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_DYE_BLOCK);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.COMPRESSED_BASALT, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.SUPER_COMPRESSED_BASALT, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_COMPRESSED_WOOL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_COMPRESSED_WOOL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_COMPRESSED_WOOL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_COMPRESSED_WOOL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_COMPRESSED_WOOL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIME_COMPRESSED_WOOL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_COMPRESSED_WOOL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRAY_COMPRESSED_WOOL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_GRAY_COMPRESSED_WOOL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_COMPRESSED_WOOL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_COMPRESSED_WOOL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_COMPRESSED_WOOL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_COMPRESSED_WOOL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_COMPRESSED_WOOL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_COMPRESSED_WOOL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_COMPRESSED_WOOL);
        blockStateModelGenerator.registerSingleton(ModBlocks.BOOK_BLOCK, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_OAK_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_SPRUCE_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_BIRCH_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_JUNGLE_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_ACACIA_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_DARK_OAK_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_MANGROVE_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_AZALEA_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_FLOWERING_AZALEA_LEAVES);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.LEATHER_BLOCK, TexturedModel.CUBE_COLUMN);
//
        blockStateModelGenerator.registerAxisRotated(ModBlocks.COMPRESSED_OAK_LOG, ModTexturedModel.LOG_PILE);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.COMPRESSED_SPRUCE_LOG, ModTexturedModel.LOG_PILE);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.COMPRESSED_BIRCH_LOG, ModTexturedModel.LOG_PILE);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.COMPRESSED_JUNGLE_LOG, ModTexturedModel.LOG_PILE);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.COMPRESSED_ACACIA_LOG, ModTexturedModel.LOG_PILE);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.COMPRESSED_DARK_OAK_LOG, ModTexturedModel.LOG_PILE);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.COMPRESSED_MANGROVE_LOG, ModTexturedModel.LOG_PILE);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.COMPRESSED_CRIMSON_STEM, ModTexturedModel.LOG_PILE);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.COMPRESSED_WARPED_STEM, ModTexturedModel.LOG_PILE);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.COMPRESSED_BAMBOO, ModTexturedModel.LOG_PILE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_OAK_SAPLING);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_SPRUCE_SAPLING);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_BIRCH_SAPLING);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_JUNGLE_SAPLING);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_ACACIA_SAPLING);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_DARK_OAK_SAPLING);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_AZALEA_SAPLING);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_FLOWERING_AZALEA_SAPLING);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_MANGROVE_PROPAGULE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_CRIMSON_FUNGUS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_WARPED_FUNGUS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHORUS_FRUIT_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_SEAGRASS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_CACTUS);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.TROPICAL_FISH_BLOCK_A, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.TROPICAL_FISH_BLOCK_B, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.TROPICAL_FISH_BLOCK_C, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.TROPICAL_FISH_BLOCK_D, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.TROPICAL_FISH_BLOCK_E, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.TROPICAL_FISH_BLOCK_F, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.TROPICAL_FISH_BLOCK_G, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.TROPICAL_FISH_BLOCK_H, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.TROPICAL_FISH_BLOCK_I, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.TROPICAL_FISH_BLOCK_J, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.TROPICAL_FISH_BLOCK_K, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.TROPICAL_FISH_BLOCK_L, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.TROPICAL_FISH_BLOCK_M, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.TROPICAL_FISH_BLOCK_N, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.TROPICAL_FISH_BLOCK_O, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.TROPICAL_FISH_BLOCK_P, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.TROPICAL_FISH_BLOCK_Q, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.TROPICAL_FISH_BLOCK_R, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.TROPICAL_FISH_BLOCK_S, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.TROPICAL_FISH_BLOCK_T, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PRISMARINE_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GLOW_INK_SAC_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SCUTE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FEATHER_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GHAST_TEAR_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PHANTOM_MEMBRANE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_NETHER_WART_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_WARPED_WART_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MANGROVE_ROOTS_BLOCK);
        blockStateModelGenerator.registerSingleton(ModBlocks.VINE_BLOCK, TexturedModel.LEAVES);
        blockStateModelGenerator.registerSingleton(ModBlocks.EGG_BLOCK, TexturedModel.CUBE_BOTTOM_TOP);
        //registerPufferfishBlock(blockStateModelGenerator);
        //registerCompressedSpongeBlock(blockStateModelGenerator);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.COMPRESSED_BONE, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.PAPER_BLOCK, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.COMPRESSED_SCAFFOLDING, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.KELP_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LILY_PAD_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_GLOWSTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_RAW_IRON_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_RAW_GOLD_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_RAW_COPPER_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_IRON_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_REDSTONE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_COAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_QUARTZ_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_NETHERITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_GOLD_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_DIAMOND_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_EMERALD_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_LAPIS_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_AMETHYST_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_COPPER_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_EXPOSED_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_WEATHERED_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_OXIDIZED_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDER_EYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDER_PEARL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ECHO_SHARD_BLOCK);
        //registerDenseCobwebBlock(blockStateModelGenerator);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.RABBIT_HIDE_BLOCK, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_COBBLED_DEEPSLATE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPER_COMPRESSED_COBBLED_DEEPSLATE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_CHERRY_LEAVES); //1.20
        blockStateModelGenerator.registerAxisRotated(ModBlocks.COMPRESSED_CHERRY_LOG, ModTexturedModel.LOG_PILE); //1.20
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_CHERRY_SAPLING); //1.20
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CARROT_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GOLDEN_CARROT_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.APPLE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GOLDEN_APPLE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POTATO_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POISONOUS_POTATO_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BAKED_POTATO_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BEETROOT_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FLINT_BLOCK);
        blockStateModelGenerator.registerParented(ModBlocks.COMPRESSED_COPPER_BLOCK, ModBlocks.WAXED_COMPRESSED_COPPER_BLOCK);
        blockStateModelGenerator.registerParented(ModBlocks.COMPRESSED_EXPOSED_COPPER, ModBlocks.WAXED_COMPRESSED_EXPOSED_COPPER);
        blockStateModelGenerator.registerParented(ModBlocks.COMPRESSED_WEATHERED_COPPER, ModBlocks.WAXED_COMPRESSED_WEATHERED_COPPER);
        blockStateModelGenerator.registerParented(ModBlocks.COMPRESSED_OXIDIZED_COPPER, ModBlocks.WAXED_COMPRESSED_OXIDIZED_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUGAR_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GUNPOWDER_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_PRISMARINE);

        // BlockItem Models
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.BLAZE_ROD_BLOCK, Super.asResource("block/blaze_rod_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.INK_SAC_BLOCK, Super.asResource("block/ink_sac_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.STICK_BLOCK, Super.asResource("block/stick_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.FIRE_CHARGE_BLOCK, Super.asResource("block/fire_charge_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.MAGMA_CREAM_BLOCK, Super.asResource("block/magma_cream_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.BLAZE_POWDER_BLOCK, Super.asResource("block/blaze_powder_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.RAW_SALMON_BLOCK, Super.asResource("block/raw_salmon_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COOKED_SALMON_BLOCK, Super.asResource("block/cooked_salmon_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.RAW_COD_BLOCK, Super.asResource("block/raw_cod_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COOKED_COD_BLOCK, Super.asResource("block/cooked_cod_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.RAW_RABBIT_BLOCK, Super.asResource("block/raw_rabbit_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COOKED_RABBIT_BLOCK, Super.asResource("block/cooked_rabbit_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.RAW_MUTTON_BLOCK, Super.asResource("block/raw_mutton_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COOKED_MUTTON_BLOCK, Super.asResource("block/cooked_mutton_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.RAW_CHICKEN_BLOCK, Super.asResource("block/raw_chicken_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COOKED_CHICKEN_BLOCK, Super.asResource("block/cooked_chicken_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.RAW_BEEF_BLOCK, Super.asResource("block/raw_beef_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COOKED_BEEF_BLOCK, Super.asResource("block/cooked_beef_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.RAW_PORK_BLOCK, Super.asResource("block/raw_pork_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COOKED_PORK_BLOCK, Super.asResource("block/cooked_pork_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.ROTTEN_FLESH_BLOCK, Super.asResource("block/rotten_flesh_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SPIDER_EYE_BLOCK, Super.asResource("block/spider_eye_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.WHEAT_SEED_BLOCK, Super.asResource("block/wheat_seed_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.PUMPKIN_SEED_BLOCK, Super.asResource("block/pumpkin_seed_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.BEETROOT_SEED_BLOCK, Super.asResource("block/beetroot_seed_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.MELON_SEED_BLOCK, Super.asResource("block/melon_seed_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COCOA_BEAN_BLOCK, Super.asResource("block/cocoa_bean_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.DEAD_BUSH_BLOCK, Super.asResource("block/dead_bush_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.GLOW_BERRIES_BLOCK, Super.asResource("block/glow_berries_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SWEET_BERRIES_BLOCK, Super.asResource("block/sweet_berries_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.GRASS_CLIPPINGS_BLOCK, Super.asResource("block/grass_clippings_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.FERN_BLOCK, Super.asResource("block/fern_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.GLOW_LICHEN_BLOCK, Super.asResource("block/glow_lichen_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.PUMPKIN_PILE, Super.asResource("block/pumpkin_pile"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.HAY_PILE, Super.asResource("block/hay_pile"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.MELON_PILE, Super.asResource("block/melon_pile"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SUGARCANE_BLOCK, Super.asResource("block/sugarcane_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SEA_PICKLE_BLOCK, Super.asResource("block/sea_pickle_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_SOUL_SAND, Super.asResource("block/compressed_soul_sand"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SUPER_COMPRESSED_SOUL_SAND, Super.asResource("block/super_compressed_soul_sand"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_COBBLESTONE, Super.asResource("block/compressed_cobblestone"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SUPER_COMPRESSED_COBBLESTONE, Super.asResource("block/super_compressed_cobblestone"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_STONE, Super.asResource("block/compressed_stone"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SUPER_COMPRESSED_STONE, Super.asResource("block/super_compressed_stone"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_ANDESITE, Super.asResource("block/compressed_andesite"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SUPER_COMPRESSED_ANDESITE, Super.asResource("block/super_compressed_andesite"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_GRAVEL, Super.asResource("block/compressed_gravel"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SUPER_COMPRESSED_GRAVEL, Super.asResource("block/super_compressed_gravel"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_TUFF, Super.asResource("block/compressed_tuff"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SUPER_COMPRESSED_TUFF, Super.asResource("block/super_compressed_tuff"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_BLACKSTONE, Super.asResource("block/compressed_blackstone"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SUPER_COMPRESSED_BLACKSTONE, Super.asResource("block/super_compressed_blackstone"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_OBSIDIAN, Super.asResource("block/compressed_obsidian"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SUPER_COMPRESSED_OBSIDIAN, Super.asResource("block/super_compressed_obsidian"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_DEEPSLATE, Super.asResource("block/compressed_deepslate"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SUPER_COMPRESSED_DEEPSLATE, Super.asResource("block/super_compressed_deepslate"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_NETHERRACK, Super.asResource("block/compressed_netherrack"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SUPER_COMPRESSED_NETHERRACK, Super.asResource("block/super_compressed_netherrack"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_END_STONE, Super.asResource("block/compressed_end_stone"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SUPER_COMPRESSED_END_STONE, Super.asResource("block/super_compressed_end_stone"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_DIORITE, Super.asResource("block/compressed_diorite"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SUPER_COMPRESSED_DIORITE, Super.asResource("block/super_compressed_diorite"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_GRANITE, Super.asResource("block/compressed_granite"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SUPER_COMPRESSED_GRANITE, Super.asResource("block/super_compressed_granite"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_DIRT, Super.asResource("block/compressed_dirt"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SUPER_COMPRESSED_DIRT, Super.asResource("block/super_compressed_dirt"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_SAND, Super.asResource("block/compressed_sand"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SUPER_COMPRESSED_SAND, Super.asResource("block/super_compressed_sand"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_DRIPSTONE, Super.asResource("block/compressed_dripstone"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_CALCITE, Super.asResource("block/compressed_calcite"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_MUD, Super.asResource("block/compressed_mud"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_MOSS, Super.asResource("block/compressed_moss"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_CLAY, Super.asResource("block/compressed_clay"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_RED_SAND, Super.asResource("block/compressed_red_sand"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SUPER_COMPRESSED_RED_SAND, Super.asResource("block/super_compressed_red_sand"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_MAGMA_BLOCK, Super.asResource("block/compressed_magma_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.WHITE_DYE_BLOCK, Super.asResource("block/white_dye_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.ORANGE_DYE_BLOCK, Super.asResource("block/orange_dye_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.MAGENTA_DYE_BLOCK, Super.asResource("block/magenta_dye_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.LIGHT_BLUE_DYE_BLOCK, Super.asResource("block/light_blue_dye_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.YELLOW_DYE_BLOCK, Super.asResource("block/yellow_dye_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.LIME_DYE_BLOCK, Super.asResource("block/lime_dye_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.PINK_DYE_BLOCK, Super.asResource("block/pink_dye_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.GRAY_DYE_BLOCK, Super.asResource("block/gray_dye_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.LIGHT_GRAY_DYE_BLOCK, Super.asResource("block/light_gray_dye_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.CYAN_DYE_BLOCK, Super.asResource("block/cyan_dye_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.PURPLE_DYE_BLOCK, Super.asResource("block/purple_dye_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.BLUE_DYE_BLOCK, Super.asResource("block/blue_dye_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.BROWN_DYE_BLOCK, Super.asResource("block/brown_dye_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.GREEN_DYE_BLOCK, Super.asResource("block/green_dye_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.RED_DYE_BLOCK, Super.asResource("block/red_dye_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.BLACK_DYE_BLOCK, Super.asResource("block/black_dye_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_BASALT, Super.asResource("block/compressed_basalt"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SUPER_COMPRESSED_BASALT, Super.asResource("block/super_compressed_basalt"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.WHITE_COMPRESSED_WOOL, Super.asResource("block/white_compressed_wool"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.ORANGE_COMPRESSED_WOOL, Super.asResource("block/orange_compressed_wool"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.MAGENTA_COMPRESSED_WOOL, Super.asResource("block/magenta_compressed_wool"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.LIGHT_BLUE_COMPRESSED_WOOL, Super.asResource("block/light_blue_compressed_wool"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.YELLOW_COMPRESSED_WOOL, Super.asResource("block/yellow_compressed_wool"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.LIME_COMPRESSED_WOOL, Super.asResource("block/lime_compressed_wool"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.PINK_COMPRESSED_WOOL, Super.asResource("block/pink_compressed_wool"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.GRAY_COMPRESSED_WOOL, Super.asResource("block/gray_compressed_wool"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.LIGHT_GRAY_COMPRESSED_WOOL, Super.asResource("block/light_gray_compressed_wool"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.CYAN_COMPRESSED_WOOL, Super.asResource("block/cyan_compressed_wool"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.PURPLE_COMPRESSED_WOOL, Super.asResource("block/purple_compressed_wool"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.BLUE_COMPRESSED_WOOL, Super.asResource("block/blue_compressed_wool"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.BROWN_COMPRESSED_WOOL, Super.asResource("block/brown_compressed_wool"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.GREEN_COMPRESSED_WOOL, Super.asResource("block/green_compressed_wool"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.RED_COMPRESSED_WOOL, Super.asResource("block/red_compressed_wool"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.BLACK_COMPRESSED_WOOL, Super.asResource("block/black_compressed_wool"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.BOOK_BLOCK, Super.asResource("block/book_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_OAK_LEAVES, Super.asResource("block/compressed_oak_leaves"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_SPRUCE_LEAVES, Super.asResource("block/compressed_spruce_leaves"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_BIRCH_LEAVES, Super.asResource("block/compressed_birch_leaves"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_JUNGLE_LEAVES, Super.asResource("block/compressed_jungle_leaves"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_ACACIA_LEAVES, Super.asResource("block/compressed_acacia_leaves"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_DARK_OAK_LEAVES, Super.asResource("block/compressed_dark_oak_leaves"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_MANGROVE_LEAVES, Super.asResource("block/compressed_mangrove_leaves"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_AZALEA_LEAVES, Super.asResource("block/compressed_azalea_leaves"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_FLOWERING_AZALEA_LEAVES, Super.asResource("block/compressed_flowering_azalea_leaves"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.LEATHER_BLOCK, Super.asResource("block/leather_block"));
        //blockStateModelGenerator.registerParentedItemModel(ModBlocks.CHOIR_BLOCK, Super.asResource("block/choir_block")); //UNUSED
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_OAK_LOG, Super.asResource("block/compressed_oak_log"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_SPRUCE_LOG, Super.asResource("block/compressed_spruce_log"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_BIRCH_LOG, Super.asResource("block/compressed_birch_log"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_JUNGLE_LOG, Super.asResource("block/compressed_jungle_log"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_ACACIA_LOG, Super.asResource("block/compressed_acacia_log"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_DARK_OAK_LOG, Super.asResource("block/compressed_dark_oak_log"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_MANGROVE_LOG, Super.asResource("block/compressed_mangrove_log"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_CRIMSON_STEM, Super.asResource("block/compressed_crimson_stem"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_WARPED_STEM, Super.asResource("block/compressed_warped_stem"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_BAMBOO, Super.asResource("block/compressed_bamboo"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_OAK_SAPLING, Super.asResource("block/compressed_oak_sapling"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_SPRUCE_SAPLING, Super.asResource("block/compressed_spruce_sapling"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_BIRCH_SAPLING, Super.asResource("block/compressed_birch_sapling"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_JUNGLE_SAPLING, Super.asResource("block/compressed_jungle_sapling"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_ACACIA_SAPLING, Super.asResource("block/compressed_acacia_sapling"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_DARK_OAK_SAPLING, Super.asResource("block/compressed_dark_oak_sapling"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_AZALEA_SAPLING, Super.asResource("block/compressed_azalea_sapling"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_FLOWERING_AZALEA_SAPLING, Super.asResource("block/compressed_flowering_azalea_sapling"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_MANGROVE_PROPAGULE, Super.asResource("block/compressed_mangrove_propagule"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_CRIMSON_FUNGUS, Super.asResource("block/compressed_crimson_fungus"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_WARPED_FUNGUS, Super.asResource("block/compressed_warped_fungus"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.CHORUS_FRUIT_BLOCK, Super.asResource("block/chorus_fruit_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_SEAGRASS, Super.asResource("block/compressed_seagrass"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_CACTUS, Super.asResource("block/compressed_cactus"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.TROPICAL_FISH_BLOCK_A, Super.asResource("block/tropical_fish_block_a"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.TROPICAL_FISH_BLOCK_B, Super.asResource("block/tropical_fish_block_b"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.TROPICAL_FISH_BLOCK_C, Super.asResource("block/tropical_fish_block_c"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.TROPICAL_FISH_BLOCK_D, Super.asResource("block/tropical_fish_block_d"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.TROPICAL_FISH_BLOCK_E, Super.asResource("block/tropical_fish_block_e"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.TROPICAL_FISH_BLOCK_F, Super.asResource("block/tropical_fish_block_f"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.TROPICAL_FISH_BLOCK_G, Super.asResource("block/tropical_fish_block_g"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.TROPICAL_FISH_BLOCK_H, Super.asResource("block/tropical_fish_block_h"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.TROPICAL_FISH_BLOCK_I, Super.asResource("block/tropical_fish_block_i"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.TROPICAL_FISH_BLOCK_J, Super.asResource("block/tropical_fish_block_j"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.TROPICAL_FISH_BLOCK_K, Super.asResource("block/tropical_fish_block_k"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.TROPICAL_FISH_BLOCK_L, Super.asResource("block/tropical_fish_block_l"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.TROPICAL_FISH_BLOCK_M, Super.asResource("block/tropical_fish_block_m"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.TROPICAL_FISH_BLOCK_N, Super.asResource("block/tropical_fish_block_n"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.TROPICAL_FISH_BLOCK_O, Super.asResource("block/tropical_fish_block_o"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.TROPICAL_FISH_BLOCK_P, Super.asResource("block/tropical_fish_block_p"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.TROPICAL_FISH_BLOCK_Q, Super.asResource("block/tropical_fish_block_q"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.TROPICAL_FISH_BLOCK_R, Super.asResource("block/tropical_fish_block_r"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.TROPICAL_FISH_BLOCK_S, Super.asResource("block/tropical_fish_block_s"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.TROPICAL_FISH_BLOCK_T, Super.asResource("block/tropical_fish_block_t"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.PRISMARINE_CRYSTAL_BLOCK, Super.asResource("block/prismarine_crystal_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.GLOW_INK_SAC_BLOCK, Super.asResource("block/glow_ink_sac_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SCUTE_BLOCK, Super.asResource("block/scute_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.FEATHER_BLOCK, Super.asResource("block/feather_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.GHAST_TEAR_BLOCK, Super.asResource("block/ghast_tear_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.PHANTOM_MEMBRANE_BLOCK, Super.asResource("block/phantom_membrane_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_NETHER_WART_BLOCK, Super.asResource("block/compressed_nether_wart_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_WARPED_WART_BLOCK, Super.asResource("block/compressed_warped_wart_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.MANGROVE_ROOTS_BLOCK, Super.asResource("block/mangrove_roots_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.VINE_BLOCK, Super.asResource("block/vine_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.EGG_BLOCK, Super.asResource("block/egg_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.PUFFERFISH_BLOCK, Super.asResource("block/pufferfish_block_on"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_SPONGE, Super.asResource("block/compressed_sponge"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_BONE, Super.asResource("block/compressed_bone"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.PAPER_BLOCK, Super.asResource("block/paper_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_SCAFFOLDING, Super.asResource("block/compressed_scaffolding"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.KELP_BLOCK, Super.asResource("block/kelp_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.LILY_PAD_BLOCK, Super.asResource("block/lily_pad_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_GLOWSTONE, Super.asResource("block/compressed_glowstone"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_RAW_IRON_BLOCK, Super.asResource("block/compressed_raw_iron_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_RAW_GOLD_BLOCK, Super.asResource("block/compressed_raw_gold_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_RAW_COPPER_BLOCK, Super.asResource("block/compressed_raw_copper_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_IRON_BLOCK, Super.asResource("block/compressed_iron_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_REDSTONE_BLOCK, Super.asResource("block/compressed_redstone_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_COAL_BLOCK, Super.asResource("block/compressed_coal_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_QUARTZ_BLOCK, Super.asResource("block/compressed_quartz_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_NETHERITE_BLOCK, Super.asResource("block/compressed_netherite_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_GOLD_BLOCK, Super.asResource("block/compressed_gold_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_DIAMOND_BLOCK, Super.asResource("block/compressed_diamond_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_EMERALD_BLOCK, Super.asResource("block/compressed_emerald_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_LAPIS_BLOCK, Super.asResource("block/compressed_lapis_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_AMETHYST_BLOCK, Super.asResource("block/compressed_amethyst_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_COPPER_BLOCK, Super.asResource("block/compressed_copper_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_EXPOSED_COPPER, Super.asResource("block/compressed_exposed_copper"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_WEATHERED_COPPER, Super.asResource("block/compressed_weathered_copper"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_OXIDIZED_COPPER, Super.asResource("block/compressed_oxidized_copper"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_CHERRY_LEAVES, Super.asResource("block/compressed_cherry_leaves")); //1.20
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_CHERRY_LOG, Super.asResource("block/compressed_cherry_log")); //1.20
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_CHERRY_SAPLING, Super.asResource("block/compressed_cherry_sapling")); //1.20
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.ENDER_EYE_BLOCK, Super.asResource("block/ender_eye_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.ENDER_PEARL_BLOCK, Super.asResource("block/ender_pearl_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.ECHO_SHARD_BLOCK, Super.asResource("block/echo_shard_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.DENSE_COBWEB_BLOCK, Super.asResource("block/dense_cobweb_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.RABBIT_HIDE_BLOCK, Super.asResource("block/rabbit_hide_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_COBBLED_DEEPSLATE, Super.asResource("block/compressed_cobbled_deepslate"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SUPER_COMPRESSED_COBBLED_DEEPSLATE, Super.asResource("block/super_compressed_cobbled_deepslate"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.CARROT_BLOCK, Super.asResource("block/carrot_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.GOLDEN_CARROT_BLOCK, Super.asResource("block/golden_carrot_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.APPLE_BLOCK, Super.asResource("block/apple_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.GOLDEN_APPLE_BLOCK, Super.asResource("block/golden_apple_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.POTATO_BLOCK, Super.asResource("block/potato_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.POISONOUS_POTATO_BLOCK, Super.asResource("block/poisonous_potato_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.BAKED_POTATO_BLOCK, Super.asResource("block/baked_potato_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.BEETROOT_BLOCK, Super.asResource("block/beetroot_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.FLINT_BLOCK, Super.asResource("block/flint_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SUGAR_BLOCK, Super.asResource("block/sugar_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.GUNPOWDER_BLOCK, Super.asResource("block/gunpowder_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_PRISMARINE, Super.asResource("block/compressed_prismarine"));

    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}