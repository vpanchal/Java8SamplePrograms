package com.java;

class Quizful {
    
    private Double x = 2.0;
    
    public Quizful() {
		// TODO Auto-generated constructor stub
	}
    String s = null;
    Quizful(String str){
        this.s = str;
    }
    
    public static void multX(Quizful q, Double n) {
        q.setX(q.getX() * n);
    }
    
    public Double getX() { 
    	 return (true ? null : 0.0);
    	//return x; 
    }
    
    public void setX(Double x) { 
    	this.x = x; 
    }
    
    public static void tripleValue(Double x) {
        x *= 3;
    }
    
    public static Quizful resetX(Quizful q) {
        q = new Quizful();
        return q;
    }
   
    
    public static void main(String[] args) {
        Double x = 4.0;
        tripleValue(x);
        Quizful q = new Quizful();
        multX(q,x);
        resetX(q);
        System.out.print(q.getX());
        String str = new String("");
        
        
        Quizful v1 = new Quizful("abc");
        Quizful v2 = new Quizful("abc");
        
        System.out.println((v1 == v2) + " " + v1.equals(v2));
    } 
}