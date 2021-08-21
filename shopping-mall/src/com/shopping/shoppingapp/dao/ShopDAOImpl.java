package com.shopping.shoppingapp.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.shopping.shoppingapp.dto.ShopsDTO;

public class ShopDAOImpl implements ShopDAO {

	public Collection<ShopsDTO> dtos = new ArrayList<ShopsDTO>();

	public ShopDAOImpl() {
	}

	@Override
	public void saveShop(ShopsDTO shopsDTO) {
		if (shopsDTO != null) {
			dtos.add(shopsDTO);
			System.out.println("shop details added");
		} else {
			System.out.println("Shop is empty");
		}
	}

	@Override
	public Collection<ShopsDTO> getAllShops() {
		if (dtos != null && !dtos.isEmpty()) {
			return dtos;
		}
		return null;
	}

	@Override
	public void updateFloorByName(String flr, String nm) {
		if (flr != null && nm != null) {
			for (ShopsDTO shopsDTO : dtos) {
				if (nm.equals(shopsDTO.getShopName())) {
					shopsDTO.setFloor(flr);
				}
			}
		}

	}

	@Override
	public void deleteShopById(int id) {
		if (id > 0) {
			Iterator<ShopsDTO> iterator = dtos.iterator();
			while (iterator.hasNext()) {
				ShopsDTO shopsDTO = iterator.next();
				if (id == shopsDTO.getShopId()) {
					iterator.remove();
					System.out.println("Record deleted");
				}
			}
		}

	}

}
