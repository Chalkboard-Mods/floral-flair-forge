package chalkboardmods.floralflair.core;

import chalkboardmods.floralflair.core.other.FloralCompat;
import com.teamabnormals.blueprint.core.util.registry.RegistryHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(FloralFlair.MOD_ID)
@Mod.EventBusSubscriber(modid = FloralFlair.MOD_ID)
public class FloralFlair {
    public static final String MOD_ID = "floral_flair";
    private static final Logger LOGGER = LogManager.getLogger();
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MOD_ID);

    public FloralFlair() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        REGISTRY_HELPER.register(bus);
        
        bus.addListener(FloralFlair::compatRegister);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static void compatRegister(FMLCommonSetupEvent event) {
        event.enqueueWork(FloralCompat::compatList);
    }
}