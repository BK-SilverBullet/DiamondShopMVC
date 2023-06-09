package DiamondShopMVC.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShopMVC.Dao.ProductsDao;
import DiamondShopMVC.Dto.ProductsDto;
@Service
public class ProductServiceImpl implements IProductService{
	
	@Autowired
	ProductsDao productDao = new ProductsDao();
	
	public ProductsDto GetProductsByID(long id) {
		List<ProductsDto>listProducts = productDao.GetProductsByID(id);
		return listProducts.get(0);
	}

	public List<ProductsDto> GetProductsByIDCategory(int id) {
		return productDao.GetAllProductsByID(id);
		
	}

}
