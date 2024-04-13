package com.riftex.utils;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;

public final class Utils {

    private final JavaPlugin plugin;
    Chat chat;
    private int taskId = -1;

    public Utils(JavaPlugin plugin) {
        this.plugin = plugin;
        chat = new Chat(this);
    }

    public void tickTimeAndWeather(String worldName, long timeTicks, boolean isRaining) {
        taskId = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> setTimeAndWeather(worldName, timeTicks, isRaining), 0L, 200L);
    }

    public void cancelTickTimeAndWeather(boolean cancel) {
        if (cancel) {
            Bukkit.getScheduler().cancelTask(taskId);
        }
    }

    private void setTimeAndWeather(String worldName, long timeTicks, boolean isRaining) {
        World world = Bukkit.getWorld(worldName);
        if (world != null) {
            world.setTime(timeTicks);

            world.setStorm(isRaining);
            world.setThundering(isRaining);
        } else {
            System.out.println("World '" + worldName + "' not found!");
        }
    }

    public Chat getChat() {
        return chat;
    }

}
