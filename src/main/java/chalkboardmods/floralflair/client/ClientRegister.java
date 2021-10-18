package chalkboardmods.floralflair.client;

import chalkboardmods.floralflair.core.FloralFlair;
import chalkboardmods.floralflair.core.registry.FloralBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = FloralFlair.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientRegister {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            setupRenderLayer();
        });
    }
    public static void setupRenderLayer() {
        RenderTypeLookup.setRenderLayer(FloralBlocks.FOXNIP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(FloralBlocks.FROSTED_FOXNIP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(FloralBlocks.PULSE_PETAL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(FloralBlocks.FAIRY_BLOSSOM.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(FloralBlocks.POTTED_FOXNIP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(FloralBlocks.POTTED_FROSTED_FOXNIP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(FloralBlocks.POTTED_PULSE_PETAL.get(), RenderType.cutout());



    }
}
