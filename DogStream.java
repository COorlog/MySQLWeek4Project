package sort;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import dao.Dog;
import dao.DogDao;

public class DogStream {
	
private static DogDao dogDao = new DogDao();	

	public static void main(String[] args) {
		new DogStream().run();
	}

	private void run() {
		// 2a
		Stream<Dog> dogStream = dogDao.getDogs().stream();

		// 2b,2c
		Stream<String> dogStringStream = dogStream.map(Dog::toString).sorted(); 
				
		// 2d
		String dogNames = dogStringStream.collect(Collectors.joining(", ")).toString();

		// 2e
		System.out.println(dogNames);

	}

}
