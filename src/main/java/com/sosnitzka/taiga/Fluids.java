package com.sosnitzka.taiga;

import com.sosnitzka.taiga.generic.BasicTinkerFluid;
import net.minecraft.world.level.material.Fluid;

import java.util.LinkedHashMap;
import java.util.Map;

public final class Fluids {

    private Fluids() {
    }

    private static final Map<String, BasicTinkerFluid> FLUIDS = new LinkedHashMap<>();

    public static BasicTinkerFluid arcaniteFluid =
            create("arcanite", 0xFF272354, true, 538, 8, 3768);

    public static BasicTinkerFluid titaniteFluid =
            create("titanite", 0xFFe0ede7, true, 942, 7, 1858);

    public static BasicTinkerFluid adamantiteFluid =
            create("adamantite", 0xFFc45c82, true, 1100, 10, 3597);

    public static BasicTinkerFluid violiumFluid =
            create("violium", 0xFF264c4f, true, 875, 10, 3970);

    public static BasicTinkerFluid bismuthFluid =
            create("bismuth", 0xFF555555, true, 612, 9, 2552);

    public static BasicTinkerFluid eterniteFluid =
            create("eternite", 0xFFfafa98, true, 542, 10, 3980);

    public static BasicTinkerFluid ignititeFluid =
            create("ignitite", 0xFFff6642, true, 422, 9, 3787);

    public static BasicTinkerFluid karmesineFluid =
            create("karmesine", 0xFFc16d6d, true, 499, 7, 3978);

    public static BasicTinkerFluid meteoriteFluid =
            create("meteorite", 0xFF6e6a62, true, 942, 10, 2588);

    public static BasicTinkerFluid mindoriteFluid =
            create("mindorite", 0xFF6bbbff, true, 671, 8, 2956);

    public static BasicTinkerFluid mythrilFluid =
            create("mythril", 0xFFa8c0ba, true, 841, 10, 1579);

    public static BasicTinkerFluid palladiumFluid =
            create("palladium", 0xFFfe5c05, true, 786, 10, 3302);

    public static BasicTinkerFluid prometheumFluid =
            create("prometheum", 0xFF2b282f, true, 786, 2, 2256);

    public static BasicTinkerFluid tiberiumFluid =
            create("tiberium", 0xFF5f9e2d, true, 352, 10, 1553);

    public static BasicTinkerFluid vibraniumFluid =
            create("vibranium", 0xFFc4ddc8, true, 1050, 9, 3402);

    public static BasicTinkerFluid rubiumFluid =
            create("rubium", 0xFFe371b0, true, 200, 600, 1653);

    public static BasicTinkerFluid astriumFluid =
            create("astrium", 0xFF7a3b74, true, 810, 10, 1525);

    public static BasicTinkerFluid nitroniteFluid =
            create("nitronite", 0xFFdfe553, true, 680, 10, 2185);

    public static BasicTinkerFluid proxideumFluid =
            create("proxideum", 0xFF2f7177, true, 700, 9, 3859);

    public static BasicTinkerFluid noctunyxFluid =
            create("noctunyx", 0xFF5f5081, true, 712, 8, 3983);

    public static BasicTinkerFluid imperomiteFluid =
            create("imperomite", 0xFFff6642, true, 510, 10, 2353);

    public static BasicTinkerFluid cryptogenFluid =
            create("cryptogen", 0xFF9f8a4a, true, 560, 10, 3243);

    public static BasicTinkerFluid fractoryteFluid =
            create("fractoryte", 0xFF983f11, true, 670, 8, 3805);

    public static BasicTinkerFluid seismodiumFluid =
            create("seismodium", 0xFF46131D, true, 831, 10, 1837);

    public static BasicTinkerFluid terramiteFluid =
            create("terramite", 0xFFa6b27a, true, 687, 10, 2121);

    public static BasicTinkerFluid lumixylFluid =
            create("lumixyl", 0xFFfbe8cb, true, 548, 10, 2165);

    public static BasicTinkerFluid solariumFluid =
            create("solarium", 0xFFffc81d, true, 482, 8, 3232);

    public static BasicTinkerFluid dyoniteFluid =
            create("dyonite", 0xFFff6743, true, 486, 8, 3269);

    public static BasicTinkerFluid ultraniteFluid =
            create("ultranite", 0xFFf5f294, true, 941, 9, 1784);

    public static BasicTinkerFluid nucleumFluid =
            create("nucleum", 0xFFa8ea3b, true, 813, 10, 2355);

    public static BasicTinkerFluid aegisaltFluid =
            create("aegisalt", 0xFFb6af74, true, 660, 7, 2089);

    public static BasicTinkerFluid bysmuidFluid =
            create("bysmuid", 0xFF7b97b0, true, 560, 8, 2674);


    // Additional fluids

    public static BasicTinkerFluid radiant_enderium =
            create("radiant_enderium", 0xFFbcea5d, false, 529, 10, 768);

    public static BasicTinkerFluid glimming_enderium =
            create("glimming_enderium", 0xFFfffc98, false, 633, 10, 821);

    public static BasicTinkerFluid energy_enderium =
            create("energy_enderium", 0xFFffb498, false, 562, 10, 421);

    public static BasicTinkerFluid glimmercoalFluid =
            create("glimmercoal_fluid", 0xFFee7c28, false, 531, 10, 312);

    public static BasicTinkerFluid nitroFluid =
            create("nitro_fluid", 0xFF223512, false, 405, 5, 772);

    public static BasicTinkerFluid anthraciteFluid =
            create("anthracite_fluid", 0xFF111111, false, 500, 0, 632);

    public static BasicTinkerFluid spectrumFluid =
            create("spectrum_fluid", 0xFF64748f, false, 600, 0, 512);


    private static BasicTinkerFluid create(
            String name,
            int color,
            boolean toolForge,
            int temperature,
            int luminosity,
            int viscosity
    ) {
        BasicTinkerFluid fluid = new BasicTinkerFluid(
                name,
                color,
                toolForge,
                temperature,
                luminosity,
                viscosity
        );

        FLUIDS.put(name, fluid);
        return fluid;
    }

    public static Map<String, BasicTinkerFluid> getFluids() {
        return FLUIDS;
    }

    public static void register() {
        /*
         * Registration will be completed using Forge DeferredRegister.
         *
         * This is intentionally kept separate from the fluid definitions
         * so the old Taiga material list remains unchanged.
         */
    }

    public static Fluid get(String name) {
        return FLUIDS.get(name);
    }
}
