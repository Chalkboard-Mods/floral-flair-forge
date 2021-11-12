package chalkboardmods.floralflair.core;

import net.minecraftforge.common.ForgeConfigSpec;

public class FloralConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> pulsePetalDensity;
    public static final ForgeConfigSpec.ConfigValue<Integer> foxnipDensity;
    public static final ForgeConfigSpec.ConfigValue<Integer> fairyBlossomDensity;
    public static final ForgeConfigSpec.ConfigValue<Integer> jungleGemDensity;
    public static final ForgeConfigSpec.ConfigValue<Integer> roseDensity;
    public static final ForgeConfigSpec.ConfigValue<Integer> sunsetPoppyDensity;
    public static final ForgeConfigSpec.ConfigValue<Integer> muscariDensity;

    static {
        BUILDER.push("world generation");
        BUILDER.push("fairy blossom");
        fairyBlossomDensity = BUILDER.define("The density of Fairy Blossom flowers generating in flower forests", 3);
        BUILDER.pop();
        BUILDER.push("foxnip");
        foxnipDensity = BUILDER.define("The density of Foxnip flowers generating in taigas", 3);
        BUILDER.pop();
        BUILDER.push("pulse petal");
        pulsePetalDensity = BUILDER.define("The density of Pulse Petal flowers generating in forests", 6);
        BUILDER.pop();
        BUILDER.push("gem of the jungle");
        jungleGemDensity = BUILDER.define("The density of Gem of the Jungle flowers in jungles", 3);
        BUILDER.pop();
        BUILDER.push("rose");
        roseDensity = BUILDER.define("The density of Rose flowers in forests and plains", 3);
        BUILDER.pop();
        BUILDER.push("sunset poppy");
        sunsetPoppyDensity = BUILDER.define("The density of Sunset Poppy flowers in sunflower plains", 4);
        BUILDER.pop();
        BUILDER.push("muscari");
        muscariDensity = BUILDER.define("The density of Muscari flowers in snowy places", 4);
        BUILDER.pop();
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
