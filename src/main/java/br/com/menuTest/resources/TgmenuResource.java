package br.com.menuTest.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.menuTest.domain.Tgmenu;
import br.com.menuTest.dto.menu.Icon;
import br.com.menuTest.dto.menu.Menu;
import br.com.menuTest.services.TgmenuService;

@RestController
@RequestMapping(value = "/menu")
public class TgmenuResource {
	
	@Autowired
	private TgmenuService service;

	@RequestMapping(method = RequestMethod.GET)
	private ResponseEntity<List<Menu>> findAll() {
		List<Tgmenu> tgmenus = service.findMenuR();
        List<Menu> Menu_list = new ArrayList<>();
        //todos os menus
//        Menu HeaderMenu = new Menu();
//        HeaderMenu.setDisabled(false);
//        HeaderMenu.setHeader(true);
//        HeaderMenu.setHidden(false);
//        HeaderMenu.setHiddenOnCollapse(true);
//        HeaderMenu.setTitle("WHOSP .::. Menus");
//        Menu_list.add(HeaderMenu);
        Menu menu = new Menu();
        menu.setDisabled(false);
        menu.setHeader(false);
        menu.setHidden(false);
        menu.setHiddenOnCollapse(true);
        menu.setTitle("inicio");
        menu.setHref("/");
        Icon icon = new Icon();
        icon.setClass("fa fa-align-justify");
        icon.setElement("span");
        menu.setIcon(icon);
        Menu_list.add(menu);
        for (int x = 0; x < tgmenus.size(); x++) {
            Menu_list.add(getSubItem(tgmenus.get(x)));
        }

        //todos os favoritos
        Menu HeaderMenuFavoritos = new Menu();
        HeaderMenuFavoritos.setDisabled(false);
        HeaderMenuFavoritos.setHeader(true);
        HeaderMenuFavoritos.setHidden(false);
        HeaderMenuFavoritos.setHiddenOnCollapse(true);
        HeaderMenuFavoritos.setTitle("Favoritos");
		return ResponseEntity.ok().body(Menu_list);
	}

	@RequestMapping(value = "/menulst",method = RequestMethod.GET)
	private ResponseEntity<List<Tgmenu>> findMenu() {
		List<Tgmenu> tgmenus = service.findAll();
		return ResponseEntity.ok().body(tgmenus);
	}
	
    private Menu getSubItem(Tgmenu tgmenu) {
        Menu menu = new Menu();
        String iconClass = "fa fa-gg";
        menu.setHeader(false);
        menu.setHref(tgmenu.getRotas().getHref());
        menu.setHiddenOnCollapse(true);
        
        if(tgmenu.getclass().equals("")) {
        	tgmenu.setClass1(iconClass);
        }
        
        Icon icon = new Icon();
        icon.setClass(tgmenu.getclass());
        icon.setElement("span");
        menu.setIcon(icon);
        menu.setTitle(tgmenu.getDescricao());

        for (int x = 0; x < tgmenu.getTgmenuList().size(); x++) {
            menu.addChild(getSubItem(tgmenu.getTgmenuList().get(x)));
        }

        if (tgmenu.getAtivo() != 1) {
            menu.setHidden(true);
            menu.setDisabled(true);
        }

        return menu;
    }
    
//    private Tgmenu menuNewToTgmenu(MenuNew obj) {
//		return null;
//	}
    
}
