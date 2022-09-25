import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




class Transaction {
    private String reciever;
    private String type;
    private double amount;
    private long timestamp;
    public Transaction(String reciever, String type, double amount, long timestamp) {
        this.reciever = reciever;
        this.type = type;
        this.amount = amount;
        this.timestamp = timestamp;
    }
    public String getDate() {
    	
        /* Complete this function which will return a date in dd-MMM-YYYY string format */
    	SimpleDateFormat sdf =new SimpleDateFormat("dd-MMM-YYYY");
    	Timestamp ts=new Timestamp(this.timestamp);
    	Date date= new Date(ts.getTime());
    	return sdf.format(date);
    	
    }
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("{ reciever :").append(this.reciever)
            .append(", type :").append(this.type)
            .append(", amount :").append(this.amount)
            .append(", timestamp :").append(getDate())
            .append(" }");
        return str.toString();
    }
}



class HelloWorld {
    public Map<String, List<String>> groupTransactionsByDate(List<Transaction> transactions) {
        /*     Complete this function which will group by the transactions on date
         *     where key will be the "date" and value will be the "List of stringified transactions"        */    
    	
    	Map<String,List<String>>  mapObj= new HashMap<String, List<String>>();
    	
    	List<String> transactionList=null;	
    	
    	for(Transaction transaction:transactions)
    	{
    		if(mapObj.get(transaction.getDate()) ==null)
    		{
    			transactionList= new ArrayList<>();
    		transactionList.add(transaction.toString());
    		mapObj.put(transaction.getDate(), transactionList);
    		}
    		else
    		{
    			transactionList=	mapObj.get(transaction.getDate());
    			transactionList.add(transaction.toString());
    			mapObj.put(transaction.getDate(), transactionList);
    			
    		}
    	}
    	return mapObj;
    }
    public static void main(String[] args) {
        List<Transaction> list = new ArrayList<Transaction>();
        Transaction t1 = new Transaction("Amazon", "Shopping", 150, 1654803648161L);
        Transaction t2 = new Transaction("Apple", "App store", 290.85, 1654803648161L);
        Transaction t3 = new Transaction("Laxmi Tea Stall", "Transfer", 100, 1654713000000L);
        list.add(t1);
        list.add(t2);
        list.add(t3);
        HelloWorld hw = new HelloWorld();
        Map<String, List<String>> map = hw.groupTransactionsByDate(list);
        for(Map.Entry<String, List<String>> entry: map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue()+"\n\n");
        }
    }
}