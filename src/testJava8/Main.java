package testJava8;

import java.sql.Timestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import java.util.Comparator;
import java.util.Date;
import java.util.List;


public class Main {

	public static void main(String[] args) {
	/*	List<Integer> integerList = new ArrayList<>();
		List<String> stringList = new ArrayList<>();
		
		integerList.add(13425);
		integerList.add(2);
		integerList.add(1);
		integerList.add(22);
		integerList.add(345);
		int somme  = 0;
		
		for (Integer i : integerList) {
			if(i%2 == 0 ) {
				somme += Math.pow(i, 3);
			}
		}
		System.out.println(somme);
		
		System.out.println(integerList.stream().filter(x -> x%2 == 0 ).map( x -> Math.pow(x, 3)).reduce((s,c)->s+c));
		integerList.stream().filter(x -> x%2 == 0).map( x -> (int)Math.pow(x, 3)).reduce(Integer::sum).ifPresent(s -> System.out.println(s));
		
		stringList.add("chat");
		stringList.add("loup");
		stringList.add("poisson");
		stringList.add("plop");
		
		System.out.println(stringList.stream().map(x -> x.toUpperCase()).reduce("", String::concat));
		stringList.stream().map(x -> x.toUpperCase()).reduce((s,c)->s+" "+c).ifPresent(System.out::println);
		
		//stringList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		stringList.stream().sorted(Comparator.reverseOrder()).reduce((s,c)->s+" "+c).ifPresent(s -> System.out.println(s));
		
	
		
		Date dateCompare =  new Date(119,2,1,11,00,00);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Timestamp dateCompareTimestamp = new Timestamp(dateCompare.getTime());
		int h = (int) (((dateCompareTimestamp.getTime() - timestamp.getTime()) / 1000) / 3600);
		System.out.println(h);
		
		
		
		System.out.println(ChronoUnit.DAYS.between(LocalDate.now() ,LocalDate.of(2022, 12, 25)));
		
		System.out.println(ChronoUnit.HOURS.between(ZonedDateTime.now() ,ZonedDateTime.of(2019,03,01, 11, 00, 0, 0, ZoneId.of("Pacific/Fiji"))));
		
		System.out.println(ChronoUnit.HOURS.between(LocalDateTime.now() ,LocalDateTime.of(2019,03,01, 11, 00)));
		List<Integer> intList = new ArrayList<>();
		
		
		
		intList.add(2);
		intList.add(1);
		intList.add(22);
		intList.add(345);
		System.out.println("------------------------------------");
		intList.stream().sorted((o1,o2)->{
			return  (o1<o2) ? 1: (o1>o2)? -1 :0 ;
			 
			
			if(o1<o2) return 1;
			else if(o1>o2) return -1;
			else return 0;	
		}).forEach(System.out::println);
		
		LocalDate maDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date =maDate.format(formatter);
		
		System.out.println(date);
		LocalDate d = LocalDate.parse(date, formatter);
		System.out.println(d +"  "+d.getClass());*/
		
		
		
		NameParser parser = new NameParser();
		Name res = parser.parse("Eric Clapton", Name::new);
		Name res2 = parser.parse("Eric"," Clapton",34, Name::new);
		Personne p = parser.parse("keith richards", (o1, o2)-> new Personne(o1,o2));
		
		Personne p2 = parser.parse("monNom", "monPrenom", Personne::new);
		Personne p3 = parser.parse("monNom", "monPrenom", (o1, o2)-> new Personne(o1,o2));
		
		
		System.out.println(res.toString()+"  "+p.toString());
		System.out.println(res2.toString());
	}
	
	
}
