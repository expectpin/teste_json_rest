package br.com.poc.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class ObjectPaginated<T, I extends Serializable> {

	private int pageNumber;
	private int pageSize;
	private List<T> list;
	
	public ObjectPaginated() {
	}
	
	public ObjectPaginated(int pageNumber, int pageSize, List<T> list) {
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.list = list;
	}
	
}
