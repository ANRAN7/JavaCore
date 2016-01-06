package com.javaCore.proxy._1;

public class ProxySubject implements Subject{

	private RealSubject realSubject;
	
	public ProxySubject(RealSubject realSubject){
		this.realSubject = realSubject;
	}
	
	@Override
	public void request() {
		System.out.println("���ô���ǰ......");
		realSubject.request();
		System.out.println("���ô����......");
	}

}
