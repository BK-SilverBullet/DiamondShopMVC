package DiamondShopMVC.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import DiamondShopMVC.Dto.CartDto;
import DiamondShopMVC.Entity.Bills;

@Service
public interface IBillsService {
	
	public int AddBills(Bills bill);
	public void AddBillsDetail(HashMap<Long, CartDto> carts);

}
