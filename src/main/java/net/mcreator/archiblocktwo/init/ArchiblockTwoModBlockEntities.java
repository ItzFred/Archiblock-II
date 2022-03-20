
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.archiblocktwo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.archiblocktwo.block.entity.LCzBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCyBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCxBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCwBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCvBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCuBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCtBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCsBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCrBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCqBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCpBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCoBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCnBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCmBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LClBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCkBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCjBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCiBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LChBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCgBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCfBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCeBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCdBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCcBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCbBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.LCaBlockBlockEntity;
import net.mcreator.archiblocktwo.block.entity.ABlockBlockEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArchiblockTwoModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> A_BLOCK = register("archiblock_two:a_block", ArchiblockTwoModBlocks.A_BLOCK, ABlockBlockEntity::new);
	public static final BlockEntityType<?> L_CA_BLOCK = register("archiblock_two:l_ca_block", ArchiblockTwoModBlocks.L_CA_BLOCK,
			LCaBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CB_BLOCK = register("archiblock_two:l_cb_block", ArchiblockTwoModBlocks.L_CB_BLOCK,
			LCbBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CC_BLOCK = register("archiblock_two:l_cc_block", ArchiblockTwoModBlocks.L_CC_BLOCK,
			LCcBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CD_BLOCK = register("archiblock_two:l_cd_block", ArchiblockTwoModBlocks.L_CD_BLOCK,
			LCdBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CE_BLOCK = register("archiblock_two:l_ce_block", ArchiblockTwoModBlocks.L_CE_BLOCK,
			LCeBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CF_BLOCK = register("archiblock_two:l_cf_block", ArchiblockTwoModBlocks.L_CF_BLOCK,
			LCfBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CG_BLOCK = register("archiblock_two:l_cg_block", ArchiblockTwoModBlocks.L_CG_BLOCK,
			LCgBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CH_BLOCK = register("archiblock_two:l_ch_block", ArchiblockTwoModBlocks.L_CH_BLOCK,
			LChBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CI_BLOCK = register("archiblock_two:l_ci_block", ArchiblockTwoModBlocks.L_CI_BLOCK,
			LCiBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CJ_BLOCK = register("archiblock_two:l_cj_block", ArchiblockTwoModBlocks.L_CJ_BLOCK,
			LCjBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CK_BLOCK = register("archiblock_two:l_ck_block", ArchiblockTwoModBlocks.L_CK_BLOCK,
			LCkBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CL_BLOCK = register("archiblock_two:l_cl_block", ArchiblockTwoModBlocks.L_CL_BLOCK,
			LClBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CM_BLOCK = register("archiblock_two:l_cm_block", ArchiblockTwoModBlocks.L_CM_BLOCK,
			LCmBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CN_BLOCK = register("archiblock_two:l_cn_block", ArchiblockTwoModBlocks.L_CN_BLOCK,
			LCnBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CO_BLOCK = register("archiblock_two:l_co_block", ArchiblockTwoModBlocks.L_CO_BLOCK,
			LCoBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CP_BLOCK = register("archiblock_two:l_cp_block", ArchiblockTwoModBlocks.L_CP_BLOCK,
			LCpBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CQ_BLOCK = register("archiblock_two:l_cq_block", ArchiblockTwoModBlocks.L_CQ_BLOCK,
			LCqBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CR_BLOCK = register("archiblock_two:l_cr_block", ArchiblockTwoModBlocks.L_CR_BLOCK,
			LCrBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CS_BLOCK = register("archiblock_two:l_cs_block", ArchiblockTwoModBlocks.L_CS_BLOCK,
			LCsBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CT_BLOCK = register("archiblock_two:l_ct_block", ArchiblockTwoModBlocks.L_CT_BLOCK,
			LCtBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CU_BLOCK = register("archiblock_two:l_cu_block", ArchiblockTwoModBlocks.L_CU_BLOCK,
			LCuBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CV_BLOCK = register("archiblock_two:l_cv_block", ArchiblockTwoModBlocks.L_CV_BLOCK,
			LCvBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CW_BLOCK = register("archiblock_two:l_cw_block", ArchiblockTwoModBlocks.L_CW_BLOCK,
			LCwBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CX_BLOCK = register("archiblock_two:l_cx_block", ArchiblockTwoModBlocks.L_CX_BLOCK,
			LCxBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CY_BLOCK = register("archiblock_two:l_cy_block", ArchiblockTwoModBlocks.L_CY_BLOCK,
			LCyBlockBlockEntity::new);
	public static final BlockEntityType<?> L_CZ_BLOCK = register("archiblock_two:l_cz_block", ArchiblockTwoModBlocks.L_CZ_BLOCK,
			LCzBlockBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
