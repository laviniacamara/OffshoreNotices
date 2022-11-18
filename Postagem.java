package models;

import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Postagem extends Model{
	
	public String titulo;
	public String autor;
	public String conteudo;
	public Date data = new Date(); 

}
