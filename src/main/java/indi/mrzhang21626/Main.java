package indi.mrzhang21626;

import indi.mrzhang21626.items.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MODID)
public class Main {
    public static final String MODID = "salt";

    public Main() {
        Items.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
