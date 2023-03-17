package DiamondShopMVC.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShopMVC.Dao.CategorysDao;
import DiamondShopMVC.Dao.MenuDao;
import DiamondShopMVC.Dao.ProductsDao;
import DiamondShopMVC.Dao.SlidesDao;
import DiamondShopMVC.Dto.ProductsDto;
import DiamondShopMVC.Entity.Categorys;
import DiamondShopMVC.Entity.Menus;
import DiamondShopMVC.Entity.Slides;
@Service
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategorysDao categoryDao;
	@Autowired
	private MenuDao menuDao;
	@Autowired
	private ProductsDao productsDao;

	public List<Slides> GetDataSlide() {
		return slidesDao.GetDataSlide();
	}


	public List<Categorys> GetDataCategorys() {
		return categoryDao.GetDataCategorys();
	}


	public List<Menus> GetDataMenus() {
		return menuDao.GetDataMenus();
	}


	public List<ProductsDto> GetDataProducts() {
		List<ProductsDto> listProducts = productsDao.GetDataProducts();
		return listProducts;
	}
	
	

}
