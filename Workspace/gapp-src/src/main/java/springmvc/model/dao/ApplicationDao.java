package springmvc.model.dao;

import java.util.List;

import springmvc.model.Application;

public interface ApplicationDao {

	Application getApplications( Integer id );

	 List<Application> getApplications();

}
