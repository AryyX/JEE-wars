package fr.formation.etudiant.pocWS.ws;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import fr.formation.etudiant.bll.EtudiantManagerImpl;
import fr.formation.etudiant.bo.Etudiant;

@Path("/hello")
public class HelloWS {
	
	/*List<Etudiant> lst = new ArrayList<Etudiant>();
	lst.add(new Etudiant("Ferrara","Manu",18.0));
	lst.add(new Etudiant("oui","Antoine",12.0));
	lst.add(new Etudiant("non","Tudwal",10.0));*/
	
	EtudiantManagerImpl impl = new EtudiantManagerImpl();

	@Path("/simple")
	@GET
	public String hello() {
		return "Hello je suis un WS";
	}
	
	@Path("/{nom}")
	@GET
	public String helloqui(@PathParam("nom") String nom) {
		return "Hello je suis "+nom;
	}
	
	@Path("/{nom}/{age}")
	@GET
	public String helloquiage(@PathParam("nom") String nom, @PathParam("age") Integer age) {
		return "Hello je suis "+nom+" j'ai "+age+" ans";
	}
	
	@Path("/struct/{nom}/{age}")
	@GET
	public Personne helloquiageStruc(@PathParam("nom") String nom, @PathParam("age") Integer age) {
		Personne p = new Personne(nom,age);
		return p;
	}
	
	@Path("/list")
	@GET
	public List<Etudiant> list() {
		impl.add(new Etudiant("Ferrara","Manu",18.0));
		impl.add(new Etudiant("oui","Antoine",12.0));
		impl.add(new Etudiant("non","Tudwal",10.0));
		return impl.getAll();
	}
	
	@Path("/list/moyenne")
	@GET
	public double moyenne() {
		impl.add(new Etudiant("Ferrara","Manu",18.0));
		impl.add(new Etudiant("oui","Antoine",12.0));
		impl.add(new Etudiant("non","Tudwal",10.0));
	
		return impl.getMoyenne();
	}
	
	@Path("/list/meilleur")
	@GET
	public Etudiant meilleur() {
		List<Etudiant> lst = new ArrayList<Etudiant>();
		lst.add(new Etudiant("Ferrara","Manu",18.0));
		lst.add(new Etudiant("oui","Antoine",12.0));
		lst.add(new Etudiant("non","Tudwal",10.0));
		return lst.stream()
				.sorted((e1,e2)->e2.getNote().compareTo(e1.getNote()))
				.collect(Collectors.toList()).get(0);
	}
	
	@Path("/list/moinsbon")
	@GET
	public Etudiant moinsbon() {
		List<Etudiant> lst = new ArrayList<Etudiant>();
		lst.add(new Etudiant("Ferrara","Manu",18.0));
		lst.add(new Etudiant("oui","Antoine",12.0));
		lst.add(new Etudiant("non","Tudwal",10.0));
		return lst.stream()
				.sorted((e1,e2)->e1.getNote().compareTo(e2.getNote()))
				.collect(Collectors.toList()).get(0);
	}
	
	@Path("/list/rattrapage")
	@GET
	public List<Etudiant> rattrapage() {
		List<Etudiant> lst = new ArrayList<Etudiant>();
		lst.add(new Etudiant("Ferrara","Manu",18.0));
		lst.add(new Etudiant("oui","Antoine",12.0));
		lst.add(new Etudiant("non","Tudwal",10.0));
		return lst.stream()
				.filter(e->e.getNote()<10).collect(Collectors.toList());
	}
	


}
