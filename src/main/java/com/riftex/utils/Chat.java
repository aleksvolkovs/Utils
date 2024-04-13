package com.riftex.utils;

import net.minecraft.server.v1_8_R3.EntityPlayer;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class Chat {

    private final Utils utils;

    public Chat(Utils utils) {
        this.utils = utils;
    }

    public String format(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public void sendActionBar(Player player, String message) {
        EntityPlayer nmsPlayer = ((CraftPlayer) player).getHandle();
        PacketPlayOutChat packet = new PacketPlayOutChat(IChatBaseComponent.ChatSerializer.a("{\"text\":\"" + message + "\"}"), (byte) 2);
        nmsPlayer.playerConnection.sendPacket(packet);
    }

    public void sendTitle(Player player, String title, String subTitle) {
        EntityPlayer nmsPlayer = ((CraftPlayer) player).getHandle();
        PacketPlayOutTitle titlePacket = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TITLE, IChatBaseComponent.ChatSerializer.a("{\"text\":\"" + title + "\"}"));
        PacketPlayOutTitle subTitlePacket = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.SUBTITLE, IChatBaseComponent.ChatSerializer.a("{\"text\":\"" + subTitle + "\"}"));
        nmsPlayer.playerConnection.sendPacket(titlePacket);
        nmsPlayer.playerConnection.sendPacket(subTitlePacket);
    }
}
