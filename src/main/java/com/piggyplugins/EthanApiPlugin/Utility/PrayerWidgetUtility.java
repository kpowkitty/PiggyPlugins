package com.piggyplugins.EthanApiPlugin.Utility;

import net.runelite.api.Prayer;

public class PrayerWidgetUtility {
    public static int getPrayerWidgetId(Prayer prayer) {
        switch (prayer) {
            case THICK_SKIN:
                return 35454985;
            case BURST_OF_STRENGTH:
                return 35454986;
            case CLARITY_OF_THOUGHT:
                return 35454987;
            case SHARP_EYE:
                return 35455003;
            case MYSTIC_WILL:
                return 35455006;
            case ROCK_SKIN:
                return 35454988;
            case SUPERHUMAN_STRENGTH:
                return 35454989;
            case IMPROVED_REFLEXES:
                return 35454990;
            case RAPID_RESTORE:
                return 35454991;
            case RAPID_HEAL:
                return 35454992;
            case PROTECT_ITEM:
                return 35454993;
            case HAWK_EYE:
                return 35455004;
            case MYSTIC_LORE:
                return 35455007;
            case STEEL_SKIN:
                return 35454994;
            case ULTIMATE_STRENGTH:
                return 35454995;
            case INCREDIBLE_REFLEXES:
                return 35454996;
            case PROTECT_FROM_MAGIC:
                return 35454997;
            case PROTECT_FROM_MISSILES:
                return 35454998;
            case PROTECT_FROM_MELEE:
                return 35454999;
            case EAGLE_EYE:
                return 35455005;
            case MYSTIC_MIGHT:
                return 35455008;
            case RETRIBUTION:
                return 35455000;
            case REDEMPTION:
                return 35455001;
            case SMITE:
                return 35455002;
            case CHIVALRY:
                return 35455010;
            case PIETY:
                return 35455011;
            case PRESERVE:
                return 35455013;
            case RIGOUR:
                return 35455009;
            case AUGURY:
                return 35455012;
        }
        return 35455008; // get smited idiot
    }
}