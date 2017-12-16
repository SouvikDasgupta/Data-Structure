import java.util.Set;
import java.util.HashSet;
class Test{
	public static void main(String[] args){
		Set<Integer> val = new HashSet<>();
		val.add(new Integer(1));
		val.add(new Integer(1));
		for(int v : val){
			System.out.print(v+ " ");
		}

	}
}

class Value{
	public int id;
	public Value(int id){
		this.id = id;
	}
}