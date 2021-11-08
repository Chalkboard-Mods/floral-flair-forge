package chalkboardmods.floralflair.core;

import net.minecraftforge.common.ForgeConfigSpec;

public class FloralConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> pulsePetalDensity;
    public static final ForgeConfigSpec.ConfigValue<Integer> foxnipDensity;
    public static final ForgeConfigSpec.ConfigValue<Integer> fairyBlossomDensity;

    static {
        BUILDER.push("world generation");
        BUILDER.push("fairy blossom");
        fairyBlossomDensity = BUILDER.define("The density of Fairy Blossom flowers generating in flower forests", 4);
        BUILDER.pop();
        BUILDER.push("foxnip");
        foxnipDensity = BUILDER.define("The density of Foxnip flowers generating in taigas", 4);
        BUILDER.pop();
        BUILDER.push("pulse petal");
        pulsePetalDensity = BUILDER.define("The density of Pulse Petal flowers generating in forests", 6);
        BUILDER.pop();
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
