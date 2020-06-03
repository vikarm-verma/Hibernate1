import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {
public static void main(String [] args)
{
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	  
	SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	Session session = factory.openSession();  
	Transaction t = session.beginTransaction();  
	  
	Employee e1=new Employee();    
	e1.setId(2);    
	e1.setFirstName("Gaurav");    
	e1.setLastName("Chawla");    
	 
	session.save(e1);  
	t.commit();  
	System.out.println("successfully saved");    
	System.out.println("id is "+e1.getId()+" first name is "+e1.getFirstName()+" last name is "+e1.getLastName());
factory.close();  
session.close();     

//data base creation in my sql
//create database gniit
//use gniit
//select * from employee


}
}
