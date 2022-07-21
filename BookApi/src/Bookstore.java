package src;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Bookstore {
	
	public static void main(String[] args) {
				
		Book livro1 = new Book("1", "Box Cidade dos Ossos", 200.00, "Fantasia", "1");
		Book livro2 = new Book("2", "Box House of Night", 90.00, "Fantasia", "2");
		Book livro3 = new Book("3", "Box Crepúsculo", 160.00, "Fantasia", "3");
		Book livro4 = new Book("4", "Game of Thrones", 500.00, "Fantasia", "4");
		Book livro5 = new Book("5", "Box Hush Hush", 150.00, "Romance", "5");
		Book livro6 = new Book("6", "Apenas Amigos",  25.00,  "Romance", "6" );
		
		List<Book> livros = new ArrayList<>();
		livros.add(livro1);
		livros.add(livro2);
		livros.add(livro3);
		livros.add(livro4);
		livros.add(livro5);
		livros.add(livro6);
		
		Gson gson = new Gson(); 
		String livroJson = gson.toJson(livros);
		/*
		String livro1Json = gson.toJson(livro1);
		String livro2Json = gson.toJson(livro2);
		String livro3Json = gson.toJson(livro3);
		String livro4Json = gson.toJson(livro4);
		String livro5Json = gson.toJson(livro5);
		String livro6Json = gson.toJson(livro6);
		*/
		try {
			FileWriter writeFile = null;
			writeFile = new FileWriter("BookDataBase.json");
			
			writeFile.write(livroJson);
			/*
			writeFile.write(livro1Json);
			writeFile.write(livro2Json);
			writeFile.write(livro3Json);
			writeFile.write(livro4Json);
			writeFile.write(livro5Json);
			writeFile.write(livro6Json);
			*/
			writeFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
