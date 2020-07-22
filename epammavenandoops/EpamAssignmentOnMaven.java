import java.util.*;
import java.util.Map.Entry;
	interface Candies
	{
	void taste();
	double calculateWeight(HashMap<String,Double> hl);
	}
	class Chocalate implements Candies
	{
	double weight_of_chocalates=0.0;
	public void taste()
	{
	System.out.println("The choclates are sweet in taste on keeping it on tongue it melts");
	}
	public double calculateWeight(HashMap<String,Double> hm)
	{
	for(Map.Entry m:hm.entrySet())
	{
		weight_of_chocalates=weight_of_chocalates + (Double)m.getValue();
	}
	return weight_of_chocalates;

	}
	}
	class Sweets implements Candies
	{
	double weight_of_sweets;
	public void taste()
	{
	System.out.println("Each sweet has its own taste , each gives refreshing to mind");
	}
	public double calculateWeight(HashMap<String,Double> hc)
	{
		for(Map.Entry mj:hc.entrySet())
		{
			weight_of_sweets=weight_of_sweets+(Double)mj.getValue();
		}
		return weight_of_sweets;

	}
	}


	 public class EpamAssignmentOnMaven {

	public static void main(String arg[])
	{
	HashMap<String,Double> sweet=new HashMap<String,Double>();
	System.out.println("Enter number of sweets");
	Scanner s=new Scanner(System.in);
	//taking sweets input
	int num_of_sweets=s.nextInt();
	String sw;
	double wt;
	for(int i=1;i<=num_of_sweets;i++)
	{
	System.out.println("Enter name of sweet");
	sw=s.next()+s.nextLine();
	System.out.println("Enter weight of sweet");
	wt=s.nextDouble();
	sweet.put(sw,wt);
	}
	//taking chocolates input
	HashMap<String,Double> choc=new HashMap<String,Double>();
	System.out.println("Enter number of chocalates");
	int num_of_chocalates=s.nextInt();
	for(int i=1;i<=num_of_chocalates;i++)
	{
	System.out.println("Enter name of chocalate");
	sw=s.next()+s.nextLine();
	System.out.println("Enter weight of chocalate");
	wt=s.nextDouble();
	choc.put(sw,wt);
	}
	//sorting chocolates
	System.out.println("enter the option for sorting the chocalates");
	System.out.println("1.sort"+"\n2.donot sort");
	int option=s.nextInt();
	//by weights
	if(option==1)
	{
		Set<Entry<String,Double>> set=choc.entrySet();
		List<Entry<String,Double>> li=new ArrayList<Entry<String,Double>>(set);
		 Collections.sort(li, new Comparator<Map.Entry<String, Double> >() { 
	            public int compare(Map.Entry<String, Double> o1,  
	                               Map.Entry<String, Double> o2) 
	            { 
	                return (o1.getValue()).compareTo(o2.getValue()); 
	            } 
	        }); 	
		 }
	System.out.println("chocalates is");
	for(Map.Entry mj:choc.entrySet())
	{
		System.out.println(mj.getKey()+"  "+mj.getValue());
	}
	//creation of sweet object
	Sweets sw1=new Sweets();
	//calculation of sweets weights
	double sw_weight=sw1.calculateWeight(sweet);
	//creation of chocolate object
	Chocalate c=new Chocalate();
	//calculation of sweets weights
	double c_weight=c.calculateWeight(choc);
	
	System.out.println("Enter number of Gifts");
	int num_of_gifts=s.nextInt();
	//children gifts input
	List<Double> l=new ArrayList<Double>();
	System.out.println("Enter weight of childrens gift");
	for(int i=0;i<num_of_gifts;i++)
	{
		l.add(s.nextDouble());
	}
	double gift_weight=0.0;
	for(Double d:l)
	{
		gift_weight=gift_weight+d;
	}
	
	System.out.println("Total weight of gift box :"+(sw_weight+c_weight+gift_weight));
	
	//taking range of input from user
	System.out.println("Enter the range of input");
	int first=s.nextInt();
	int second=s.nextInt();
	System.out.println("The chocalates and sweets of desired choice are");
	int p=first;
	for(Map.Entry mj:choc.entrySet())
	{
		System.out.println(mj.getKey()+"  "+mj.getValue());
		if(p==second)
			break;
		p++;
	}
	p=first;
	for(Map.Entry mj:sweet.entrySet())
	{
		System.out.println(mj.getKey()+"  "+mj.getValue());
		if(p==second)
			break;
		p++;
	}	
	
	}
	}


