package com.example.command;

import java.util.List;

import lombok.Data;

@Data
public class OrderCommand {

	private List<OrderItem> orderItems; // 주문이 여러 개일 수 있으므로 list로 저장
	private Address address;
	
}