package com.jadventure.game.menus;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Cage
 * Date: 05/11/13
 * Time: 08:39 PM
 * To change this template use File | Settings | File Templates.
 */
 
/**
 * Object representation of a menu option
 * Used in @see Menus
 */
public class MenuItem {
    /**
     * The displayed option string in Menu
     * Get it from @see #getKey() in its lowercase form for comparison
     */
    protected String command;
    
    /**
     * Biography of the command
     */
    protected String description;
    
    /**
     * The alternative commands that the user input can be matched to
     */
    protected Set<String> altCommands;

    /**
     * @param command @see #command
     * @param description @see #description
     */
    public MenuItem(String command, String description) {
        this.command = command;
        this.description = description;
        this.altCommands = new HashSet<String>();
    }
    
    /**
     * @param command @see #command
     * @param description @see #command
     * @param altCommands @see #altCommands
     */
    public MenuItem(String command, String description, String... altCommands) {
        this(command, description);
        for (String altCommand: altCommands)
            this.altCommands.add(altCommand);
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<String> getAltCommands() {
        return altCommands;
    }

    public void setAltCommands(Set<String> altCommands) {
        this.altCommands = altCommands;
    }

    /**
     * @return command in lowercase
     */
    public String getKey() {
        return getCommand().toLowerCase();
    }
}
