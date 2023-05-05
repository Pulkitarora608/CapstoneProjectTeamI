package com.incedo.smartinventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="returns")
public class Return {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long item_id;

@Column(name = "Item_name")
private String item_name;

@Column(name = "Item_quantity")
private int item_quantity;

@Column(name = "Reason_for_return")
private String reason_for_return;

public Long getItem_id() {
	return item_id;
}

public void setItem_id(Long item_id) {
	this.item_id = item_id;
}

public String getItem_name() {
	return item_name;
}

public void setItem_name(String item_name) {
	this.item_name = item_name;
}

public int getItem_quantity() {
	return item_quantity;
}

public void setItem_quantity(int item_quantity) {
	this.item_quantity = item_quantity;
}

public String getReason_for_return() {
	return reason_for_return;
}

public void setReason_for_return(String reason_for_return) {
	
	this.reason_for_return = reason_for_return;
}

}