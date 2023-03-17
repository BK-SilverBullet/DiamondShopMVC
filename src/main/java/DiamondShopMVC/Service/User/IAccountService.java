package DiamondShopMVC.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShopMVC.Entity.Users;
@Service
public interface IAccountService {
	@Autowired
	public int AddAccount(Users user);
	public  Users CheckAccount(Users user);
}
