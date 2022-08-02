package com.ratonprogramacao.apideranking;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Caso tenha uma collection no MongoDB, usar o nome de sua Collection. Lembrando que Java é case sensitive
@Document(collection = "principaisLinguagens")
public class Linguagem {
	// Caso necessário, de acordo com os dados de sua API, adicionar ou remover
	// atributos
	@Id
	private String id;
	private String title;
	private String image;
	private int ranking;

	public Linguagem() {

	}

	// Caso modifique os atributos acima, modificar também neste construtor
	public Linguagem(String title, String image, int ranking) {
		super();
		this.title = title;
		this.image = image;
		this.ranking = ranking;
	}

	public String getTitle() {
		return title;
	}

	public String getImage() {
		return image;
	}

	public int getRanking() {
		return ranking;
	}

	public String getId() {
		return id;
	}

}
