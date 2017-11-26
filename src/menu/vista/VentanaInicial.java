/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package menu.vista;

import controlador.EventoVentanaInicial;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Universidad
 */
public class VentanaInicial extends JFrame {

    
    private JDesktopPane escritorio;
    private JMenuBar barraMenu;
    private List<JMenu> menuList;
    private List<JMenuItem> menuItemList; 
    private VentanaPersona ventanaPersona;
    
    public VentanaInicial(String titulo, int w, int h)  {
        super(titulo);
        this.setSize(w, h);
        this.setDefaultCloseOperation(3);
        this.iniciaComponentes();
        this.setVisible(true);
    }
    
    public void iniciaComponentes()
    {
        this.escritorio=new JDesktopPane();
        this.barraMenu=new JMenuBar();
        this.menuList=new ArrayList<JMenu>();
        this.menuList.add(new JMenu("Personas"));
        this.menuList.add(new JMenu("Autos"));
        this.menuItemList=new ArrayList<JMenuItem>();
        this.menuItemList.add(new JMenuItem("Nueva Persona"));
        this.menuItemList.add(new JMenuItem("Ver Personas"));
        this.menuItemList.add(new JMenuItem("Nuevo Auto"));
        this.menuItemList.add(new JMenuItem("Ver Autos"));
        
        this.setContentPane(this.escritorio);
        this.setJMenuBar(barraMenu);
        this.barraMenu.add(this.menuList.get(0));
        this.barraMenu.add(this.menuList.get(1));
        this.menuList.get(0).add(this.menuItemList.get(0));
        this.menuList.get(0).add(this.menuItemList.get(1));
        this.menuList.get(1).add(this.menuItemList.get(2));
        this.menuList.get(1).add(this.menuItemList.get(3));
        this.menuItemList.get(0).addActionListener(new EventoVentanaInicial(this));
        this.menuItemList.get(1).addActionListener(new EventoVentanaInicial(this));
        this.menuItemList.get(2).addActionListener(new EventoVentanaInicial(this));
        this.menuItemList.get(3).addActionListener(new EventoVentanaInicial(this));
        
        
        
    }

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public JMenuBar getBarraMenu() {
        return barraMenu;
    }

    public void setBarraMenu(JMenuBar barraMenu) {
        this.barraMenu = barraMenu;
    }

    public List<JMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<JMenu> menuList) {
        this.menuList = menuList;
    }

    public List<JMenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<JMenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public VentanaPersona getVentanaPersona() {
        return ventanaPersona;
    }

    public void setVentanaPersona(VentanaPersona ventanaPersona) {
        this.ventanaPersona = ventanaPersona;
    }
    
    
    
    
}
