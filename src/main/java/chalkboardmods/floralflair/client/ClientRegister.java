package chalkboardmods.floralflair.client;

import chalkboardmods.floralflair.core.FloralFlair;
import chalkboardmods.floralflair.core.registry.FloralBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = FloralFlair.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientRegister {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(ClientRegister::setupRenderLayer);
    }
    public static void setupRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer(FloralBlocks.FOXNIP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(FloralBlocks.FROSTED_FOXNIP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(FloralBlocks.PULSE_PETAL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(FloralBlocks.FAIRY_BLOSSOM.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(FloralBlocks.JUNGLE_GEM.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(FloralBlocks.ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(FloralBlocks.SUNSET_POPPY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(FloralBlocks.MUSCARI.get(), RenderType.cutout());



        ItemBlockRenderTypes.setRenderLayer(FloralBlocks.POTTED_FOXNIP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(FloralBlocks.POTTED_FROSTED_FOXNIP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(FloralBlocks.POTTED_PULSE_PETAL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(FloralBlocks.POTTED_JUNGLE_GEM.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(FloralBlocks.POTTED_ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(FloralBlocks.POTTED_SUNSET_POPPY.get(), RenderType.cutout());





    }
}
