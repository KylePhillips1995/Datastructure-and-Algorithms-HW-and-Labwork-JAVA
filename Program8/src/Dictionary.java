//Kyle Phillips 
//Program 8

	import java.util.*;
	import java.io.*;

	public class Dictionary {
	
	public static void main(String[] args) throws IOException{
		

		Map<String, LinkedList<String>> dictionary = new TreeMap<String, LinkedList<String>>();
		
		String word1 = "Passionfruit"; 
		String defn1 = "A spherical fruit yellow or dark purple at maturity, cultivated commercially in tropical and subtropical areas";
		String word2 = "Pineapple";
		String defn2 = "A large juicy tropical fruit with yellow flesh surrounded by a tough outer skin";
		String word3 = "Peach";
		String defn3 = "A spherical stone fruit with juicy yellow flesh and downy pinkish-yellow skin";
		String word4 = "Plum";
		String defn4 = "A spherical/oval fruit that is purple, reddish, or yellow. Flattish pointed pit";
		String word5 = "Grape";
		String defn5 = "A small spherical fruit of the deciduous woody vines of the flowering plant genus Vitis. Generally occure in clusters and are typically used in wine making";
		String word6 = "Orange";
		String defn6 = "A spherical sweet orange fruit of the citrus species";
		String word7 = "Banana";
		String defn7 = "An elongated and curved fruit with soft flesh rich in starch, covered with a rind";
		String word8 = "Mango";
		String defn8 = "A spherical stone fruit cultivated in the tropics belonging to the flowering plant genus Mangifera";
		String word9 = "Avocado";
		String defn9 = "A spherical green skinned fruit cultivated in tropical and Mediterranean climates with a single large seed";
		String word10 = "Apple";
		String defn10 = "A spherical sweet fruit cultivated worldwide and grown on a deciduous tree";
		String word11 = "Passionfruit";
		String defn11 = "A sweet seedy fruit, oval in shape native to Southern Brazil";
		String word12 = "Pineapple";
		String defn12 = "A wildely cultivated low growing tropical fruit with spiny sword-shaped leaves on a thick stem";
		String word13 = "Peach";
		String defn13 = "A deciduous fruit native to the region of Northwest China, a roud sweet fruit with a single seeded pit";
		String word14 = "Plum";
		String defn14 = "A subacid, juicy, drupaceous fruit of the tree, Prunus Persica, of the rose family";
		String word15 = "Grape";
		String defn15 = "A small round fruit that generally occurs in clusters and are typically used in wine making";
		String word16 = "Orange";
		String defn16 = "An orange circular fruit, cultivated mainly in tropical and subtropical climates but grown worldwide";
		String word17 = "Banana";
		String defn17 = "A long fruit with a peel, colors varie and grow in clusters hanging from the top of a plant";
		String word18 = "Mango";
		String defn18 = "A oblong, sweet fruit of a tropical tree, Mangifera indica, of the cashew family, eaten ripe, or preserved or pickled";
		String word19 = "Avocado";
		String defn19 = "Also called ailligator pear. A large, usually pear-shaped fruit having green to blackish skin, a single large seed, and light green pulp. Often eaten raw";
		String word20 = "Apple";
		String defn20 = "Usually round, red or yellow, edible fruit of a tree, Malus Sylvestris, of the rose family";
		
		
		
		if(dictionary.get(word1) == null) {
				
			LinkedList<String> list = new LinkedList<String>();
			list.add(defn1);
			dictionary.put(word1, list);
			
			}
		
		else {
		
			dictionary.get(word1).add(defn1);
			
		}
			
		if(dictionary.get(word2) == null) {
				
			LinkedList<String> list = new LinkedList<String>();
			list.add(defn2);
			dictionary.put(word2, list);
			
			}
		
		else {
		
			dictionary.get(word2).add(defn2);
			
		}	
			
		if(dictionary.get(word3) == null) {
			
			LinkedList<String> list = new LinkedList<String>();
			list.add(defn3);
			dictionary.put(word3, list);
		
		}
		
		else {
		
			dictionary.get(word3).add(defn3);
		
		}
		
		if(dictionary.get(word4) == null) {
			
			LinkedList<String> list = new LinkedList<String>();
			list.add(defn4);
			dictionary.put(word4, list);
		
		}
		
		else {
		
		dictionary.get(word4).add(defn4);
		
		}
		
		if(dictionary.get(word5) == null) {
			
			LinkedList<String> list = new LinkedList<String>();
			list.add(defn5);
			dictionary.put(word5, list);
		
		}
		
		else {
		
			dictionary.get(word5).add(defn5);
		
		}	
		
		
		if(dictionary.get(word6) == null) {
			
			LinkedList<String> list = new LinkedList<String>();
			list.add(defn6);
			dictionary.put(word6, list);
		
		}
		
		else {
		
			dictionary.get(word6).add(defn6);
		
		}
		
		if(dictionary.get(word7) == null) {
			
			LinkedList<String> list = new LinkedList<String>();
			list.add(defn7);
			dictionary.put(word7, list);
			
			}
		
		else {
		
			dictionary.get(word7).add(defn7);
			
		}
		
		if(dictionary.get(word8) == null) {
			
			LinkedList<String> list = new LinkedList<String>();
			list.add(defn8);
			dictionary.put(word8, list);
			
			}
		
		else {
		
			dictionary.get(word8).add(defn8);
			
		}
		
		if(dictionary.get(word9) == null) {
			
			LinkedList<String> list = new LinkedList<String>();
			list.add(defn9);
			dictionary.put(word9, list);
			
			}
		
		else {
		
			dictionary.get(word9).add(defn9);
			
		}
		
		if(dictionary.get(word10) == null) {
			
			LinkedList<String> list = new LinkedList<String>();
			list.add(defn10);
			dictionary.put(word10, list);
			
			}
		
		else {
		
			dictionary.get(word10).add(defn10);
			
		}
		
		if(dictionary.get(word11) == null) {
			
			LinkedList<String> list = new LinkedList<String>();
			list.add(defn11);
			dictionary.put(word11, list);
			
			}
		
		else {
		
			dictionary.get(word11).add(defn11);
			
		}
		
		if(dictionary.get(word12) == null) {
			
			LinkedList<String> list = new LinkedList<String>();
			list.add(defn12);
			dictionary.put(word12, list);
			
			}
		
		else {
		
			dictionary.get(word12).add(defn12);
			
		}
		
		if(dictionary.get(word13) == null) {
			
			LinkedList<String> list = new LinkedList<String>();
			list.add(defn13);
			dictionary.put(word13, list);
			
			}
		
		else {
		
			dictionary.get(word13).add(defn13);
			
		}
		
		if(dictionary.get(word14) == null) {
			
			LinkedList<String> list = new LinkedList<String>();
			list.add(defn14);
			dictionary.put(word14, list);
			
			}
		
		else {
		
			dictionary.get(word14).add(defn14);
			
		}
		
		if(dictionary.get(word15) == null) {
			
			LinkedList<String> list = new LinkedList<String>();
			list.add(defn15);
			dictionary.put(word15, list);
			
			}
		
		else {
		
			dictionary.get(word15).add(defn15);
			
		}
		
		if(dictionary.get(word16) == null) {
			
			LinkedList<String> list = new LinkedList<String>();
			list.add(defn16);
			dictionary.put(word16, list);
			
			}
		
		else {
		
			dictionary.get(word16).add(defn16);
			
		}
		
		if(dictionary.get(word17) == null) {
			
			LinkedList<String> list = new LinkedList<String>();
			list.add(defn17);
			dictionary.put(word17, list);
			
			}
		
		else {
		
			dictionary.get(word17).add(defn17);
			
		}
		
		if(dictionary.get(word18) == null) {
			
			LinkedList<String> list = new LinkedList<String>();
			list.add(defn18);
			dictionary.put(word18, list);
			
			}
		
		else {
		
			dictionary.get(word18).add(defn18);
			
		}
		
		if(dictionary.get(word19) == null) {
			
			LinkedList<String> list = new LinkedList<String>();
			list.add(defn19);
			dictionary.put(word19, list);
			
			}
		
		else {
		
			dictionary.get(word19).add(defn19);
			
		}

		if(dictionary.get(word20) == null) {
			
			LinkedList<String> list = new LinkedList<String>();
			list.add(defn20);
			dictionary.put(word20, list);
			
			}
		
		else {
		
			dictionary.get(word20).add(defn20);
			
		}
		
		
		
		System.out.println(dictionary);
		
		
		
	}
	
	}
	
	
	//{Apple=[A spherical sweet fruit cultivated worldwide and grown on a deciduous tree, Usually round, red or yellow, edible fruit of a tree, Malus Sylvestris, of the rose family], Avocado=[A spherical green skinned fruit cultivated in tropical and Mediterranean climates with a single large seed, Also called ailligator pear. A large, usually pear-shaped fruit having green to blackish skin, a single large seed, and light green pulp. Often eaten raw], Banana=[An elongated and curved fruit with soft flesh rich in starch, covered with a rind, A long fruit with a peel, colors varie and grow in clusters hanging from the top of a plant], Grape=[A small spherical fruit of the deciduous woody vines of the flowering plant genus Vitis. Generally occure in clusters and are typically used in wine making, A small round fruit that generally occurs in clusters and are typically used in wine making], Mango=[A spherical stone fruit cultivated in the tropics belonging to the flowering plant genus Mangifera, A oblong, sweet fruit of a tropical tree, Mangifera indica, of the cashew family, eaten ripe, or preserved or pickled], Orange=[A spherical sweet orange fruit of the citrus species, An orange circular fruit, cultivated mainly in tropical and subtropical climates but grown worldwide], Passionfruit=[A spherical fruit yellow or dark purple at maturity, cultivated commercially in tropical and subtropical areas, A sweet seedy fruit, oval in shape native to Southern Brazil], Peach=[A spherical stone fruit with juicy yellow flesh and downy pinkish-yellow skin, A deciduous fruit native to the region of Northwest China, a roud sweet fruit with a single seeded pit], Pineapple=[A large juicy tropical fruit with yellow flesh surrounded by a tough outer skin, A wildely cultivated low growing tropical fruit with spiny sword-shaped leaves on a thick stem], Plum=[A spherical/oval fruit that is purple, reddish, or yellow. Flattish pointed pit, A subacid, juicy, drupaceous fruit of the tree, Prunus Persica, of the rose family]}

	