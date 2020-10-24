package transactionpart;
import mainpanel.*;
import interfacepart.*;


public class Transaction extends Student{
	Student sender;
	int amount;
	String PaymetnDetails;
	
	public Transaction(){}
	
	public Transaction(Student sender, int amount, String PaymetnDetails){
		this.sender = sender;
		this.amount = amount;
		this.PaymetnDetails= PaymetnDetails;
		
	}
	
	
	public void setSender(Student sender){
		this.sender = sender;
	}
	
	public Student getSender(){
		return sender;
	}
	/*public void setReciver(Bank r){
		this.reciever = r;
	}
	public Bank getReciever(){
		return reciever;
	}
	*/
	
	
	public void showInfo(){
		System.out.println("Sender " + sender.name);
		System.out.println("amount: " + amount);
		System.out.println("Sender: " + PaymetnDetails);
		
		
		
	}
	
	
	
	
	
	
	

}