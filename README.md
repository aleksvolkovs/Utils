# Utils API
Neat utils api for easier plugin development time in spigot.

# Adding to your project
All you need to do is download the jar from releases and then add it to your project or download the src code and compile your self then add.

# Using

# Initilizing
(i am using Lombok hence @Getter)
```java
private @Getter Utils utils;

@Override
public void onEnable() {
  utils = new Utils(this);    
}
```

# Chat
```java
Player player = ...; //In this case you would have a player
player.sendMessage(utils.getChat().format("&aThis is a chat message!"));
utils.getChat().sendActionBar(player, utils.getChat().format("&aWow!"));
utils.getChat().sendTitle(player, utils.getChat().format("&aThis is a title!"), utils.getChat().format("&aThis is a subtitle!"));
```

# Materials
```java
player.getInventory().addItem(ExtraMaterial.BLACK_WOOL.getItemStack());
```

this is it for now!
