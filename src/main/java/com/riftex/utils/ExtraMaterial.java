package com.riftex.utils;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public enum ExtraMaterial {

    WHITE_WOOL(new ItemStack(Material.WOOL, 1, DyeColor.WHITE.getData())),
    ORANGE_WOOL(new ItemStack(Material.WOOL, 1, DyeColor.ORANGE.getData())),
    MAGENTA_WOOL(new ItemStack(Material.WOOL, 1, DyeColor.MAGENTA.getData())),
    LIGHT_BLUE_WOOL(new ItemStack(Material.WOOL, 1, DyeColor.LIGHT_BLUE.getData())),
    YELLOW_WOOL(new ItemStack(Material.WOOL, 1, DyeColor.YELLOW.getData())),
    LIME_WOOL(new ItemStack(Material.WOOL, 1, DyeColor.LIME.getData())),
    PINK_WOOL(new ItemStack(Material.WOOL, 1, DyeColor.PINK.getData())),
    GRAY_WOOL(new ItemStack(Material.WOOL, 1, DyeColor.GRAY.getData())),
    LIGHT_GRAY_WOOL(new ItemStack(Material.WOOL, 1, DyeColor.SILVER.getData())),
    CYAN_WOOL(new ItemStack(Material.WOOL, 1, DyeColor.CYAN.getData())),
    PURPLE_WOOL(new ItemStack(Material.WOOL, 1, DyeColor.PURPLE.getData())),
    BLUE_WOOL(new ItemStack(Material.WOOL, 1, DyeColor.BLUE.getData())),
    BROWN_WOOL(new ItemStack(Material.WOOL, 1, DyeColor.BROWN.getData())),
    GREEN_WOOL(new ItemStack(Material.WOOL, 1, DyeColor.GREEN.getData())),
    RED_WOOL(new ItemStack(Material.WOOL, 1, DyeColor.RED.getData())),
    BLACK_WOOL(new ItemStack(Material.WOOL, 1, DyeColor.BLACK.getData())),

    // Stained Glass colors
    WHITE_STAINED_GLASS(new ItemStack(Material.STAINED_GLASS, 1, DyeColor.WHITE.getData())),
    ORANGE_STAINED_GLASS(new ItemStack(Material.STAINED_GLASS, 1, DyeColor.ORANGE.getData())),
    MAGENTA_STAINED_GLASS(new ItemStack(Material.STAINED_GLASS, 1, DyeColor.MAGENTA.getData())),
    LIGHT_BLUE_STAINED_GLASS(new ItemStack(Material.STAINED_GLASS, 1, DyeColor.LIGHT_BLUE.getData())),
    YELLOW_STAINED_GLASS(new ItemStack(Material.STAINED_GLASS, 1, DyeColor.YELLOW.getData())),
    LIME_STAINED_GLASS(new ItemStack(Material.STAINED_GLASS, 1, DyeColor.LIME.getData())),
    PINK_STAINED_GLASS(new ItemStack(Material.STAINED_GLASS, 1, DyeColor.PINK.getData())),
    GRAY_STAINED_GLASS(new ItemStack(Material.STAINED_GLASS, 1, DyeColor.GRAY.getData())),
    LIGHT_GRAY_STAINED_GLASS(new ItemStack(Material.STAINED_GLASS, 1, DyeColor.SILVER.getData())),
    CYAN_STAINED_GLASS(new ItemStack(Material.STAINED_GLASS, 1, DyeColor.CYAN.getData())),
    PURPLE_STAINED_GLASS(new ItemStack(Material.STAINED_GLASS, 1, DyeColor.PURPLE.getData())),
    BLUE_STAINED_GLASS(new ItemStack(Material.STAINED_GLASS, 1, DyeColor.BLUE.getData())),
    BROWN_STAINED_GLASS(new ItemStack(Material.STAINED_GLASS, 1, DyeColor.BROWN.getData())),
    GREEN_STAINED_GLASS(new ItemStack(Material.STAINED_GLASS, 1, DyeColor.GREEN.getData())),
    RED_STAINED_GLASS(new ItemStack(Material.STAINED_GLASS, 1, DyeColor.RED.getData())),
    BLACK_STAINED_GLASS(new ItemStack(Material.STAINED_GLASS, 1, DyeColor.BLACK.getData())),

    // Dye colors
    BLACK_DYE(new ItemStack(Material.INK_SACK, 1, DyeColor.BLACK.getDyeData())),
    GRAY_DYE(new ItemStack(Material.INK_SACK, 1, DyeColor.GRAY.getDyeData())),
    LIGHT_GRAY_DYE(new ItemStack(Material.INK_SACK, 1, DyeColor.SILVER.getDyeData())),
    WHITE_DYE(new ItemStack(Material.INK_SACK, 1, DyeColor.WHITE.getDyeData())),
    BROWN_DYE(new ItemStack(Material.INK_SACK, 1, DyeColor.BROWN.getDyeData())),
    RED_DYE(new ItemStack(Material.INK_SACK, 1, DyeColor.RED.getDyeData())),
    ORANGE_DYE(new ItemStack(Material.INK_SACK, 1, DyeColor.ORANGE.getDyeData())),
    YELLOW_DYE(new ItemStack(Material.INK_SACK, 1, DyeColor.YELLOW.getDyeData())),
    LIME_DYE(new ItemStack(Material.INK_SACK, 1, DyeColor.LIME.getDyeData())),
    GREEN_DYE(new ItemStack(Material.INK_SACK, 1, DyeColor.GREEN.getDyeData())),
    LIGHT_BLUE_DYE(new ItemStack(Material.INK_SACK, 1, DyeColor.LIGHT_BLUE.getDyeData())),
    CYAN_DYE(new ItemStack(Material.INK_SACK, 1, DyeColor.CYAN.getDyeData())),
    BLUE_DYE(new ItemStack(Material.INK_SACK, 1, DyeColor.BLUE.getDyeData())),
    PURPLE_DYE(new ItemStack(Material.INK_SACK, 1, DyeColor.PURPLE.getDyeData())),
    MAGENTA_DYE(new ItemStack(Material.INK_SACK, 1, DyeColor.MAGENTA.getDyeData())),
    PINK_DYE(new ItemStack(Material.INK_SACK, 1, DyeColor.PINK.getDyeData()));

    private final ItemStack itemStack;

    ExtraMaterial(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }
}
