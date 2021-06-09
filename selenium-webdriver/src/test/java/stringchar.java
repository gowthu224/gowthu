import java.util.HashMap;

public class stringchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to sonata software";
				char[] c=s.toCharArray();
				int count=c.length;
				HashMap<Character, Integer> map=new HashMap<Character, Integer>();
				for(int i=0;i<count;i++)
				{
					if(map.containsKey(c[i]))
					{
						int c1=map.get(c[i]);
						map.put(c[i],c1+1);
					
					}else
					{
						map.put(c[i],1);
					}
				}
System.out.println(map);
String s1="welcome to sonata software";
String[] str=s1.split(" ");
int count1=str.length;
System.out.println(count1);
HashMap<String, Integer> ma=new HashMap<String, Integer>();
for(int i=0;i<count1;i++)
{
	if(ma.containsKey(str[i]))
	{
		int countwrd=ma.get(str[i]);
		ma.put(str[i],countwrd+1);
	}else
	{
		ma.put(str[i],1);
	}
	

	}
System.out.println(ma);
	}

}
