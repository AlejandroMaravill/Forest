/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingComponents;

import javax.swing.Icon;

/**
 *
 * @author josse
 */
public class ModelMenu {
    String menuName;
    String subMenu[];
    Icon icon;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String[] getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(String[] subMenu) {
        this.subMenu = subMenu;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }
    
    public ModelMenu(Icon icon, String menuName, String... subMenu){
        this.icon = icon;
        this.menuName = menuName;
        this.subMenu = subMenu;
    }
    
    public ModelMenu(){
    }
}