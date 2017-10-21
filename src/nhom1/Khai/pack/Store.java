package nhom1.Khai.pack;

import java.util.LinkedList;
import java.util.List;

import nhom1.Khai.db.DBConnector;

public class Store {
	private String storeName;
	private double totalMoney;
	private List<Cost> costList;
	private DBConnector dbconnector;
	
	public Store(String storeName, double totalMoney, DBConnector dbconnector) {
		this.storeName = storeName;
		this.totalMoney = totalMoney;
		this.costList = new LinkedList<Cost>();
		this.dbconnector = new DBConnector();
	}
	/**
	 * add cost to costlist
	 * @param cost
	 * @return true if success else false
	 */
	public boolean addCost(Cost cost) {
		if(cost!=null) {
			costList.add(cost);
			return true;
		}
		return false;
	}
	/**
	 * remove cost by reference
	 * @param cost
	 * @return true true if success else false 
	 */
	public boolean removeCost(Cost cost) {
		return this.costList.remove(cost);
	}
	/**
	 * remove cost by index 
	 * @param index index of cost in list
	 * @return true if success else false
	 */
	public boolean removeCost(int index) {
		if(this.costList.remove(index)==null) return false;
		return true;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public double getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}
	public List<Cost> getCostList() {
		return costList;
	}
	public void setCostList(List<Cost> costList) {
		this.costList = costList;
	}
	public DBConnector getDbconnector() {
		return dbconnector;
	}
	
	
}
