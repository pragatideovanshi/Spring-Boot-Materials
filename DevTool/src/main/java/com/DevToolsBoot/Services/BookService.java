package com.DevToolsBoot.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.DevToolsBoot.Entity.Book;

@Component
public class BookService {
	
	private static List<Book> l=new ArrayList<>();
	
	static {
		l.add(new Book(12,"A","ABC"));
		l.add(new Book(13,"B","ABC"));
		l.add(new Book(14,"C","ABC"));
	}
	
	public List<Book> getallBooks(){
		return l;
	}
	
	public Book getbyid(int id) {
		for (Book i : l){
			if(i.getId()==id) {
				return i; 
			} 
		}
		return null;
	}
	
	public Book addbook(Book b) {
		l.add(b);
		return b;
	}
	
	public String deletebook(int id) {
		for (Book i : l){
			if(i.getId()==id) {
				l.remove(i); 
				return "Deleted";
			} 
		}
		return ( "ID not Found");
		
	}
	
	public String TestJ() {
		return "All Books are in Libraray";
	}
	
	public Book update(Book b) {
		for (Book i : l){
			if(i.getId()==b.getId()){
				i.setAuthor(b.getAuthor());
				return i;
			} 
		}
		return null;
	}
	
//	public Book getbyids(List<String> ids) {
//		List<Integer> list1=new ArrayList<Integer>();
//		for(int i=0;i<ids.size();i++) {
//			int j=Integer.parseInt(ids.get(i));  
//			list1.add(j);
//		}
//		for (Book i : l){
//			for()
//			if(i.getId()==id) {
//				return i; 
//			} 
//		}
//		return null;
//	}
	
	public Book getbyidpayload(int id) {
		for (Book i : l){
			if(i.getId()==id) {
				return i; 
			} 
		}
		return null;
	}
	

}
