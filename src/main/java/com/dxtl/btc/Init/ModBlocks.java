package com.dxtl.btc.Init;

import com.dxtl.btc.Blocks.CatfoodBlock;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final CatfoodBlock CATFOOD_BLOCK = new CatfoodBlock(
            "catfood_block"
    );
}
