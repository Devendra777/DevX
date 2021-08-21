package com.shopping.shoppingapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

import com.shopping.shoppingapp.dao.ShopDAO;
import com.shopping.shoppingapp.dao.ShopDAOImpl;
import com.shopping.shoppingapp.dto.ShopsDTO;

public class ShoppingUtil {

	public static void main(String[] args) {

		ShopsDTO shopsDTO = new ShopsDTO();
		shopsDTO.setShopId(23);
		shopsDTO.setFloor("1st Foor");
		shopsDTO.setShopName("Trends");
		shopsDTO.setType("Clothing");

		ShopsDTO shopsDTO1 = new ShopsDTO();
		shopsDTO1.setShopId(78);
		shopsDTO1.setFloor("Ground Floor");
		shopsDTO1.setShopName("Zara");
		shopsDTO1.setType("Clothing");

		ShopsDTO shopsDTO3 = new ShopsDTO();
		shopsDTO3.setShopId(123);
		shopsDTO3.setFloor("2nd Floor");
		shopsDTO3.setShopName("forever 21");
		shopsDTO3.setType("Clothing");

		Collection<ShopsDTO> dtos = new ArrayList<ShopsDTO>();
		dtos.add(shopsDTO);
		dtos.add(shopsDTO1);
	System.out.println(	dtos.contains(shopsDTO3));

	
		/*
		 * Iterator<ShopsDTO> iterator = dtos.iterator();
		 * System.out.println("Retriving shop dto from 1st collection"); while
		 * (iterator.hasNext()) {
		 * 
		 * ShopsDTO dto = iterator.next(); System.out.println(dto);
		 * 
		 * }
		 */

		Collection<ShopsDTO> dtos1 = new ArrayList<ShopsDTO>();
	
		dtos1.add(shopsDTO3);
		
		
		List<ShopsDTO> target = new ArrayList<ShopsDTO>();
     
     	target.addAll(dtos1);
    	target.addAll(dtos);
		//target.retainAll(dtos1);
     	System.out.println(target.containsAll(dtos1));
		
		target.addAll(dtos1);
		System.out.println(target.containsAll(dtos1));
		
		System.out.println(dtos.size());
		System.out.println(dtos1.size());
		System.out.println(target.size());
		
		Iterator<ShopsDTO> iterator1 = target.iterator();
		System.out.println("Retriving shop dto from Target collection");
		while (iterator1.hasNext()) {
			ShopsDTO dto = iterator1.next();  
			System.out.println(dto);
		}
		
		
	
	
	   Collections.sort(target);
	  for (ShopsDTO shopsDTO2  : target) {
		System.out.println(shopsDTO2);
	}
         
	
	}
	

}
