package demo.service.shop;

import org.springframework.stereotype.Service;

@Service
public class ShopServiceImpl implements ShopService {

    @Override
    public void regist(String shopName) {
        System.out.println("ShopServiceImpl.regist:" + shopName);
    }
}
