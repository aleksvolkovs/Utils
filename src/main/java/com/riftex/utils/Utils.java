package com.riftex.utils;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;

public class Utils {

    private final JavaPlugin plugin;
    private int taskId = -1;

    public Utils(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void tickTimeAndWeather(World world, long timeTicks, boolean isRaining) {
        taskId = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
            if (world != null) {
                world.setTime(timeTicks);
                world.setStorm(isRaining);
                world.setThundering(isRaining);
            } else {
                plugin.getLogger().warning("World '" + world.getName() + "' not found!");
            }
        }, 0L, 200L);
    }

    public void cancelTickTimeAndWeather(boolean cancel) {
        if (cancel) {
            Bukkit.getScheduler().cancelTask(taskId);
        }
    }

}
