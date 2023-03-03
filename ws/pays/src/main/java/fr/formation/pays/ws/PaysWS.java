package fr.formation.pays.ws;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import fr.formation.pays.bll.PaysManagerImpl;
import fr.formation.pays.bo.Pays;
import fr.formation.pays.dal.DALException;

@Path("/pays")
public class PaysWS {
	
	/*List<Etudiant> lst = new ArrayList<Etudiant>();
	lst.add(new Etudiant("Ferrara","Manu",18.0));
	lst.add(new Etudiant("oui","Antoine",12.0));
	lst.add(new Etudiant("non","Tudwal",10.0));*/
	
	PaysManagerImpl impl = new PaysManagerImpl();

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
	
	/*@Path("/struct/{nom}/{age}")
	@GET
	public Personne helloquiageStruc(@PathParam("nom") String nom, @PathParam("age") Integer age) {
		Personne p = new Personne(nom,age);
		return p;
	}*/
	
	@Path("/list")
	@GET
	public List<Pays> list() throws DALException {
		/*impl.add(new Etudiant("Ferrara","Manu",18.0));
		impl.add(new Etudiant("oui","Antoine",12.0));
		impl.add(new Etudiant("non","Tudwal",10.0));*/
		return impl.getAll();
	}
	
	@Path("/list/random")
	@GET
	public List<Pays> random() {
		return impl.random();
	}
	

}
