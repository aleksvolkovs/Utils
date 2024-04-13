# Utils API
Neat utils api for easier plugin development time in spigot.

# Adding to your project
All you need to do is download the jar from releases and then add it to your project or download the src code and compile your self then add.

# Using

### Initilizing
(i am using Lombok hence @Getter)
```java
private @Getter Utils utils;

@Override
public void onEnable() {
  utils = new Utils(this);    
}
```

### Chat
```java
Player player = ...; //In this case you would have a player
player.sendMessage(Chat.format("&aThis is a chat message!"));
player.sendMessage(Chat.format("&a" + ChatIcon.CHECKMARK));
Chat.sendActionBar(player, Chat.format("&aWow!"));
Chat.sendTitle(player, Chat.format("&aThis is a title!"), Chat.format("&aThis is a subtitle!"));
```

### Materials
```java
player.getInventory().addItem(ExtraMaterial.BLACK_WOOL.getItemStack());
```

### Weather
```java
//params are: world, timeTicks, isRaining
//world = get world.
//timeTicks = set world time.
//isRaining = if true then the world would be raining.
utils.tickTimeAndWeather(player.getWorld(), 6000, true);
utils.cancelTickTimeAndWeather(true);
```

this is it for now!
