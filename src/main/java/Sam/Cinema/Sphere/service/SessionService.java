package Sam.Cinema.Sphere.service;

import Sam.Cinema.Sphere.model.Session;

import java.sql.Date;
import java.util.List;

public interface SessionService {
    public Session saveSession(Session session);
    public List<Session> getAllSes();
    public List<Session> getAllSesByDate(Date date);
    public Session getSessionById(Long id);
    public void deleteSes(Long id);
}
