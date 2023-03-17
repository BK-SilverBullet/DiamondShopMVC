package DiamondShopMVC.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShopMVC.Dto.ProductsDto;
import DiamondShopMVC.Entity.Categorys;
import DiamondShopMVC.Entity.Menus;
import DiamondShopMVC.Entity.Slides;
@Service
public interface IHomeService {
	@Autowired
	public List<Slides> GetDataSlide();
	public List<Categorys> GetDataCategorys();
	public List<Menus> GetDataMenus();
	public List<ProductsDto> GetDataProducts();

}
