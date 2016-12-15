package learn.imooc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo24 {

	public Map<String,String> map;
	
	public Demo24(){
		map = new HashMap<String,String>();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo24 demo = new Demo24();
		demo.mapAdd("MT4_ID","33003021");
		demo.mapAdd("ACCOUNT_NAME", "陈云花");
		demo.mapAdd("ACCOUNT_ID", "ga9sd-sd023sddg-qsdsdfg-3sdfgsdx");
		demo.mapShow();
		demo.mapRemove("MT4_ID");
		
		demo.mapModify("ACCOUNT_NAME", "花花");
		demo.mapShow();
		
	}
	
	public void mapAdd(String key, String value){
		map.put(key, value);
	}
	
	public void mapShow(){
		Set<String> keys = map.keySet();
		for(String key : keys){
			String value = map.get(key);
			System.out.println(key + "\t" + value);
		}
	}
	
	public void mapModify(String key, String value){
		map.put(key, value);
	}
	
	public void mapRemove(String key){
		map.remove(key);
	}
	


}